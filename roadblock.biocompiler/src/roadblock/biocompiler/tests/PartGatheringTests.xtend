package roadblock.biocompiler.tests

import java.nio.charset.Charset
import org.junit.Test
import roadblock.biocompiler.Biocompiler
import roadblock.biocompiler.util.BiocompilerUtil
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.IblPackage
import roadblock.emf.ibl.Ibl.Model

import static org.junit.Assert.*

class PartGatheringTests {
	val utils = new BiocompilerUtil
	
	@Test
	def void biocompilationTestATGC00(){
		// 
		val mp = IblPackage.eINSTANCE // necessary for registering the URI
		val XMLsource = utils.readFile("../roadblock.xtext.ibl.tests/testModels/testATGC00.xml",Charset.defaultCharset())
		val model = utils.convertToEObject(XMLsource) as Model
		println(model)
		var biocompiler = new Biocompiler(model)
		 
		if(biocompiler.compile){
			println("Biocompilation completed successfully.")
			for(cell: biocompiler.biocompilerModel.cells){
				println("Cell: " + cell.name)
				for(device: cell.devices){
					println("Device: " + device.name + " (direction = " + device.direction.value + ")")
					for(part: device.parts.sortBy[position.value])
						println("part:" + part.name + 
						", type:" + part.biologicalFunction + 
						", sequence:" + (if(Biocompiler.direction(part) == 0) part.sequence else utils.reverseComplement(part.sequence)) + 
						", URI:" + part.accessionURL)
				}
			}
		}
		
		else
			println("Biocompilation was unsuccessful.")
		//
		// export to SBOL
//		println("===========")
//		println("Exporting to SBOL")
		
//		val sbol = biocompiler.makeSBOLDocument
//		new SBOLPrettyWriter().write(sbol, System.out)
//		try {
//			println("Validating the document");	
//			// validate the contents of the file
//			SBOLFactory.validate(sbol);
//			println("Generated SBOL is valid. Saving.")
//			SBOLFactory.write(sbol, new FileOutputStream("afterCompilation.xml"))
//			assertTrue(true)
//			}
//		catch (SBOLValidationException e) {
//			println("Validation failed: " + e.getMessage)
//			assertTrue(false)		
//		}	
//		
		
	}
	
