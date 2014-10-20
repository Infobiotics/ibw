package roadblock.biocompiler

import roadblock.emf.bioparts.Bioparts.BiocompilerCell
import com.almworks.sqlite4java.SQLiteConnection
import java.io.File
import java.util.List
import roadblock.biocompiler.util.BiocompilerUtil
import roadblock.biocompiler.CodonOptimisationForRestrictionEnzymes
import java.util.ArrayList
import org.eclipse.emf.ecore.util.EcoreUtil

class NotEnoughFittingRE extends Exception{}

class RestrictionEnzymesFinder {

	// some constants
	val static utils = new BiocompilerUtil
	val static databaseLocation = utils.pathResources + "restrictionEnzymes.db"
	
	//	
	var BiocompilerCell cell
	var String suppliers
	var log = new HtmlLog(1000)
	
	new(BiocompilerCell cell, String suppliers){
		this.cell = cell
		this.suppliers = suppliers
		log.addText("Looking for restriction enzymes for " + cell.name)	
	}
	
	def HtmlLog searchRE(){
		val updateRBSMax = 1 // maximum number of times we allow the RBSs to be recalculated.
		var updateRBS = 0 // number of times RBSs have been recalculated

		var numberRequested = cell.devices.map[parts.filter[biologicalFunction=='CLONINGSITE'].size].reduce[a,b |a +b]
		var numberPotentialRE = populatingPotentialRETable(cell, suppliers)

		if(numberRequested == 0) {log.addText("No restriction enzymes requested."); return log }// no RE to look for
		
		if(numberRequested > numberPotentialRE) {
			// failure
			//remove empty REs
			cell = utils.removeUnassignedCloningSites(cell)
			log.addWarning('There is not enough non-cutting restriction enzymes.')
			return log
		}
		
		while(updateRBS < updateRBSMax){
			numberPotentialRE = populatingPotentialRETable(cell, suppliers)
			numberRequested = cell.devices.map[parts.filter[biologicalFunction=='CLONINGSITE'].size].reduce[a,b |a +b]
			if(findFittingRE){
				// success
				log.addText("Fitting restriction sites found.")
				return log
			}
			else{
				// update number of RE left to find
				numberRequested = cell.devices.map[parts.filter[biologicalFunction=='CLONINGSITE' && sequence!=''].size].reduce[a,b |a +b]
			
				// number of potential REs that conflict with the RBSs
				numberPotentialRE = numberOfPotentialRE("fitsRBS = 0 AND fitsCDS = 1")
				
				if(numberPotentialRE >= numberRequested){
					// there's a chance to have those RE fitting with new RBSs
					log.addWarning("Trying to fit more restriction enzymes by recomputing the RBSs.")
					// recalculate the RBSs
					for(device: cell.devices)
						for(part: device.parts.filter[biologicalFunction =='RBS']){
							val tmp = utils.optimiseRBS(part, 1000.0)
							part => [
								sequence = tmp.sequence
							 	accessionURL = tmp.accessionURL]
						}
					
					// set the RE sequences back to zero
					cell = utils.setAllCloningSitesToUnassigned(cell)
					// start over
					updateRBS = updateRBS + 1
					
				}
				else { // else even fixing the RBS won't free up enough RE. Stop trying and quit
					updateRBS = updateRBSMax
				}
			}
		}
		
		if(findFittingREWithCodonOptimisation(numberRequested)){
			// success
			log.addText("All restriction enzymes have been found.")
			return log
		}
		else{
			// failure
			// remove empty REs
			cell = utils.removeUnassignedCloningSites(cell)
			log.addWarning("There is not enough non-cutting restriction enzymes.")
			return log
		}
			
	}	
	
