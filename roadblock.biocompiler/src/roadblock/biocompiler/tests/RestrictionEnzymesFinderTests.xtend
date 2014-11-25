package roadblock.biocompiler.tests
import org.junit.Test
import static org.junit.Assert.*
import roadblock.biocompiler.Biocompiler
import roadblock.biocompiler.RestrictionEnzymesFinder
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.ATGCCloningSites
import com.almworks.sqlite4java.SQLiteConnection
import java.io.File 
import roadblock.biocompiler.util.BiocompilerUtil

class RestrictionEnzymesFinderTests {
	val static utils = new BiocompilerUtil
	
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
		
		println("first REF")
		var ref = new RestrictionEnzymesFinder(biocompiler.biocompilerModel.cells.get(0),'b','resources')
		println("populating")
		totalPotentialRE = ref.populatingPotentialRETable(cell, 'b')
		
		println("building a list of RE")
		// all REs fit, so there should be 39 of them
		val databaseLocation = "resources/db/restrictionEnzymes.db"
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		var sql = db.prepare("SELECT COUNT(*) FROM PotentialRE")
		sql.step
		assertEquals(39, totalPotentialRE)
		assertEquals(39, sql.columnInt(0))
		db.dispose
			
		
		// putting 5 RE in the promoter sequence
		cell.devices.get(0).parts.filter[biologicalFunction == "PROMOTER"].forEach[sequence = "ACGCGTxTTTAAAxGAATTCxGGCCxAAGCTT"]
		totalPotentialRE = ref.populatingPotentialRETable(cell, 'b')
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
		totalPotentialRE = ref.populatingPotentialRETable(cell, 'b')
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
		ref.populatingPotentialRETable(cell, 'b')
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

//	@Test 
//	def testNoncuttingRE(){
//		val preSequence = "AAA"
//		val postSequence = "TTT"
//		val list = findNNoncuttingRestrictionEnzymes(20,preSequence,postSequence)
//
//		val finalSequence = preSequence + list.map[sequence].join + postSequence
//
//		// none of the RE cut the final sequence
//		assertTrue(list.map[utils.exactlyOneMatch(finalSequence,it.sequence)].reduce[a , b | a && b])		
//	}

	
}