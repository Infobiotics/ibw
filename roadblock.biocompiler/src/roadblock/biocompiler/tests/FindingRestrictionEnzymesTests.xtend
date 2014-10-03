package roadblock.biocompiler.tests

import org.junit.Test
import static org.junit.Assert.*
import roadblock.biocompiler.Biocompiler

import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.ATGCCloningSites
import roadblock.biocompiler.AbortRESearch
import com.almworks.sqlite4java.SQLiteConnection
import java.io.File

class FindingRestrictionEnzymesTests {

	// helper: create a small device from a simple data model
	
	def simpleDevice(){
		// build a simple EMF model
		var iblFactory = IblFactory::eINSTANCE		
		var model = iblFactory.createModel
		model.displayName = "Testing model"
		
		var region = iblFactory.createRegion
		region.displayName = "myregion"
		model.regionList.add(region)
		
		var cell = iblFactory.createCell
		cell.displayName = "myCell"
		region.cellList.add(cell)
		
		// device 1 and its list of parts
		var device1 = iblFactory.createDevice
		device1.displayName = "device1"
		cell.deviceList.add(device1)

		for(partName :  #['p1aa','g1bb']){
			var part = iblFactory.createMolecularSpecies
			part.displayName = partName
			device1.partList.add(part)
		}
		
		var cloningSites = iblFactory.createATGCCloningSites
		cloningSites.setCloningSites(3)		
		device1.ATGCCommandList.add(cloningSites)		
		
		// the parts' declaration
		for(partProperty : #[	#['p1aa','AAA','PROMOTER'],
								#['g1bb','TTT','GENE']]){
			var part =iblFactory.createMolecularSpecies
			part => [
				displayName = partProperty.get(0)
				sequence = partProperty.get(1)
				biologicalType = partProperty.get(2)
			]
			cell.moleculeList.add(part)
		}
		
				
		// gather parts
		var biocompiler = new Biocompiler(model)
		biocompiler.gatherParts
		biocompiler.completeDevices
		biocompiler.createIntVarForAllparts
		biocompiler.constraintAllDifferent
		biocompiler.constraintNonOverlapping
		biocompiler.constraintPositionByType
		biocompiler.constraintATGCDIRECTION
				
		println("===========")
		biocompiler.findArrangement
		println("===========")
		
		return biocompiler
	}
	

	@Test
	def populatingPotentialRETableTest(){ // simple device promoter - rbs - gene - re - re - re - terminator.
		var biocompiler = simpleDevice
		var totalPotentialRE = -1
		var cell = biocompiler.biocompilerModel.cells.get(0)
		// Set all sequences to 10 X's
		cell.devices.get(0).parts.filter[biologicalFunction != "CLONINGSITE"].forEach[sequence = "XXXXXXXX"]
		biocompiler.print
		
		totalPotentialRE = biocompiler.populatingPotentialRETable('b')
		
		// all REs fit, so there should be 39 of them
		val databaseLocation = "resources/restrictionEnzymes.db"
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		var sql = db.prepare("SELECT COUNT(*) FROM PotentialRE")
		sql.step
		assertEquals(39, totalPotentialRE)
		assertEquals(39, sql.columnInt(0))
		db.dispose
			
		
		// putting 5 RE in the promoter sequence
		cell.devices.get(0).parts.filter[biologicalFunction == "PROMOTER"].forEach[sequence = "ACGCGTxTTTAAAxGAATTCxGGCCxAAGCTT"]
		totalPotentialRE = biocompiler.populatingPotentialRETable('b')
		db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		sql = db.prepare("SELECT COUNT(*) FROM PotentialRE")
		sql.step
		assertEquals(39 - 5 , totalPotentialRE)		
		assertEquals(39 - 5, sql.columnInt(0))
		db.dispose
		
		// putting 5 RE in CDS
		cell.devices.get(0).parts.filter[biologicalFunction != "CLONINGSITE"].forEach[sequence = "XXXXXXXX"]
		cell.devices.get(0).parts.filter[biologicalFunction == "GENE"].forEach[sequence = "ACGCGTxTTTAAAxGAATTCxGGCCxAAGCTT"]
		totalPotentialRE = biocompiler.populatingPotentialRETable('b')
		db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		sql = db.prepare("SELECT COUNT(*) FROM PotentialRE")
		sql.step
		assertEquals(39, totalPotentialRE)
		assertEquals(39, sql.columnInt(0))
		sql = db.prepare("SELECT COUNT(*) FROM PotentialRE WHERE fitsCDS == 0")		
		sql.step
		assertEquals(5, sql.columnInt(0))
		db.dispose
		
		// putting 5 RE in RBS
		cell.devices.get(0).parts.filter[biologicalFunction != "CLONINGSITE"].forEach[sequence = "XXXXXXXX"]		
		cell.devices.get(0).parts.filter[biologicalFunction == "RBS"].forEach[sequence = "ACGCGTxTTTAAAxGAATTCxGGCCxAAGCTT"]
		biocompiler.populatingPotentialRETable('b')
		db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		sql = db.prepare("SELECT COUNT(*) FROM PotentialRE")
		sql.step
		assertEquals(39, sql.columnInt(0))
		sql = db.prepare("SELECT COUNT(*) FROM PotentialRE WHERE fitsRBS == 0")		
		sql.step
		assertEquals(5, sql.columnInt(0))
		
		db.dispose
		
		
}