	def boolean findFittingREWithCodonOptimisation(Integer numberRequested){
		// build list of CDS
		var CDSList = cell.devices.map[parts.filter[biologicalFunction == 'GENE']].flatten//.map[utils.finalSequence(it)].toList
		
		// build list of restriction enzymes
		var reList = getRestrictionEnzymesList("fitsRBS = 1 AND fitsCDS = 0") // conflict with CDS only
		
		var species = "w3110"
		var cofre = new CodonOptimisationForRestrictionEnzymes(CDSList.map[utils.finalSequence(it)].toList, reList ,species)
		
		var results = cofre.findAtLeastNRestrictionEnzymes(numberRequested)
		
		val List<RestrictionEnzyme> fittingREList = results.get(0) as List<RestrictionEnzyme> 
		val List<SequenceUpdate> codonToUpdateList = results.get(1) as List<SequenceUpdate> 
		
		if(fittingREList.empty){
			// failed
			return false
		}
		else{
			// fix the codons
			for(sequenceUpdate: codonToUpdateList){
				var originalSequence = CDSList.get(sequenceUpdate.partID).sequence
				CDSList.get(sequenceUpdate.partID).sequence = utils.changeSubsequenceInSequence(originalSequence, sequenceUpdate.sequence, sequenceUpdate.location)
			}

			// set the cloning sites to the fittingREs found
			val iteratorRE = fittingREList.iterator
			cell.devices.forEach[parts.filter[biologicalFunction == 'CLONINGSITE']?.filter[sequence == ''].forEach[
				var re = iteratorRE.next
				it.sequence = re.sequence 
				it.name = re.name
				it.accessionURL = 'ATGC://' + re.name
			]]
			
			// log the affected CDS
			for(k: utils.uniqueInteger(codonToUpdateList.map[it.partID])){
				log.addWarning("Codon Optimised: " + CDSList.get(k))
			}
			return true
		}
	}
	
	
	def boolean findFittingRE(){
		// find as many fitting RE as possible that need not disrupt the original sequence (i.e. fitsRBS = 1 and fitsCDS = 1)
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		val sql = db.prepare("SELECT RE.name, RE.sequence FROM RestrictionEnzyme RE INNER JOIN PotentialRE PRE ON PRE.REid=RE.id WHERE fitsRBS=1 AND fitsCDS=1 ORDER BY LENGTH(RE.sequence)")
		var keepSearching = true
		
		try{	
			for(cloningSite: cell.devices.map[parts.filter[biologicalFunction=='CLONINGSITE']].flatten){
				val cloningSitePosition = cloningSite.position.value
				
				var preSequence  = cell.devices.map[parts.filter[position.value < cloningSitePosition]].flatten.sortBy[position.value].map[utils.finalSequence(it)].join
				var postSequence = cell.devices.map[parts.filter[position.value > cloningSitePosition]].flatten.sortBy[position.value].map[utils.finalSequence(it)].join
				keepSearching = true
	
				while(sql.step && keepSearching){
					val candidateName = sql.columnString(0)
					val candidateSequence = sql.columnString(1)
					val candidateFits = utils.exactlyOneMatch(preSequence + candidateSequence + postSequence,candidateSequence)
					if(candidateFits){
						keepSearching = false
						cloningSite => [
							sequence = candidateSequence
							name = candidateName
							accessionURL = "ATGC://REbase/RestrictionEnzyme/"+ candidateName							
						]
					}
				}
					
				if(keepSearching){
					// ran out of fitting REs. Tidy up the sql connection and throw an exception
					sql.dispose
					db.dispose
					throw new NotEnoughFittingRE					
				}			
			}
		}
		catch(NotEnoughFittingRE e){
			return false
		}
	return true			
}
	
	def static Integer populatingPotentialRETable(BiocompilerCell cell, String suppliers){
		// build a table of potential restriction enzymes, i.e. RE that don't cut on unchangeable parts and whether they cut a CDS or an RBS
		// returns the number of potential RE
		
		var List<List<Integer>> potentialRE = newArrayList()	
		val db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		db.exec("DELETE FROM PotentialRE")	
	
		var totalPotentialRE = 0
		val sql = db.prepare("SELECT id, name, sequence FROM RestrictionEnzyme WHERE LENGTH(sequence)>cutSite AND supplier LIKE '%" + suppliers + "%' ORDER BY LENGTH(sequence)*ABS(RANDOM()/9223372036854775807.0)")
		while(sql.step){
			val reid = sql.columnInt(0)
			val reName = sql.columnString(1)
			val reSequence = sql.columnString(2)
			
			var fitsRBS = 1
			var fitsCDS = 1
			var cutsSomewhereElse = false
			
			for(device: cell.devices)
				for(part: device.parts){
					var partSequence = part.sequence
					if(partSequence != null){
						if(device.direction.value == 0){ partSequence = utils.reverseComplement(partSequence)}
						if(utils.restrictionEnzymeCuts(part.sequence, reSequence))
							switch(part.biologicalFunction){
								case 'RBS':  fitsRBS = 0
								case 'GENE': fitsCDS = 0
								default : cutsSomewhereElse = true
							}
					}				
				}
			if(!cutsSomewhereElse){
				totalPotentialRE = totalPotentialRE + 1
				potentialRE.add(#[reid,fitsRBS,fitsCDS])
				}

		}
	
		potentialRE.forEach[
			db.exec("INSERT INTO PotentialRE VALUES(" + it.get(0) + "," + it.get(1) + "," + it.get(2)+ ")")	
		]
		
		db.dispose
		return totalPotentialRE
	}
	
	def Integer numberOfPotentialRE(String filter){
		val db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
	
		var sql = db.prepare("SELECT COUNT(id) as number FROM PotentialRE WHERE " + filter)	
		sql.step
		var number = sql.columnInt(0)
		sql.dispose
		db.dispose
		return number
	}
	
	def List<RestrictionEnzyme> getRestrictionEnzymesList(String filter){
		var List<RestrictionEnzyme> reList = newArrayList
		val db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
	
		var sql = db.prepare("SELECT RE.name, RE.sequence FROM RestrictionEnzyme RE INNER JOIN PotentialRE PRE ON PRE.REid=RE.id WHERE " + filter + " ORDER BY LENGTH(RE.sequence)" )	
		while(sql.step){
			reList.add(new RestrictionEnzyme(sql.columnString(0), sql.columnString(1)))
		}
		sql.dispose
		db.dispose
		
		return reList		
		
	}
	
		
}