package roadblock.biocompiler

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.net.URI

import org.junit.Test
import static org.junit.Assert.*

import org.sbolstandard.core.DnaComponent
import org.sbolstandard.core.DnaSequence
import org.sbolstandard.core.SBOLDocument
import org.sbolstandard.core.SBOLFactory
import org.sbolstandard.core.SequenceAnnotation
import org.sbolstandard.core.StrandType
import org.sbolstandard.core.util.SBOLPrettyWriter
import org.sbolstandard.core.util.SequenceOntology
import org.sbolstandard.core.SBOLValidationException
import org.apache.commons.io.IOUtils
import java.net.URL

class ScratchSBOL {
	
@Test
def buildingOneDevice(){
		// create a document populated with some SBOL objects
		
		var document = SBOLFactory.createDocument
		
//		// DNAcomponent with all concatenated parts
//		var dnaSequence = SBOLFactory.createDnaSequence
//		dnaSequence.setURI(URI.create("http://sbols.org/seq#SOMEHASHTOBEDECIDED"))
//		dnaSequence.setNucleotides("aaagaggagaaatactagatgaaaaacataaatgccgacgacacatacagaataattaataaaattaaagcttgtagaagcaataatga"
//		                           + "tattaatcaatgcttatctgatatgactaaaatggtacattgtgaatattatttactcgcgatcatttatcctcattctatggttaaat"
//		                           + "ctgatatttcaatcctagataattaccctaaaaaatggaggcaatattatgatgacgctaatttaataaaatatgatcctatagtagat"
//		                           + "tattctaactccaatcattcaccaattaattggaatatatttgaaaacaatgctgtaaataaaaaatctccaaatgtaattaaagaagc"
//		                           + "gaaaacatcaggtcttatcactgggtttagtttccctattcatacggctaacaatggcttcggaatgcttagttttgcacattcagaaa"
//		                           + "aagacaactatatagatagtttatttttacatgcgtgtatgaacataccattaattgttccttctctagttgataattatcgaaaaata"
//		                           + "aatatagcaaataataaatcaaacaacgatttaaccaaaagagaaaaagaatgtttagcgtgggcatgcgaaggaaaaagctcttggga"
//		                           + "tatttcaaaaatattaggttgcagtgagcgtactgtcactttccatttaaccaatgcgcaaatgaaactcaatacaacaaaccgctgcc"
//		                           + "aaagtatttctaaagcaattttaacaggagcaattgattgcccatactttaaaaattaataacactgatagtgctagtgtagatcacta"
//		                           + "ctagagccaggcatcaaataaaacgaaaggctcagtcgaaagactgggcctttcgttttatctgttgtttgtcggtgaacgctctctac"
//		                           + "tagagtcacactggctcaccttcgggtgggcctttctgcgtttata")
//		                           
//		
//		var dnaComponent = SBOLFactory.createDnaComponent
//		dnaComponent.setURI(URI.create("http://partsregistry.org/Part:BBa_I0462"))
//		dnaComponent.setDisplayId("BBa_I0462")
//		dnaComponent.setName("I0462")
//		dnaComponent.setDescription("LuxR protein generator")
//		dnaComponent.setDnaSequence(dnaSequence)
//		
//		document.addContent(dnaComponent);
		
		var collection = SBOLFactory.createCollection
		
		collection => [
			description = "all solutions"
			name = 'ATGC'
			displayId = 'ATGCSolutions']
			
		collection.URI = URI.create('http://roadblock.ico2s.org/ATGC')
						
		collection.addComponent(createDnaComponent)		
		collection.addComponent(createDnaComponent)		
		
		document.addContent(collection)
				
		println("Created a new SBOL document with " + document.getContents().size() + " element(s)");

		new SBOLPrettyWriter().write(document, System.out);

		try {
			println("Validating")
			SBOLFactory.validate(document)	
			
		}
		catch (SBOLValidationException e) {
			println("Validation errors: " + e.getMessage())
			assertTrue(false)
		}	
	
		assertTrue(true)
		
		// write the contents of the document as an XML file
		SBOLFactory.write(document, new FileOutputStream('scratchSBOL.xml'));
			
	
}	
	
// Examples adapted from https://github.com/SynBioDex/libSBOLj/tree/master/examples/src/main/java/org/sbolstandard/core/examples
@Test
	def example01(){ 
		println("Create a very simple SBOL document%n%n");
		// create a DnaComponent and set some of its properties 
		var dnaComponent = SBOLFactory.createDnaComponent
		dnaComponent.setURI(URI.create("http://example.com/MyDnaComponent"));
		dnaComponent.setDisplayId("MyDnaComponent");
		dnaComponent.setName("myDNA");
		dnaComponent.setDescription("This is a very simple example");
		
		// create an empty document populated with some SBOL objects
		var SBOLDocument document = SBOLFactory.createDocument();
		// add the DnaComponent to this document
		document.addContent(dnaComponent);
		
		// write the contents of the document as an XML file to stdout
		println("Serialize the SBOL document in the official XML format:")
		SBOLFactory.write(document, System.out)
		
		// now serialize the contents into a buffer so we can read it back
		var buffer = new ByteArrayOutputStream
		SBOLFactory.write(document, buffer)
		// create a new document using the byte buffer as our input
		var SBOLDocument newDocument = SBOLFactory.read(new ByteArrayInputStream(buffer.toByteArray()));
		
		// write the contents of the new document in a more human-readable format
		println("Serialize the SBOL document in a more readable presentation format:")
		new SBOLPrettyWriter().write(newDocument, System.out)
		
		println("done.")
		assertTrue(true)
		
	}

@Test
	def example02(){
		var file = "createdBBa_I0462.xml";
		
		// create a document populated with some SBOL objects
		var document = createDocument();
		
		println("Created a new SBOL document with " + document.getContents().size() + " element(s)");
				try {
			println("Validating the document");	
			// validate the contents of the file
			SBOLFactory.validate(document);
			println("This message will never be printed since validation throws an exception");
		}
		catch (SBOLValidationException e) {
			println("Validation failed: " + e.getMessage());
		}
		// write the contents of the document as an XML file
		SBOLFactory.write(document, new FileOutputStream(file));
		
		System.out.println("Written the contents of the SBOL document to " + file);

		// read back the contents of the file
		var newDocument = SBOLFactory.read(new FileInputStream(file));
		
		// print the contents of the SBOL document in a more readable format
		println("Read back the contents of the SBOL document from " + file);

		new SBOLPrettyWriter().write(newDocument, System.out);
	}