	@Test
	def noConflicts(){ // simple device promoter - rbs - gene - re - re - re - terminator, all sequences are made of 10 X's. Fitting RE are easy to find.
		var biocompiler = simpleDevice
		
		var cell = biocompiler.biocompilerModel.cells.get(0)
		// Set all sequences to 10 X's
		cell.devices.get(0).parts.filter[biologicalFunction != "CLONINGSITE"].forEach[sequence = "XXXXXXXX"]
		biocompiler.print
		
		println("Searching for RE")
		var successfulSearch = true
		try{
			biocompiler.findRE(biocompiler.biocompilerModel.cells.get(0))
		}
		catch(AbortRESearch e){
			println("Search for RE is aborted.")
			successfulSearch = false
		}
		catch(Exception e){
			e.printStackTrace
			successfulSearch = false
		}
		biocompiler.print
		
		// the search was successful
		assertTrue(successfulSearch)
		
		// all the chosen RE's don't cut
		val wholeSequence = cell.devices.get(0).parts.sortBy[position.value].map[if(Biocompiler.direction(it) == 0) Biocompiler.reverseComplement(sequence) else sequence].join
		println("Final sequence: " + wholeSequence)
		cell.devices.get(0).parts.filter[biologicalFunction == 'CLONINGSITE'].sortBy[position.value].forEach[assertTrue(Biocompiler.exactlyOneMatch(wholeSequence,it.sequence))]
	}
		
	@Test
	def RBSNeedsUpdating(){ // original RBS contains all REs so there won't be any fit. Should be fine after RBS is updated
		var biocompiler = simpleDevice
		
		var cell = biocompiler.biocompilerModel.cells.get(0)
		// Set all sequences to random String
		cell.devices.get(0).parts.filter[biologicalFunction != "CLONINGSITE"].forEach[sequence = Biocompiler.randomDNA(30).toUpperCase]
		
		// set the RBS to the whole list of RE
		val databaseLocation = "resources/restrictionEnzymes.db"
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		val sql = db.prepare("SELECT sequence FROM restrictionEnzyme")
		var allRBS= ""
		while(sql.step){
			allRBS = allRBS + sql.columnString(0)
		}
		sql.dispose
		db.dispose
		for(r: #[#['N', 'A'], #['M', 'A'], #['R', 'A'], #['W', 'A'], #['H', 'A'], #['V', 'A'], #['B', 'A'], #['D', 'A'], #['Y', 'C'], #['S', 'C'], #['K', 'G']])
			allRBS = allRBS.replace(r.get(0),r.get(1))

		for(part: cell.devices.get(0).parts.filter[biologicalFunction == "RBS"])
			part.sequence = allRBS
		
		// add start codon to CDS, necessary for RBS design
		cell.devices.get(0).parts.filter[biologicalFunction == "GENE"].forEach[sequence = 'ATG' + sequence]
		
		biocompiler.print
		
		println("Searching for RE")
		var successfulSearch = true
		try{
			biocompiler.findRE(biocompiler.biocompilerModel.cells.get(0))
		}
		catch(AbortRESearch e){
			println("Search for RE is aborted.")
			successfulSearch = false
		}
		catch(Exception e){
			e.printStackTrace
			successfulSearch = false
		}
		biocompiler.print
		
		// the search was successful
		assertTrue(successfulSearch)
		
		// all the chosen RE's don't cut
		val wholeSequence = cell.devices.get(0).parts.sortBy[position.value].map[if(Biocompiler.direction(it) == 0) Biocompiler.reverseComplement(sequence) else sequence].join
		println("Final sequence: " + wholeSequence)
		cell.devices.get(0).parts.filter[biologicalFunction == 'CLONINGSITE'].sortBy[position.value].forEach[assertTrue(Biocompiler.exactlyOneMatch(wholeSequence,it.sequence))]
		
		
	}	
		
}