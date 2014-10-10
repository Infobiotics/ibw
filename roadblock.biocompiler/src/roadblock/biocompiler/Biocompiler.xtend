package roadblock.biocompiler

import java.util.UUID
import java.util.Random
import roadblock.emf.ibl.Ibl.Model
import roadblock.emf.ibl.Ibl.ATGCDirective
import org.eclipse.emf.ecore.EObject
import java.util.Date
import roadblock.emf.bioparts.Bioparts.BiopartsFactory
import roadblock.emf.bioparts.Bioparts.BiocompilerModel
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.MolecularSpecies
import roadblock.emf.ibl.Ibl.Device
import roadblock.emf.ibl.Ibl.Cell
import roadblock.emf.ibl.Ibl.Region
import java.io.IOException
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.emf.ecore.xmi.util.XMLProcessor
import org.jacop.core.Store
import org.jacop.core.IntVar
import org.jacop.core.BooleanVar
import org.jacop.constraints.Min
import org.jacop.constraints.Max
import java.util.ArrayList
import org.jacop.constraints.Alldifferent
import org.jacop.constraints.PrimitiveConstraint
import org.jacop.constraints.XltY
import org.jacop.constraints.And
import org.jacop.constraints.Or
import org.jacop.search.DepthFirstSearch
import org.jacop.search.Search
import org.jacop.search.SelectChoicePoint
import org.jacop.search.InputOrderSelect
import org.jacop.search.IndomainMin
import org.jacop.constraints.XeqC
import org.jacop.constraints.XgtY
import org.jacop.constraints.XplusCeqZ
import roadblock.emf.bioparts.Bioparts.Biopart
import roadblock.emf.ibl.Ibl.ATGCArrange
import org.sbolstandard.core.DnaComponent
import org.sbolstandard.core.DnaSequence
import org.sbolstandard.core.SBOLDocument
import org.sbolstandard.core.SBOLFactory
import org.sbolstandard.core.SequenceAnnotation
import org.sbolstandard.core.StrandType
import org.sbolstandard.core.util.SBOLPrettyWriter
import org.sbolstandard.core.util.SequenceOntology
import org.sbolstandard.core.SBOLValidationException
import org.sbolstandard.core.impl.DnaComponentImpl.DnaSequenceWrapper
import java.net.URI
import java.io.FileOutputStream
import com.almworks.sqlite4java.SQLiteConnection
import java.io.File
import roadblock.emf.ibl.Ibl.ATGCDirection
import java.net.URL
import org.apache.commons.io.IOUtils
import org.sbolstandard.core.Collection
import java.io.InputStreamReader
import java.io.BufferedReader
import roadblock.emf.ibl.Ibl.ATGCCloningSites
import roadblock.emf.bioparts.Bioparts.BiocompilerDevice
import java.util.regex.Pattern
import roadblock.emf.bioparts.Bioparts.BiocompilerCell
import java.util.List
import roadblock.biocompiler.util.BiocompilerUtil

@Data class RestrictionEnzyme {
    String name
    String sequence
    }

@Data class Interval {
    Integer x1
    Integer x2
    }

class NoArrangementFound extends Exception{}
class RBSOptimisationIssue extends Exception{}
class RBSREConflict extends Exception{}
class CDSREConflict extends Exception{}
class NoFittingRE extends Exception{
	var public List<Interval> conflictList = new ArrayList
	
	new(List<Interval> conflictList){
		this.conflictList = conflictList
	}	
}

class AbortRESearch	extends Exception{}

class Biocompiler {
	val static utils = new BiocompilerUtil

	val Model model 
	
	var biopartsFactory = BiopartsFactory::eINSTANCE
	var public biocompilerModel = biopartsFactory.createBiocompilerModel
	var public store = new Store
		
	
	var modelFactory = IblFactory::eINSTANCE
	
	new(Model emfModel){
		println(new Date())
		println("ATGC: Compiling")
		model = emfModel
	}
	
	def boolean compile(){ // the whole process
		try {
			// get explicit parts
			gatherParts
			
			// complete devices
			completeDevices 
			createIntVarForAllparts
			constraintAllDifferent
			constraintNonOverlapping
			constraintPositionByType
			constraintATGCARRANGE
			constraintATGCDIRECTION
	//		
			println("===========")
			println("Find arrangement")
			
			findArrangement // throws NoArrangementFound
			
			println("===========")
			println("Find sequences")
			lookUpSequence
			addStartCodonToCDS
			findRBSSequence
			findTerminatorSequence
			
			//findNoncuttingRestrictionEnzymes
			for(cell: biocompilerModel.cells){
				var ref = new RestrictionEnzymesFinder(cell,"b")
				var log = ref.searchRE 
	
			}
		}
		catch(NoArrangementFound e){
			// add this to the log
			println("No possible arrangement found")
			return false
		}
		catch(RBSOptimisationIssue e){
			// add this to the log
			println("Problem with the RBS calculator.")
			return false
		}
		catch(Exception e){
			// add this to the log
			println("Something when wrong. Please contact the author.")
			println("Error: " + e.message)
//			e.printStackTrace
			return false
		}
		
		return true
	}