	@Test
	def void testLookUpSequence(){
		val mp = IblPackage.eINSTANCE // necessary for registering the URI
		val XMLsource = utils.readFile("../roadblock.xtext.ibl.tests/testModels/testSequenceLookup.xml",Charset.defaultCharset())
		val model = utils.convertToEObject(XMLsource) as Model
		var biocompiler = new Biocompiler(model)
		biocompiler.gatherParts	

		biocompiler.lookUpSequence
		
		for(cell: biocompiler.biocompilerModel.cells)
			for(device: cell.devices){
				println("cell: " + cell.name + ", device: " + device.name)
				for(part: device.parts)
					println("\t " + part.name + ": URI: " + part.accessionURL + ", seq: " + part.sequence)
				
			}
		
		
		// 	user-submitted
		var parts = biocompiler.biocompilerModel.cells.get(0).devices.get(0).parts
		assertEquals(parts.get(0).name,'puser')	
		assertEquals(parts.get(0).accessionURL,'ATGC://user-submitted/seq#AAA')
		assertEquals(parts.get(0).sequence,'AAA')	

		assertEquals(parts.get(1).name,'guser')	
		assertEquals(parts.get(1).accessionURL,'ATGC://user-submitted/seq#TTT')
		assertEquals(parts.get(1).sequence,'TTT')
		
		// DB 	
		parts = biocompiler.biocompilerModel.cells.get(0).devices.get(1).parts
		assertEquals(parts.get(0).name,'pbiofab')	
		assertEquals(parts.get(0).accessionURL,'ATGC://biofab/part/PLTETo1')
		assertEquals(parts.get(0).sequence,'tccctatcagtgatagagattgacatccctatcagtgatagagatactgagcacatcagcaggacgcactgacc')	

		assertEquals(parts.get(1).name,'gbiofab')	
		assertEquals(parts.get(1).accessionURL,'ATGC://user-submitted/part/lasr')
		assertEquals(parts.get(1).sequence,'taccggaaccaactgccaaaagaactcgaccttgcgagttcaccttttaacctcacctcgcggtaggacgtcttctaccgctcgctggaacctaagagcttctaggacaagccggacaacggattcctgtcggtcctgatgctcttgcggaagtagcagccgttgatgggccggcggaccgcgctcgtaatgctggcccgaccgatgcgcgcccagctgggctgccagtcagtgacatgggtctcgcatgacggctaaaagacccttggcaggtagatggtctgcgctttcgtcgtgctcaagaagctccttcggagccggcggccggaccacatacccgactggtacggcgacgtaccacgagcgccgcttgagccgcgcgactcggagtcgcaccttcgccttttggcccggctccggttggcaaagtacctcagccaggacggctgggacacctacgagttcctgatgcgtgacgtctcgccacggcctgaccggaagcttgtaggccagtcgtttggccaccaagactggtcggccctcttccttcacaacgtcaccacgcggtagccgttctggtcaaccctttatagccaatagacgttgacgagccttcggttacacttgaaggtataccctttataagccgccttcaagccacactggagggcggcgcatcgccggtaataccggcaattaaacccagaataatgagagact')
		
		// parts registry
		parts = biocompiler.biocompilerModel.cells.get(0).devices.get(2).parts
		assertEquals(parts.get(0).name,'ppartsregistry')	
		assertEquals(parts.get(0).accessionURL,'http://parts.igem.org/Part:BBa_I14033')
		assertEquals(parts.get(0).sequence,'ggcacgtaagaggttccaactttcaccataatgaaaca')	

		assertEquals(parts.get(1).name,'gpartsregistry')	
		assertEquals(parts.get(1).accessionURL,'http://parts.igem.org/Part:BBa_K592009')
		assertEquals(parts.get(1).sequence,'atgagtgtgatcgctaaacaaatgacctacaaggtttatatgtcaggcacggtcaatggacactactttgaggtcgaaggcgatggaaaaggtaagccctacgagggggagcagacggtaaagctcactgtcaccaagggcggacctctgccatttgcttgggatattttatcaccacagtgtcagtacggaagcataccattcaccaagtaccctgaagacatccctgactatgtaaagcagtcattcccggagggctatacatgggagaggatcatgaactttgaagatggtgcagtgtgtactgtcagcaatgattccagcatccaaggcaactgtttcatctaccatgtcaagttctctggtttgaactttcctcccaatggacctgtcatgcagaagaagacacagggctgggaacccaacactgagcgtctctttgcacgagatggaatgctgctaggaaacaactttatggctctgaagttagaaggaggcggtcactatttgtgtgaatttaaaactacttacaaggcaaagaagcctgtgaagatgccagggtatcactatgttgaccgcaaactggatgtaaccaatcacaacaaggattacacttcggttgagcagtgtgaaatttccattgcacgcaaacctgtggtcgcctaataa')
		
		// SBOL NCL
		parts = biocompiler.biocompilerModel.cells.get(0).devices.get(3).parts
		assertEquals(parts.get(0).name,'pncl')	
		assertEquals(parts.get(0).accessionURL,'http://sbol.ncl.ac.uk:8081/part/BO_2689')
		assertEquals(parts.get(0).sequence,'ggtttatattttaaaaattgagaagaatatgaatatatactataataattgtgacaacttcagcaaaggg')	

		assertEquals(parts.get(1).name,'gncl')	
		assertEquals(parts.get(1).accessionURL,'http://sbol.ncl.ac.uk:8081/part/BO_28536')
		assertEquals(parts.get(1).sequence,'atgcagtctcaaaagccgtggcttgccgagtatcccaacgatatcccgcatgagcttccgttgccgaataaaaccctgcaatccatcctgacagactccgccgcacgattccctgataaaaccgcaatatcgttttatggaaaaaaactcacctttcatgacattctgacggatgctcttaaacttgcagcttttttgcagtgcaatggcctgcaaaaaggagacagagtggctgttatgctgcccaattgcccgcaaacagtgatttcttattatggcgtcttgtttgccggtggcatcgtggtgcagacgaatccgctttataccgagcatgagcttgaataccagcttagagatgctcaggtaagtgtaatcatcaccttagatttgcttttcccgaaggcaataaaaatgaaaacgttatcaatagtcgaccagattttgataaccagtgtaaaagactatttgccttttccgaaaaatattctttacccgctgacgcaaaaacaaaaagtgcatatcgactttgacaaaacagctaacattcacacgttcgcttcctgtatgaagcaggaaaaaactgaactcctgacaatcccgaagatcgatcctgagcatgatatcgctgtcctccagtataccggaggaacaaccggagctccaaaaggggtcatgctcacgcaccaaaatattttggcaaatactgaaatgtgcgccgcttggatgtatgacgtgaaagaaggcgctgaaaaagtgctgggcatcgttccattttttcatgtctacggactgacggcagtcatgaactattcgattaaactaggcttcgaaatgattcttcttcctaagtttgatccgctcgaaacacttaaaatcatcgacaaacacaaaccgacgctctttcctggcgcaccgacaatttacattggccttttgcatcaccctgaattgcagcattatgatctgtcatccattaaaagctgtcttagcggatcagccgcgctccccgtggaggtaaagcagaaatttgaaaaggtgactggtggaaagcttgtggaaggctatggtttgtctgaggcatccccagtgacgcacgccaactttatctggggaaaaaacaagccgggcagtatcggctgtccttggccgagtacggacgctgcgatctattctgaagagacgggtgagcttgccgctccgtatgagcatggagaaatcattgtaaaaggtccgcaagtcatgaaaggatactggaataaaccagaggaaaccgccgcagtgctgagagatggctggctgttcaccggggacatgggctatatggatgaagaaggctttttctatattgctgacaggaagaaggatatcatcattgccggcggttacaatatttacccgcgtgaggtagaagaagcgctttatgaacatgaagccatccaggaaattgttgtcgcaggcgttcccgattcctacaggggagaaacagtaaaagcatttgtcgtattaaagaaaggcgcaaaagccgatacagaagaactggacgcttttgcgagatcacgtctagctccctataaggtgcccaaagcctatgagttcagaaaggagctgccgaaaacggcggtgggaaaaattttaagaaggcgtttacttgaagaagaaaccgaaaatcatcatatcaaataa')
		
	}
	
	
	@Test
	def void partsOnlyTests(){
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
		
		// device 2 and its list of parts
		var device2 = iblFactory.createDevice
		device2.displayName = "device2"
		cell.deviceList.add(device2)
		
		for(partName :  #['p2aa', 'g2bb','g2cc']){
			var part = iblFactory.createMolecularSpecies
			part.displayName = partName
			device2.partList.add(part)
		}
		
		
		// the parts' declaration
		for(partProperty : #[	#['p1aa','AAA','PROMOTER'],
								#['g1bb','TTT','GENE'],
								#['p2aa','GGG','PROMOTER'],
								#['g2bb','CCC','GENE'],
								#['g2cc','ATA','GENE']]){
			var part =iblFactory.createMolecularSpecies
			part => [
				displayName = partProperty.get(0)
				sequence = partProperty.get(1)
				biologicalType = partProperty.get(2)
			]
			cell.moleculeList.add(part)
		}
		
		
		println(utils.convertToXml(model))
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
				
		// test if correct
		assertEquals(utils.convertToXml(biocompiler.biocompilerModel),'<?xml version="1.0" encoding="UTF-8"?>
<roadblock.emf.bioparts:BiocompilerModel xmlns:roadblock.emf.bioparts="http://www.roadblock.org/bioparts.ecore">
  <cells name="myCell">
    <devices name="device1" minPosition="myCell/device1/minPosition = 1" maxPosition="myCell/device1/maxPosition = 4" direction="myCell/device1/direction=1">
      <parts sequence="AAA" name="p1aa" biologicalFunction="PROMOTER" cellName="myCell" deviceName="device1" position="myCell/device1/p1aa_1 = 1"/>
      <parts sequence="TTT" name="g1bb" biologicalFunction="GENE" cellName="myCell" deviceName="device1" position="myCell/device1/g1bb_2 = 3"/>
      <parts sequence="" name="myCell/device1/rbs_1" accessionURL="" biologicalFunction="RBS" cellName="myCell" deviceName="device1" position="myCell/device1/myCell/device1/rbs_1_3 = 2"/>
      <parts sequence="" name="myCell/device1/terminator" accessionURL="" biologicalFunction="TERMINATOR" cellName="myCell" deviceName="device1" position="myCell/device1/myCell/device1/terminator_4 = 4"/>
    </devices>
    <devices name="device2" minPosition="myCell/device2/minPosition = 5" maxPosition="myCell/device2/maxPosition = 10" direction="myCell/device2/direction=1">
      <parts sequence="GGG" name="p2aa" biologicalFunction="PROMOTER" cellName="myCell" deviceName="device2" position="myCell/device2/p2aa_5 = 5"/>
      <parts sequence="CCC" name="g2bb" biologicalFunction="GENE" cellName="myCell" deviceName="device2" position="myCell/device2/g2bb_6 = 7"/>
      <parts sequence="ATA" name="g2cc" biologicalFunction="GENE" cellName="myCell" deviceName="device2" position="myCell/device2/g2cc_7 = 9"/>
      <parts sequence="" name="myCell/device2/rbs_1" accessionURL="" biologicalFunction="RBS" cellName="myCell" deviceName="device2" position="myCell/device2/myCell/device2/rbs_1_8 = 6"/>
      <parts sequence="" name="myCell/device2/rbs_2" accessionURL="" biologicalFunction="RBS" cellName="myCell" deviceName="device2" position="myCell/device2/myCell/device2/rbs_2_9 = 8"/>
      <parts sequence="" name="myCell/device2/terminator" accessionURL="" biologicalFunction="TERMINATOR" cellName="myCell" deviceName="device2" position="myCell/device2/myCell/device2/terminator_10 = 10"/>
    </devices>
  </cells>
</roadblock.emf.bioparts:BiocompilerModel>
')
	}
	
	@Test
	def testOptimiseRBS(){
		println("Testing optimiseRBS")
		val preSequence = "CTAGGTACAGTGCTAGCTtctaga"
		val postSequence = "atggtgaatgtgaaaccagtaacgttatacgatgt"
		val rate = 550.80
		try {
			var sequence = Biocompiler.optimiseRBS(preSequence, postSequence, rate)
			println("RBS: " + sequence)
			assertTrue(true)
			assertTrue(sequence.length > 0)
		}
		catch (Exception e) {
			println("\t Problem with optimiseRBS: " + e.toString)
			assertTrue(false)
		}
	}
}