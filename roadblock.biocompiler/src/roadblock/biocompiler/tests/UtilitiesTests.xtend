package roadblock.biocompiler.tests
import org.junit.Test
import static org.junit.Assert.*
import roadblock.biocompiler.util.BiocompilerUtil
import static roadblock.biocompiler.tests.UtilitiesTests.*
import roadblock.biocompiler.Biocompiler
import roadblock.emf.ibl.Ibl.IblFactory
import org.eclipse.emf.ecore.util.EcoreUtil

class UtilitiesTests {
	
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
	def testRestrictionEnzymeCuts(){
		assertTrue( utils.restrictionEnzymeCuts("AAAGGGG","AAA"))
		assertFalse(utils.restrictionEnzymeCuts("TTTGGGG","AAA"))
	}
	
	@Test
	def testExactlyOneMatch(){ //counting occurences of a DNA string within another string

		assertTrue(utils.exactlyOneMatch("AAATTTGGG","AAA"))
		assertTrue(utils.exactlyOneMatch("AAATTTGGG","TGG"))
		
		assertFalse(utils.exactlyOneMatch("AAATTTGGATTG","ATT")) 	// 2 matches		
		assertFalse(utils.exactlyOneMatch("AAATTTGG","AA"))		// 2 matches, overlapping

		assertTrue( utils.exactlyOneMatch("AAATTTGGG","TTTNG"))
		assertFalse(utils.exactlyOneMatch("AAATTTGGG","TTNG")) // 2 matches: TTTG and TTGG
		// With wild cards
		val wildCard = #[ 
			#['M', 'AC'], 
			#['R', 'AG'],
			#['W', 'AT'],
			#['Y', 'CT'],
			#['S', 'CG'],
			#['K', 'GT'],
			#['H', 'ACT'],
			#['B', 'CGT'],
			#['V', 'ACG'],
			#['D', 'AGT']]
			
		for(v: wildCard){
			val doesMatch = v.get(1).toCharArray
			val doesNotMatch = 	"ATGC".toCharArray.filter[!doesMatch.contains(it)]
			
			// one match only: 1w2
			for(w: doesMatch)
					assertTrue(utils.exactlyOneMatch("XXX1" + w +"2YYY", "1" + v.get(0) + "2"))
			
			// no match
			for(w: doesNotMatch)
					assertFalse(utils.exactlyOneMatch("XXX1" + w +"2YYY", "1" + v.get(0) + "2"))
		}	
	
	}
	
	@Test
	def testChangeCodonInSequence(){
		var String sequence = 'XXXYYYZZZ'
		 
		var result = utils.changeCodonInSequence(sequence, "BBB",1)
		assertEquals("XXXBBBZZZ", result)
		
		result = utils.changeCodonInSequence(sequence, "AAA", 0)
		assertEquals("AAAYYYZZZ", result)	

		result = utils.changeCodonInSequence(sequence, "CCC", 2)
		assertEquals("XXXYYYCCC", result)	
			
	}
	
	@Test
	def testRemoveUnassignedCloningSites(){
		
		var cell = simpleDevice.biocompilerModel.cells.get(0)
		var unassignedRE = cell.devices.map[parts.filter[biologicalFunction == 'CLONINGSITE' && sequence == ''].size].reduce[a,b | a + b]
		assertEquals(3,unassignedRE)
		assertEquals(7, cell.devices.map[parts.size].reduce[a,b | a + b] as long)
		
		var cell2 = utils.removeUnassignedCloningSites(cell)
		unassignedRE = cell2.devices.map[parts.filter[biologicalFunction == 'CLONINGSITE' && sequence == ''].size].reduce[a,b | a + b]
		assertEquals(0,unassignedRE)
		assertEquals(4, cell.devices.map[parts.size].reduce[a,b | a + b] as long)
		
	}
	
	@Test
	def testSetAllCloningSitesToUnassigned(){
		var cell = simpleDevice.biocompilerModel.cells.get(0)
		cell.devices.forEach[parts.forEach[sequence = utils.randomDNA(15)]]
		
		// all RE's have a non-null sequence
		assertFalse(cell.devices.map[parts.filter[biologicalFunction == 'CLONINGSITE'].map[sequence]].flatten.join == '')
		
		var cell2 = utils.setAllCloningSitesToUnassigned(cell)
		// all RE's have an empty sequence, empty accessionURL, name as cellName/deviceName/RE_id
		assertTrue(cell.devices.map[parts.filter[biologicalFunction == 'CLONINGSITE'].map[sequence]].flatten.join == '')
		assertTrue(cell.devices.map[parts.filter[biologicalFunction == 'CLONINGSITE'].map[accessionURL]].flatten.join == '')
		var names = cell.devices.map[parts.filter[biologicalFunction == 'CLONINGSITE'].map[name]].flatten.join(', ')
		assertEquals(#['myCell/device1/RE_2','myCell/device1/RE_3','myCell/device1/RE_4'].join(', '), names)	
	}

	@Test
	def testOptimiseRBS(){
		println("Testing optimiseRBS")
		val preSequence = "CTAGGTACAGTGCTAGCTtctaga"
		val postSequence = "atggtgaatgtgaaaccagtaacgttatacgatgt"
		val rate = 550.80
		try {
			var sequence = utils.optimiseRBS(preSequence, postSequence, rate, "../roadblock.biocompiler/resources")
			println("RBS: " + sequence)
			assertTrue(true)
			assertTrue(sequence.length > 0)
		}
		catch (Exception e) {
			println("\t Problem with optimiseRBS: " + e.toString)
			assertTrue(false)
		}
	}
	
	@Test
	def testIsValidDNASequence(){
		println("Testing IsValidDNASequence")
		
		assertTrue(utils.isValidDNASequence("atgcgATGCA"))
		assertFalse(utils.isValidDNASequence("atsdf#gcgATGCA"))		
	}

}