	def gatherParts(){
		println("ATGC: gathering parts")
		for(region: model.regionList){
			println("\tregion:" + region.displayName)
			for(cell: region.cellList){
				var biocompilerCell = biopartsFactory.createBiocompilerCell
				biocompilerCell.name = cell.displayName
				println("\t\tcell: " + cell.displayName)
				for(device: cell.deviceList){	
					var biocompilerDevice = biopartsFactory.createBiocompilerDevice
					biocompilerDevice.name = device.displayName
					println("\t\t\tDevice:" + device.displayName)
					for(partName: device.partList.map[displayName]){
						println("\t\t\t\tPart: " + partName)
						//look up the part's declaration
						val part = searchFirstDeclaration(device, partName);
						// create a biopart with relevant info 
						var biopart = biopartsFactory.createBiopart
						biopart => [
							name = part.displayName
							sequence = part.sequence
							biologicalFunction = part.biologicalType
							cellName = cell.displayName
							deviceName = device.displayName
							accessionURL = part.URI
						]
						
						// add to device
						biocompilerDevice.parts.add(biopart)
					}
					// adding cloning sites if need be
					var commands = device.ATGCCommandList.filter[it.class == ATGCCloningSites]
					if(!commands.empty) {
						var n = commands.map[(it as ATGCCloningSites).cloningSites].reduce[a,b | a +b]
						if(n > 0)
							for(k: 1..n){
								var biopart = biopartsFactory.createBiopart
								biopart => [
									name = cell.displayName + "/" + device.displayName + "/RE_" + k 
									sequence = ''
									biologicalFunction = 'CLONINGSITE'
									cellName = cell.displayName
									deviceName = device.displayName
									accessionURL = null
								]
								// add to device
								biocompilerDevice.parts.add(biopart)							
							}
					}
				biocompilerCell.devices.add(biocompilerDevice)
							
			}
			biocompilerModel.cells.add(biocompilerCell)
		}
	}
	println(utils.convertToXml(biocompilerModel))

}

	def completeDevices(){
		for(cell: biocompilerModel.cells){
			for(device: cell.devices){
				// add 1 RBS per gene
				val numberOfGenes = device.parts.filter[biologicalFunction=='GENE'].size
				for(k: 1..numberOfGenes){
					var biopart = biopartsFactory.createBiopart
						biopart => [
							name = cell.name + "/" + device.name + "/rbs_" + k 
							sequence = ""
							biologicalFunction = "RBS"
							cellName = cell.name
							deviceName = device.name
							accessionURL = ""
						] 
					device.parts.add(biopart)	
				}
				
				// add 1 terminator
				var biopart = biopartsFactory.createBiopart
					biopart => [
						name = cell.name + "/" + device.name + "/terminator"
						sequence = ""
						biologicalFunction = "TERMINATOR"
						cellName = cell.name
						deviceName = device.name
						accessionURL = ""
					] 
				device.parts.add(biopart)
				

			}
			
		}
	}
	
	def createIntVarForAllparts(){
		// get the number of parts
		var partsNumber = 0
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				partsNumber = partsNumber + device.parts.size

		var count = 0;
		for(cell: biocompilerModel.cells)
		for(device: cell.devices){
			val path = cell.name + "/" + device.name + "/" 
			for(part: device.parts){
				count = count + 1
				part.position = new IntVar(store, path + part.name + "_" + count, 1, partsNumber)
			}
			
			device.direction = new BooleanVar(store, path + "direction")
			device.minPosition = new IntVar(store, path + "minPosition" , 1, partsNumber)
			device.maxPosition = new IntVar(store, path + "maxPosition" , 1, partsNumber)
			store.impose(new Min(device.parts.map[position],device.minPosition))
			store.impose(new Max(device.parts.map[position],device.maxPosition))			
		}
		
		println(utils.convertToXml(biocompilerModel))
	}
	
	def constraintAllDifferent(){
		val ArrayList<IntVar> allPartPositions = new ArrayList()
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				allPartPositions.addAll(device.parts.map[position])
		
		store.impose(new Alldifferent(allPartPositions))		
	}
	
	def constraintNonOverlapping(){
		for(cell: biocompilerModel.cells){
			val devicesNumber = cell.devices.size
			if(devicesNumber > 1){
				var ArrayList<PrimitiveConstraint> nonOverlappingConstraints = newArrayList()
				for(combination: allCombinations(devicesNumber)){
					var ArrayList<PrimitiveConstraint> configurationIndividualConstraints = newArrayList()
					for(k: 1..(devicesNumber-1)){
						val k1 = combination.get(k-1)
						val k2 = combination.get(k)
						configurationIndividualConstraints.add(new XltY(cell.devices.get(k1 - 1).maxPosition, cell.devices.get(k2 -1).minPosition))	
				}
				nonOverlappingConstraints.add(new And(configurationIndividualConstraints))
					
					
				}
				store.impose(new Or(nonOverlappingConstraints))	
			}
		}
				
	}
	