	/**
	 * Creates a document with a single DnaComponent.
	 */
	def public static SBOLDocument createDocument() {
		var SBOLDocument document = SBOLFactory.createDocument();
		document.addContent(createDnaComponent());
		return document;
	}

	/**
	 * Creates a DnaComponent with a DnaSequence and three SequenceAnnotations.
	 */
	def public static DnaComponent createDnaComponent() {
		var dnaComponent = SBOLFactory.createDnaComponent();
		dnaComponent.setURI(URI.create("http://partsregistry.org/Part:BBa_I0462"));
		dnaComponent.setDisplayId("BBa_I0462");
		dnaComponent.setName("I0462");
		dnaComponent.setDescription("LuxR protein generator");
		dnaComponent.setDnaSequence(createDnaSequence)
		dnaComponent.addAnnotation(createAnnotation1)
		dnaComponent.addAnnotation(createAnnotation2)
		dnaComponent.addAnnotation(createAnnotation3)
		return dnaComponent;
	}

	/**
	 * Creates a DnaSequence instance.
	 */
	def public static DnaSequence createDnaSequence() {
		var dnaSequence = SBOLFactory.createDnaSequence();
		dnaSequence.setURI(URI.create("http://sbols.org/seq#d23749adb3a7e0e2f09168cb7267a6113b238973"));
		dnaSequence.setNucleotides("aaagaggagaaatactagatgaaaaacataaatgccgacgacacatacagaataattaataaaattaaagcttgtagaagcaataatga"
		                           + "tattaatcaatgcttatctgatatgactaaaatggtacattgtgaatattatttactcgcgatcatttatcctcattctatggttaaat"
		                           + "ctgatatttcaatcctagataattaccctaaaaaatggaggcaatattatgatgacgctaatttaataaaatatgatcctatagtagat"
		                           + "tattctaactccaatcattcaccaattaattggaatatatttgaaaacaatgctgtaaataaaaaatctccaaatgtaattaaagaagc"
		                           + "gaaaacatcaggtcttatcactgggtttagtttccctattcatacggctaacaatggcttcggaatgcttagttttgcacattcagaaa"
		                           + "aagacaactatatagatagtttatttttacatgcgtgtatgaacataccattaattgttccttctctagttgataattatcgaaaaata"
		                           + "aatatagcaaataataaatcaaacaacgatttaaccaaaagagaaaaagaatgtttagcgtgggcatgcgaaggaaaaagctcttggga"
		                           + "tatttcaaaaatattaggttgcagtgagcgtactgtcactttccatttaaccaatgcgcaaatgaaactcaatacaacaaaccgctgcc"
		                           + "aaagtatttctaaagcaattttaacaggagcaattgattgcccatactttaaaaattaataacactgatagtgctagtgtagatcacta"
		                           + "ctagagccaggcatcaaataaaacgaaaggctcagtcgaaagactgggcctttcgttttatctgttgtttgtcggtgaacgctctctac"
		                           + "tagagtcacactggctcaccttcgggtgggcctttctgcgtttata");

		return dnaSequence;
	}

