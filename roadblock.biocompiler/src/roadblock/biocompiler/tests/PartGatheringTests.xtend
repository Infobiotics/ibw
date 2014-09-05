package roadblock.biocompiler.tests

import org.junit.Test
import static org.junit.Assert.*
import roadblock.biocompiler.Biocompiler
import roadblock.emf.ibl.Ibl.IblFactory
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.emf.ecore.xmi.util.XMLProcessor
import java.io.IOException
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.ByteBuffer
import java.io.StringReader
import org.xml.sax.InputSource
import roadblock.emf.ibl.Ibl.Model
import org.eclipse.emf.common.util.URI
import roadblock.emf.ibl.Ibl.IblPackage
import org.sbolstandard.core.util.SBOLPrettyWriter
import org.sbolstandard.core.SBOLFactory
import java.io.FileOutputStream
import org.sbolstandard.core.SBOLValidationException

import org.apache.commons.io.IOUtils
import java.net.URL;

class PartGatheringTests {
	
	// export an EMF model to XML
	// via http://techblog.goelite.org/sending-emf-models-via-soap/
	def public static String convertToXml(EObject eObject) throws IOException {
		var resource = new XMLResourceImpl
		var processor = new XMLProcessor
		resource.getDefaultSaveOptions().put(XMLResourceImpl.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		resource.setEncoding("UTF-8");
		resource.contents.add(eObject);
		return processor.saveToString(resource, null);
	}
	
    def EObject convertToEObject(String xmlString) throws IOException {
        var XMLResourceImpl resource = new XMLResourceImpl();
       	resource.setURI(URI.createURI("someURI"))
        resource.setEncoding("UTF-8");
        resource.load(new InputSource(new StringReader(xmlString)), null);
 
        return resource.getContents().get(0);
    }
	
	// read file into a string
	// from http://stackoverflow.com/questions/326390/how-to-create-a-java-string-from-the-contents-of-a-file
	// yep, 3 lines and 5 imports just to read a text file. Java.
	def static String readFile(String path, Charset encoding)  throws IOException 
	{
		var byte[] encoded = Files.readAllBytes(Paths.get(path)) 
	 	return encoding.decode(ByteBuffer.wrap(encoded)).toString
	}
	
	@Test
	def void biocompilationTestATGC00(){
		// 
		val mp = IblPackage.eINSTANCE // necessary for registering the URI
		val XMLsource = readFile("../roadblock.xtext.ibl.tests/testModels/testATGC00.xml",Charset.defaultCharset())
		val model = convertToEObject(XMLsource) as Model
		println(model)
		var biocompiler = new Biocompiler(model)
		biocompiler.gatherParts
		biocompiler.completeDevices
		biocompiler.createIntVarForAllparts
		biocompiler.constraintAllDifferent
		biocompiler.constraintNonOverlapping
		biocompiler.constraintPositionByType
		biocompiler.constraintARRANGE
		biocompiler.constraintDirection
//		
		println("===========")
		println("Find arrangement")
		
		biocompiler.findArrangement
		
		println("===========")
		println("Find sequences")
		biocompiler.findRBSSequence
		biocompiler.findTerminatorSequence
		
		for(cell: biocompiler.biocompilerModel.cells){
			println("Cell: " + cell.name)
			for(device: cell.devices){
				println("Device: " + device.name)
				for(part: device.parts.sortBy[position.value])
					println("part:" + part.name + ", type:" + part.biologicalFunction + ", sequence:" + part.sequence + ", URI:" + part.accessionURL)
			}
		}
		//
		// export to SBOL
		println("===========")
		println("Exporting to SBOL")
		
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
		val XMLsource = readFile("../roadblock.xtext.ibl.tests/testModels/testSequenceLookup.xml",Charset.defaultCharset())
		val model = convertToEObject(XMLsource) as Model
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
		assertEquals(parts.get(0).sequence,'')	

		assertEquals(parts.get(1).name,'gncl')	
		assertEquals(parts.get(1).accessionURL,'http://sbol.ncl.ac.uk:8081/part/BO_28536')
		assertEquals(parts.get(1).sequence,'')
		
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
		
		
		println(convertToXml(model))
		// gather parts
		var biocompiler = new Biocompiler(model)
		biocompiler.gatherParts
		biocompiler.completeDevices
		biocompiler.createIntVarForAllparts
		biocompiler.constraintAllDifferent
		biocompiler.constraintNonOverlapping
		biocompiler.constraintPositionByType
		biocompiler.constraintDirection
		
		println("===========")
		biocompiler.findArrangement
		println("===========")
				
		// test if correct
		assertEquals(convertToXml(biocompiler.biocompilerModel),'<?xml version="1.0" encoding="UTF-8"?>
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
}