	def constraintPositionByType(){
		for(cell: biocompilerModel.cells)
		for(device: cell.devices){
			// promoter < rbs
			for(promoter: device.parts.filter[biologicalFunction == "PROMOTER"].map[position])
				for(rbs: device.parts.filter[biologicalFunction == "RBS"].map[position])
					store.impose(new Or(
						new And(new XltY(promoter,rbs), new XeqC(device.direction,1)),
						new And(new XgtY(promoter,rbs), new XeqC(device.direction,0))
						)
					)

			// contiguous RBS and GENE
			val rbsList = device.parts.filter[biologicalFunction == "RBS"].map[position]
			val geneList = device.parts.filter[biologicalFunction == "GENE"].map[position]
					
			for(k: (1..rbsList.size)){					
				store.impose(new Or(
						new And(new XplusCeqZ(rbsList.get(k-1), 1, geneList.get(k-1)), new XeqC(device.direction,1)),
						new And(new XplusCeqZ(geneList.get(k-1), 1, rbsList.get(k-1)), new XeqC(device.direction,0))
						)
					)				
			}
					
			// gene < terminator
			for(gene: device.parts.filter[biologicalFunction == "GENE"].map[position])		
				for(terminator: device.parts.filter[biologicalFunction == "TERMINATOR"].map[position])
				store.impose(new Or(
						new And(new XltY(gene,terminator), new XeqC(device.direction,1)),
						new And(new XgtY(gene,terminator), new XeqC(device.direction,0))
						)
					)
					
			// GENE < CLONING SITES
			for(gene: device.parts.filter[biologicalFunction == "GENE"].map[position])		
				for(cloningSite: device.parts.filter[biologicalFunction == "CLONINGSITE"].map[position])
				store.impose(new Or(
						new And(new XltY(gene,cloningSite), new XeqC(device.direction,1)),
						new And(new XgtY(gene,cloningSite), new XeqC(device.direction,0))
						)
					)
			
			// CLONING SITES < TERMINATOR 				
			for(cloningSite: device.parts.filter[biologicalFunction == "CLONINGSITE"].map[position])		
				for(terminator: device.parts.filter[biologicalFunction == "TERMINATOR"].map[position])
				store.impose(new Or(
						new And(new XltY(cloningSite,terminator), new XeqC(device.direction,1)),
						new And(new XgtY(cloningSite,terminator), new XeqC(device.direction,0))
						)
					)
		}
		
	}

	def findPart(String cellName, String deviceName, String partName){
		return biocompilerModel.cells.findFirst[name==cellName]?.devices.findFirst[name==deviceName]?.parts.findFirst[name==partName]
	}

	def findPart(String cellName, String partName){
		val cell = biocompilerModel.cells.findFirst[name==cellName]
		for(device: cell.devices){
			var part = device.parts.findFirst[name==partName]
			if(part != null) return part
		}
		return null
	}
	
	def findDevice(String cellName, String deviceName){
		return biocompilerModel.cells.findFirst[name==cellName]?.devices.findFirst[name==deviceName]	
	}
	
	def static direction(Biopart part){ // look up direction of containing device
	val device = part.eContainer as BiocompilerDevice
		return device.direction.value
	}
	
	def constraintATGCARRANGE(){
		for(region: model.regionList)
		for(cell: region.cellList){
			// at cell level
			for(arrange: cell.ATGCCommandList.filter[class == ATGCArrange].map[it as ATGCArrange]){
				val partList = arrange.partList.map[displayName]
				for(k: 1..(partList.length-1)){
					val part1 = findPart(cell.displayName, partList.get(k - 1))
					val part2 = findPart(cell.displayName, partList.get(k))
					store.impose(new XltY(part1.position,part2.position))
				}
			}
			for(device: cell.deviceList){
				// at device level
			for(arrange: device.ATGCCommandList.filter[class == ATGCArrange].map[it as ATGCArrange]){
				val partList = arrange.partList.map[displayName]
				for(k: 1..(partList.length-1)){
					val part1 = findPart(cell.displayName, device.displayName, partList.get(k - 1))
					val part2 = findPart(cell.displayName, device.displayName, partList.get(k))
					store.impose(new XltY(part1.position,part2.position))
				}
			}			
			}
		}
	}
	
	
		
	def constraintATGCDIRECTION(){
		for(region: model.regionList)
		for(cell: region.cellList){
			for(device: cell.deviceList){
			for(command: device.ATGCCommandList.filter[class == ATGCDirection].map[it as ATGCDirection]){
				val biocompilerDevice = findDevice(cell.displayName,device.displayName)
				println("ATGC DIRECTION: Found one in " + cell.displayName + "/" + device.displayName)
				println("\t Device in biocompilerDevice:" + biocompilerDevice)
				println("\t direction:" + command.direction)
				if(biocompilerDevice != null)
						store.impose(new XeqC(biocompilerDevice.direction, if(command.direction == 'BACKWARD') 0 else 1))
			}
			}
		}
	}

	def allCombinations(Integer n){ // produces all combinations of n items
		var combinations = newArrayList(newArrayList(1))
		
		for(k:(2..n)){
			var temp = newArrayList()
			for(c : combinations) 
				for(position: 0..c.size){
					var temp2 = newArrayList()
					temp2.addAll(c)
					temp2.add(position,k)
					temp.add(temp2)
				}			
			combinations = temp
		}
		
		combinations		
	}
	