	/**
	 * Creates the first SequenceAnnotation (ribosome entry site).
	 */
	def public static SequenceAnnotation createAnnotation1() {
		var annotation1 = SBOLFactory.createSequenceAnnotation();
		annotation1.setURI(URI.create("http://sbols.org/anot#1234567"));
		annotation1.setBioStart(1);
		annotation1.setBioEnd(12);
		annotation1.setStrand(StrandType.POSITIVE);

		var dnaComponent1 = SBOLFactory.createDnaComponent();
		dnaComponent1.setURI(URI.create("http://partsregistry.org/Part:BBa_B0034"));
		dnaComponent1.setDisplayId("BBa_B0034");
		dnaComponent1.setName("B0034");
		// there is no predefined constant for ribosome entry site so we will create the
		dnaComponent1.addType(SequenceOntology.type("SO_0000139"));

		annotation1.setSubComponent(dnaComponent1);
		return annotation1;
	}

	/**
	 * Creates the second SequenceAnnotation (CDS).
	 */
	def public static SequenceAnnotation createAnnotation2() {
		var annotation2 = SBOLFactory.createSequenceAnnotation();
		annotation2.setURI(URI.create("http://sbols.org/anot#2345678"));
		annotation2.setBioStart(19);
		annotation2.setBioEnd(774);
		annotation2.setStrand(StrandType.POSITIVE);

		var dnaComponent2 = SBOLFactory.createDnaComponent();
		dnaComponent2.setURI(URI.create("http://partsregistry.org/Part:BBa_C0062"));
		dnaComponent2.setDisplayId("BBa_C0062");
		dnaComponent2.setName("luxR");
		// use the predefined SequenceOntology constant for CDS
		dnaComponent2.addType(SequenceOntology.CDS);

		annotation2.setSubComponent(dnaComponent2);

		return annotation2;
	}

	/**
	 * Creates the third SequenceAnnotation (terminator).
	 */
	def public static SequenceAnnotation createAnnotation3() {
		var SequenceAnnotation annotation3 = SBOLFactory.createSequenceAnnotation();
		annotation3.setURI(URI.create("http://sbols.org/anot#3456789"));
		annotation3.setBioStart(808);
		annotation3.setBioEnd(936);
		annotation3.setStrand(StrandType.POSITIVE);

		var dnaComponent3 = SBOLFactory.createDnaComponent();
		dnaComponent3.setURI(URI.create("http://partsregistry.org/Part:BBa_B0015"));
		dnaComponent3.setDisplayId("BBa_B0015");
		dnaComponent3.setName("B0015");
		// use the predefined SequenceOntology constant for terminator
		dnaComponent3.addType(SequenceOntology.TERMINATOR);

		annotation3.setSubComponent(dnaComponent3);

		return annotation3;
	}
		
@Test
def Example03_Validation(){
		var file = "resources/SBOL/examples/data/BBa_I0462.xml"

		// read the BBa_I0462 example from file
		var document = SBOLFactory.read(new FileInputStream(file));

		// we know this example contains a single component so let's get it
		var  dnaComponent = document.getContents().iterator().next() as DnaComponent

		// get the first two sequence annotations
		var annotations = dnaComponent.getAnnotations();
		var annotation1 = annotations.get(0);
		var annotation2 = annotations.get(1);

		// add an invalid precedes relation (contradicts the bioStart/bioEnd values)
		println("Adding an invalid precedes relation");
		annotation2.addPrecede(annotation1);

		try {
			println("Validating the document");	
			// validate the contents of the file
			SBOLFactory.validate(document);
			println("This message will never be printed since validation throws an exception");
		}
		catch (SBOLValidationException e) {
			println("Validation failed: " + e.getMessage());
		}
		
		// now fix the error
		System.out.println("Removing the invalid precedes relation");
		annotation2.removePrecede(annotation1);
		
		// introduce a new error by adding a new dna component to the document missing the required field displayId
		System.out.println("Adding a new DNA component that does not have the required field displayId");
		var newComponent = SBOLFactory.createDnaComponent();
		newComponent.setURI(URI.create("http://example.com/annotation4"));
		document.addContent(newComponent);
		
		try {
			System.out.println("Trying to write the document contents");
			// try to serialize the file which will also trigger a validation exception
			SBOLFactory.write(document, System.out);
			System.out.println("This message will never be printed since validation throws an exception");
		}
		catch (SBOLValidationException e) {
			System.out.println("Writing failed due to validation errors: " + e.getMessage());
		}
		
		// fix the error by adding the displayId
		System.out.println("Adding the missing displayId value");
		newComponent.setDisplayId("newComponent");

		System.out.println("Validating the document");	
		SBOLFactory.validate(document);
		System.out.println("Validation successful");			
}	

@Test
	def readingURL(){
		var url = new URL("http://parts.igem.org/fasta/parts/BBa_K592009").openStream
		var result = IOUtils.toString(url)
		IOUtils.closeQuietly(url)
		println("??? " + result)
		
		result = result.substring(result.indexOf("\n")).replace("\n","")
		
		println(result)
		assertTrue(true)
	}
@Test 
	def readOnlineSBOL(){
		var url = new URL("http://sbol.ncl.ac.uk:8081/part/BO_2689/sbol").openStream
		var content = IOUtils.toString(url)
		IOUtils.closeQuietly(url)
		
		
		assertTrue(false)
	}	
}