	def findArrangement() throws NoArrangementFound {
		val ArrayList<IntVar> allPartPositions = new ArrayList()
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				allPartPositions.addAll(device.parts.map[position])
						
	// search for a solution and print results 
        var Search<IntVar> search = new DepthFirstSearch<IntVar>(); 
        var SelectChoicePoint<IntVar> select = 
            new InputOrderSelect<IntVar>(store, allPartPositions, 
                                         new IndomainMin<IntVar>()); 
        var boolean result = search.labeling(store, select); 
        
        if(!result) throw new NoArrangementFound
        
		for(cell: biocompilerModel.cells){
			// gather all parts in that cell
			val ArrayList<Biopart> allParts = new ArrayList()
			for(device: cell.devices)
				allParts.addAll(device.parts)
			println(allParts.sortBy[position.value].map[name])
		}
		
	}
	
	def lookUpSequence(){
		// look up sequences in built-in database or online database
		var ArrayList<Biopart> allParts = new ArrayList()
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				allParts.addAll(device.parts.filter[#['PROMOTER', 'GENE'].contains(biologicalFunction)])
		val builtinBiofab = 'atgc://biofab/part/'
		val builtinUser = 'atgc://user-submitted/part/'
		val partsregistry = 'http://parts.igem.org/part:'
		val ncl = 'http://sbol.ncl.ac.uk:8081/part/'
		for(part: allParts){
			if(part.sequence == null || part.sequence == ''){
				val url = part.accessionURL
				// look up sequence from URI
				switch (url){
					case url.toLowerCase.startsWith(builtinBiofab):{part.sequence = getSequenceFromDatabase(url.substring(builtinBiofab.length),'biofab')}
					case url.toLowerCase.startsWith(builtinUser):{part.sequence = getSequenceFromDatabase(url.substring(builtinUser.length),'user-submitted')}
					case url.toLowerCase.startsWith(partsregistry):{part.sequence = getSequenceFromPartsRegistry(url.substring(partsregistry.length))}
					case url.toLowerCase.startsWith(ncl):{part.sequence = getSequenceFromNCL(url.substring(ncl.length))}
					default : {part.sequence = 'Repository not found'}
				}			
			}
			else {
				part.accessionURL = 'ATGC://user-submitted/seq#' + part.sequence
			}
			
		}
	}
	
	def addStartCodonToCDS(){ // add a start codon to GENEs if not present
//	valid start codons: 'ATG' 'GTG'
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				for(part: device.parts.filter[biologicalFunction == 'GENE'])
					if(!#['ATG','GTG'].contains(part.sequence.substring(0,2).toUpperCase))
						part.sequence = 'ATG' + part.sequence
		
	}

//	def findFittingRestrictionEnzymes(BiocompilerCell cell, String suppliers){
//		// general function for finding non-cutting RE.
//		
//		val numberPotentialRE = populatingPotentialRETable(cell, suppliers)
//		
//		val numberRequested = cell.devices.map[parts.filter[biologicalFunction=='CLONINGSITE'].size].reduce[a,b | a + b]
//		
//		if(numberRequested > numberPotentialRE) throw new NotEnoughPotentialRE 
//
//
//		// fit as many as possible from the REs that fit CDS and RBS, i.e. fitsRBS=1 and fitsCDS=1
//		try {
//			//findNoncuttingRestrictionEnzymesWithNonConflictingRestrictionEnzymes(cell)
//			val databaseLocation = "resources/restrictionEnzymes.db"
//			var db = new SQLiteConnection(new File(databaseLocation))
//			if (!db.isOpen) db.open()
//			val sql = db.prepare("SELECT RE.name, RE.sequence FROM RestrictionEnzyme RE INNER JOIN PotentialRE PRE ON PRE.REid=RE.id WHERE fitsRBS=1 AND fitsCDS=1 ORDER BY LENGTH(RE.sequence)")
//			
//			for(cloningSite: cell.devices.map[parts.filter[biologicalFunction=='CLONINGSITE']].flatten){
//				val cloningSitePosition = cloningSite.position.value
////				var wholeSequence = cell.devices.map[parts.m
////				var preSequence = cell.devices.map[parts.filter[position.value < cloningSitePosition].sortBy[position.value].map[sequence].join
////				var postSequence = device.parts.filter[maxPosition < position.value ].sortBy[position.value].map[sequence].join
////				
//			}
//			
//			
//			sql.dispose
//			db.dispose
//		}
//		catch(NoFittingRE e){
//			// 
//			
//		}
//		catch(Exception e){
//			
//		}
//		// success
//		
//		// still missing some. See how many we can hope to free up with changing the RBS, i.e. fitsRBS=0 and fitsCDS=1
//		// if enough, update RBS's and try fitting REs
//		// if you can find enough, double check no new conflict have been introduced. if not, success. otherwise, resort to codon optimisation
//		// if you can't find enough, resort to codon optimisation
//		// see how many we can hope to free up, i.e. fitsCDS=1 (RBS have changed => fitsRBS no longer up-to-date)
//		// if not enough, exit failure
//		// otherwise set up minimisation problem with fitsCDS= 0 only.
//	}
	
	
	def buildWholeSequence(BiocompilerCell cell){
		var w = cell.devices.map[parts].flatten.sortBy[position.value].map[utils.finalSequence(it)].join
	}

	
//	def findNoncuttingRestrictionEnzymesWithNonConflictingRestrictionEnzymes(BiocompilerCell cell){
//		
//		for(device: cell.devices){
//			var sites = device.parts.filter[biologicalFunction == 'CLONINGSITE'].sortBy[position.value]
//			if(!sites.empty){
//				val minPosition = sites.get(0).position.value
//				val maxPosition = sites.last.position.value
//				var preSequence = device.parts.filter[position.value < minPosition].sortBy[position.value].map[sequence].join
//				var postSequence = device.parts.filter[maxPosition < position.value ].sortBy[position.value].map[sequence].join
//				
//				var nonCuttingRestrictionEnzymes = findNNoncuttingRestrictionEnzymes(sites.size,preSequence, postSequence)
//				
//				var c = 0
//				for(part: sites){		
//					part.name = nonCuttingRestrictionEnzymes.get(c).name
//					part.sequence = nonCuttingRestrictionEnzymes.get(c).sequence
//					part.accessionURL = "ATGC://REbase/RestrictionEnzyme/"+ part.name
//					c = c + 1
//				}					
//			}
//		}
//		
//	}

	
	
	def static RestrictionEnzyme findNonCuttingRestrictionEnzyme(String preSequence, String postSequence, String suppliers, ArrayList<RestrictionEnzyme> currentSelection) throws NoFittingRE {
		// find a non-cutting RE from the database to be inserted between preSequence and postSequence
		// throw NoFittingRE if none can be found
		var left = preSequence.toUpperCase
		val right = postSequence.toUpperCase
		val databaseLocation = "resources/restrictionEnzymes.db"
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		
		val sql = db.prepare("SELECT RE.name, RE.sequence FROM RestrictionEnzyme RE INNER JOIN PotentialRE PRE ON PRE.REid=RE.id WHERE fitsRBS=1 AND fitsCDS=1 ORDER BY LENGTH(RE.sequence)")
		var stillSearching = true
		var RestrictionEnzyme re 
		
		var List<Interval> conflictList = new ArrayList
		while(stillSearching && sql.step()){
			
			var name = sql.columnString(0)
			val candidate = sql.columnString(1)
			val left2 = left
			re = new RestrictionEnzyme(name, candidate)	
			// for the candidate RE to be accepted, the resulting string must contain exactly one instance of the RE, 
			// as well as exactly one instance of the previously selected RE's so far
			var nonCuttingPrevious = currentSelection?.map[utils.exactlyOneMatch(left2 + candidate + right, it.sequence)]?.reduce[a , b | a && b]

			val conflicts = utils.matchIndices((left2 + candidate + right), candidate).map[new Interval(it,it + candidate.length -1 )]
			val nonCuttingCandidate = (conflicts.size == 1)
			if(nonCuttingCandidate && (if(nonCuttingPrevious==null) true else nonCuttingPrevious))
				stillSearching = false
			else
				conflictList.addAll(conflicts.filter[it.x1 != left2.length])	// add conflict locations, remove the RE current location
		}

		// tidying up
		sql.dispose
		db.dispose

		if(stillSearching) {
			println("throwing NoFittingRE with conflictList of size " + conflictList?.size)
			throw new NoFittingRE(conflictList) // exhausted the list of RE, returns the location of the conflicts
			}
		println("\t\tOk, found one. returning it")
		return re
	}
	
	
		def findRE(BiocompilerCell cell) throws AbortRESearch {

			val maximumAttempts = 2
			var numberOfAttempts = 0
			var keepSearching = true
			var ArrayList<RestrictionEnzyme> currentSelection = newArrayList()
		// randomly shuffle the list of RE while giving linear priority to shorter sequences
//			val sql = db.prepare("SELECT name, LENGTH(sequence) FROM RestrictionEnzyme WHERE LENGTH(sequence)>cutSite ORDER BY LENGTH(sequence)*ABS(RANDOM()/9223372036854775807.0)")
		
			while(keepSearching && (numberOfAttempts <= maximumAttempts)){
				currentSelection = newArrayList // 
				numberOfAttempts = numberOfAttempts + 1
				println("Attempt #" + numberOfAttempts)
				keepSearching = false // only one pass if all goes well
				
				// set sequence of RE's to '#'
				cell.devices.map[parts.filter[biologicalFunction == 'CLONINGSITE']].flatten.forEach[sequence = '#'; accessionURL = null]

				// count the number of required REs
				val n = cell.devices.map[parts.filter[biologicalFunction == 'CLONINGSITE']].flatten.size
				
				// look for non-cutting RE
				for(cloningSite: cell.devices.map[parts.filter[biologicalFunction == 'CLONINGSITE']].flatten.sortBy[position.value]){
						println("\t Looking for a non-cutting RE for" + cloningSite.name)
						val sitePosition = cloningSite.position.value
						val preSequence  = cell.devices.map[parts.filter[position.value < sitePosition]].flatten.sortBy[position.value].map[if(it.direction == 1) sequence else utils.reverseComplement(sequence)].join
						val postSequence = cell.devices.map[parts.filter[position.value > sitePosition]].flatten.sortBy[position.value].map[if(it.direction == 1) sequence else utils.reverseComplement(sequence)].join
						try{
						val re = findNonCuttingRestrictionEnzyme(preSequence,postSequence,'.',currentSelection)
						cloningSite => [
							sequence = re.sequence
							accessionURL = "ATGC://REbase/RestrictionEnzyme/"+ re.name
							]
						currentSelection.add(re)
						}
						catch(NoFittingRE e){
							// find problematic parts
							val changeableParts = cell.devices.map[parts.filter[biologicalFunction == 'RBS']].flatten
							var  Integer[] conflictScore = newArrayOfSize(changeableParts.size)
							for(k: 1..changeableParts.size) conflictScore.set(k - 1,0)	
							
							// count number of conflicts for each part		
							for(k: 0..(changeableParts.size -1 )){
								val part = changeableParts.get(k)
								
								// check whether there is a conflict with the RE	
								for(interval: e.conflictList){
									// working out the part's location
									var x1 = 0
									var x2 = 0
									if(part.position.value < sitePosition){
										x1 = cell.devices.map[parts.filter[position.value < part.position.value]].flatten.sortBy[position.value].map[sequence].join.length
										x2 = x1 + part.sequence.length - 1									
									}
									else {
										x1 = preSequence.length  + (interval.x2 - interval.x1 + 1 ) +  cell.devices.map[parts.filter[ sitePosition < position.value &&  position.value < part.position.value]].flatten.sortBy[position.value].map[sequence].join.length
										x2 = x1 + part.sequence.length - 1
									}
									val intersection = !(( interval.x2 < x1) || (x2 < interval.x1 ))
									
									// is there a conflict?
									if(intersection){ // intervals do intersect
										conflictScore.set(k,conflictScore.get(k) + 1)
										}										
								}
							}
							// change the part with most conflicts
							val max = conflictScore.reduce[a,b | if(a<b) b else a]
							if(max==0){
								// no part change can fix the conflicts
								// throw AbortRESearch
								throw new AbortRESearch
							}
							else {
								// recompute the conflicting RBS and try again
								var index = 0
								for(k: 0..(changeableParts.size -1 ))
									if(conflictScore.get(k) == max) index = k
								// recompute RBS
								changeableParts.get(index).findSingleRBSSequence		
								// Start over
								keepSearching = true
							}								
							
						}						
				}
			}
			
		}
	
	def private  getSequenceFromDatabase(String partName, String collection){
		// pick some from the DB
		val databaseLocation = "resources/partRegistry.db"
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		
		var sql = db.prepare("SELECT sequence FROM partRegistry WHERE LOWER(name) = '"+ partName.toLowerCase +"' AND Origin ='" + collection + "'")
		
		var sequence = if(sql.step) sql.columnString(0).toLowerCase else 'part not found'
		
		// tidying up
		sql.dispose
		db.dispose		
		
		return sequence
	}

	def private static getSequenceFromPartsRegistry(String partName){
		var url = new URL('http://parts.igem.org/fasta/parts/' + partName).openStream
		var result = IOUtils.toString(url)
		IOUtils.closeQuietly(url);
		
		return result.substring(result.indexOf("\n")).replace("\n","")
	}

	def private static getSequenceFromNCL(String partName){
		var url = new URL("http://sbol.ncl.ac.uk:8081/part/"+ partName + "/sbol").openStream
		var reader = SBOLFactory.createReader
		var sbol = reader.read(url)
				
		val sequence = ((sbol?.contents?.get(0) as Collection)?.components?.get(0) as DnaComponent)?.dnaSequence?.nucleotides 
		
		return if(sequence==null) "sequence not found" else sequence
	}
	
	def findTerminatorSequence(){
		// how many needed
		var numberTerminator = 0
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				numberTerminator = numberTerminator + device.parts.filter[biologicalFunction =='TERMINATOR'].length
		
		// pick some from the DB
		val databaseLocation = "resources/partRegistry.db"
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		
		var sql = db.prepare("SELECT * FROM partRegistry WHERE BiologicalFunction=='terminator' ORDER BY RANDOM() LIMIT " + numberTerminator)
		
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				for(part: device.parts.filter[biologicalFunction =='TERMINATOR']){
					sql.step
					part.sequence = sql.columnString(3)
					part.accessionURL = 'http://roadblock.com/atgc/terminator/computerGenerated/seq#' + part.sequence
					part.name = sql.columnString(1)
				}
		
		// tidying up
		sql.dispose
		db.dispose		
		
	}
	
	def findRBSSequence(){
		// RBS is optimised by Salis' RBS calculator
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				for(part: device.parts.filter[biologicalFunction =='RBS']){
					val positionRBS = part.position.value
					val relativePosition = if(device.direction.value == 0) -1 else 1
					var preSequence  = device.parts.filter[position.value == (positionRBS - relativePosition ) ].get(0).sequence
					preSequence = preSequence.substring(preSequence.length-15)
					var postSequence = device.parts.filter[position.value == (positionRBS + relativePosition ) ].get(0).sequence.substring(0,14)
					val rate = 1000.00
					part.sequence = optimiseRBS(preSequence,postSequence, rate)
					part.accessionURL = 'ATGC://computer-generated/RBS/seq#' + part.sequence 
				}
	}
	
	def findSingleRBSSequence(Biopart part){
		val device = part.eContainer as BiocompilerDevice
		val positionRBS = part.position.value
		val relativePosition = if(device.direction.value == 0) -1 else 1
		var preSequence  = device.parts.filter[position.value == (positionRBS - relativePosition ) ].get(0).sequence
		preSequence = preSequence.substring(preSequence.length-15)
		var postSequence = device.parts.filter[position.value == (positionRBS + relativePosition ) ].get(0).sequence.substring(0,14)
		val rate = 1000.00
		part.sequence = optimiseRBS(preSequence,postSequence, rate)
		part.accessionURL = 'ATGC://computer-generated/RBS/seq#' + part.sequence 		
		
	}
	
	def static optimiseRBS(String preSequence, String postSequence, Double translationInitiationRate){
		println("RBS optimisation in process...")
		println("\tpre: "+ preSequence)
		println("\tpost: "+ postSequence)
		println("\trate: "+ translationInitiationRate)
		
		var process = new ProcessBuilder("resources/RBSCalculator/RBSDesignerWrapper.sh",preSequence, postSequence, translationInitiationRate.toString).start
//		var process = new ProcessBuilder("resources/RBSCalculator/fakeRBSCalculator.sh").start()
//		println("\t*** FAKE RBS, FOR TESTS ONLY ***")
		var is = process.getInputStream
		var is2 = process.errorStream
		var isr = new InputStreamReader(is)
		var isr2 = new InputStreamReader(is2)
		var br = new BufferedReader(isr)
		var br2 = new BufferedReader(isr2)
		var line=''

		while ((line = br2.readLine()) != null) {
		  println("RBS Calculator /  error output:" + line);
		}

		var lineNumber = 1
		var sequence = ''
		while ((line = br.readLine()) != null) {
		  if(lineNumber==2) sequence = line
		  lineNumber = lineNumber + 1
		}
		println('\t\tDone.')
		
		return sequence
	}
	
		// helper to find first declaration of variable given its displayName from local container upwards
	def MolecularSpecies searchFirstDeclaration(EObject container, String displayName) {

		// look among molecularSpecies at current level
		// return it if found
		switch (container) {
			Device: {
				val molecules = container.moleculeList.filter[it.displayName == displayName];
				if(!molecules.empty) return molecules.head
			}
			Cell: {
				val molecules = container.moleculeList.filter[it.displayName == displayName];
				if(!molecules.empty) return molecules.head
			}
			Region: {
				val molecules = container.moleculeList.filter[it.displayName == displayName];
				if(!molecules.empty) return molecules.head
			}
			roadblock.emf.ibl.Ibl.Model: { // shouldn't happen: variable would have been declared somewhere before that. Unless the validator let it through.
				var molecule = modelFactory.createMolecularSpecies
				molecule.displayName = 'UNKNOWN REFERENCE: ' + displayName
				molecule.biologicalType = 'UNKNOWN'
				return molecule
			}
		}

		// else search in next container
		return searchFirstDeclaration(container.eContainer, displayName)
	}
	
	// export biocompiler model to an SBOL document
	def SBOLDocument makeSBOLDocument(){
		var document = SBOLFactory.createDocument
		for(cell: biocompilerModel.cells){
			var dnaComponent = SBOLFactory.createDnaComponent
			dnaComponent.URI = URI.create('ATGC://' + cell.name)	
			dnaComponent => [
				description = 'Cell: '+ cell.name
				name = cell.name
				displayId = cell.name
				]
			dnaComponent.addType = URI.create('http://www.w3.org/1999/02/22-rdf-syntax-ns#')		
			// gather all parts in that cell
			val ArrayList<Biopart> allParts = new ArrayList()
			for(device: cell.devices)
				allParts.addAll(device.parts)
				
			var wholeSequence = SBOLFactory.createDnaSequence
			wholeSequence.nucleotides = allParts.sortBy[position.value].map[sequence].reduce[ a, b | a + b].toLowerCase
			wholeSequence.URI = URI.create('http://sbols.org/seq#d23749adb3a7e0e2f09168cb7267a6113b238973')
			dnaComponent.dnaSequence = wholeSequence
			
			var sequenceStart = 1
			for(part :allParts.sortBy[position.value]){
				dnaComponent.addAnnotation(makeAnnotation(part, sequenceStart, sequenceStart + part.sequence.length -1 ))
				sequenceStart = sequenceStart + part.sequence.length -1						
			}

		document.addContent(dnaComponent )		

		}
		
		return document // only export construct for the last cell for the time being
	}
	
	def void print(){
		for(cell: biocompilerModel.cells){
			println("Cell: " + cell.name)
			for(device: cell.devices){
				println("\tDevice: " + device.name)
				for(part: device.parts.sortBy[position.value])
					println("\t\t " + part.name + " ( " + part.biologicalFunction + " ) : " + part.sequence)
				
			}
			
		}
		
	}
	def private static SequenceAnnotation makeAnnotation(Biopart part, int sequenceStart, int sequenceEnd){
		var annotation = SBOLFactory.createSequenceAnnotation
		annotation.URI = URI.create("http://sbols.org/anot#" + utils.randomHashLookingString)
		annotation =>[
			bioStart = 1 //sequenceStart
			bioEnd = 4 // sequenceEnd
			strand = StrandType.POSITIVE
		]
		var dnaComponent = SBOLFactory.createDnaComponent()
		println('\t' + part.accessionURL)
		if(part.accessionURL==null || part.accessionURL == '' )
			dnaComponent.URI = URI.create("http://sbols.org/" + part.name + "/dnaComponent")
		else
			dnaComponent.URI = URI.create(part.accessionURL)
		dnaComponent =>[
			displayId = part.ID
			name = part.name ]
		
		// use the predefined SequenceOntology constant
		switch(part.biologicalFunction){
			case 'PROMOTER': dnaComponent.addType(SequenceOntology.PROMOTER)	
			case 'GENE': dnaComponent.addType(SequenceOntology.CDS)
			case 'RBS': dnaComponent.addType(SequenceOntology.type("SO_0000139"))	
			case 'TERMINATOR': dnaComponent.addType(SequenceOntology.TERMINATOR)
			default: dnaComponent.addType(URI.create("http://purl.obolibrary.org/obo/SO_0000110"))
			
		}

		annotation.setSubComponent(dnaComponent);
		return annotation;
		
	}
	
	def  makeResultPage(){
		val List<String> colours = newArrayList		
		colours.add("#A6611A")
		colours.add("#DFC27D")
		colours.add("#F5F5F5")
		colours.add("#80CDC1")
		colours.add("#018571")

		val imageNames = <String,String>newHashMap // from type+direction to image filename
		imageNames.put("promoter0","promoterReversed.png")
		imageNames.put("promoter1","promoter.png")
		imageNames.put("rbs0","rbsReversed.png")
		imageNames.put("rbs1","rbs.png")
		imageNames.put("gene0","geneReversed.png")
		imageNames.put("gene1","gene.png")
		imageNames.put("cloningsite0","cloningSiteReversed.png")
		imageNames.put("cloningsite1","cloningSite.png")
		imageNames.put("terminator0","terminatorReversed.png")
		imageNames.put("terminator1","terminator.png") 
		
		var List<String> source = newArrayList
		source.add("<HTML>")
		source.add("<BODY BGCOLOR='#FCFCF0' STYLE='font-size:12px'>")
		
		val path = 'resources/images/'
		
		
		for(cell:biocompilerModel.cells){
			source.add("<H2>Cell: " + cell.name + "</H2>")
			var col = -1
			var deviceLength = 0
			var template='''
				<TABLE cellpadding=0px cellspacing=0px >
				<TR align=center>
				«FOR device: cell.devices.sortBy[parts.get(0).position.value]»
				«{col = (col+1) % colours.size; ''}»
				«{deviceLength = device.parts.size; ''}»
				<TD COLSPAN = «deviceLength» bgcolor='«colours.get(col)»'>
				«device.name»
				</TD>
				«ENDFOR»
				</TR>
				«{col = -1; ''}»

				<TR>
				«FOR device: cell.devices.sortBy[parts.get(0).position.value]»
				«{col = (col+1) % colours.size; ''}»
				«FOR part: device.parts.sortBy[position.value]»
				<TD BGCOLOR = '«colours.get(col)»'><IMG TITLE ='«part.name»: «utils.sequenceToolTip(part.sequence)» ' SRC='«path+imageNames.get(part.biologicalFunction.toLowerCase + device.direction.value)»' BORDER=0 width=76px></TD>
				«ENDFOR»
				«ENDFOR»
				</TR>

				«{col = -1; ''}»
				<TR align=center>
				«FOR device: cell.devices.sortBy[parts.get(0).position.value]»
				«{col = (col+1) % colours.size; ''}»
				«{deviceLength = device.parts.size; ''}»
				<TD COLSPAN = «deviceLength» bgcolor='«colours.get(col)»'>
				&nbsp;
				</TD>
				«ENDFOR»
				</TR>
				
				</TABLE>
				
				«FOR device: cell.devices.sortBy[parts.get(0).position.value]»
				<h3>«device.name»</h3>
				<UL>
				«FOR part: device.parts.sortBy[position.value]»
				<LI>
				<b>«part.name»</b> («part.biologicalFunction») = «part.sequence»
				</LI>
				«ENDFOR»
				</UL>
				«ENDFOR»
				''' 
	source.add(template)
	}

	
		
		source.add("</BODY>")	
		source.add('</HTML>')
		return source.join('\n')
		
	}
	
	
	// for tests only
	def fillUpWithRandomSequences(){
		biocompilerModel.cells.forEach[devices.forEach[parts.forEach[sequence = utils.randomDNA(15)]]]	
	}
}