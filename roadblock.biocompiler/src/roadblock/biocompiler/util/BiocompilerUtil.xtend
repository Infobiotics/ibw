package roadblock.biocompiler.util

import java.util.Random
import java.util.UUID
import java.util.regex.Pattern
import java.util.ArrayList
import roadblock.emf.bioparts.Bioparts.Biopart
import roadblock.emf.bioparts.Bioparts.BiocompilerDevice
import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.io.IOException
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.ByteBuffer
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.emf.common.util.URI
import java.io.StringReader
import org.xml.sax.InputSource
import org.eclipse.emf.ecore.xmi.util.XMLProcessor
import java.io.File
import java.nio.file.StandardOpenOption
import java.util.List
import roadblock.emf.bioparts.Bioparts.BiocompilerCell
import org.eclipse.emf.ecore.util.EcoreUtil
import java.io.InputStreamReader
import java.io.BufferedReader

class BiocompilerUtil {
	val static wildCard = #[ // Nucleic acid notation by the International Union of Pure and Applied Chemistry 
		#['N', 'ATGC'], 
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
		
	val public pathResources = '../roadblock.biocompiler/resources/'
	
	def randomHashLookingString(){		
		return UUID.randomUUID.toString
	}
	
	def String randomDNA(int stringLength){
		val rng = new Random
		return (1..stringLength).map["ATGC".charAt(rng.nextInt(4))].join
	}
	
	def char complement(char x){
		var char t = x
		switch(x.toString) {
			case 'A' : t = 'T'
			case 'T' : t = 'A'
			case 'G' : t = 'C'
			case 'C' : t = 'G'
			}
		return t	
	}
	
	def reverseComplement(String dna){
		return dna.toUpperCase.toCharArray.reverse.map[complement].join
		}

	def changeCodonInSequence(String sequence, String codon, Integer codonNumber){
		return sequence.substring(0,codonNumber * 3) + codon + sequence.substring((codonNumber + 1 )*3)
	}
	
	def changeSubsequenceInSequence(String sequence, String subSequence, Integer location){
		return sequence.substring(0,location) + subSequence + sequence.substring(location + subSequence.length)
	}
	
	def String sequenceToolTip(String sequence){
		if(sequence.length>12)
			return sequence.substring(0,6) +'(...)' + sequence.substring(sequence.length-6)
		return sequence
	}
		
	// 
	// part manipulation
	//
	
	def String finalSequence(Biopart part){ // return the sequence of a part. Reverse complement if necessary.
		if(part.sequence == null) return ''
		
		val containingDevice = part.eContainer as BiocompilerDevice
		if(containingDevice.direction.value == 1)
			return part.sequence
		else return reverseComplement(part.sequence)
		
	}
	
	def BiocompilerCell removeUnassignedCloningSites(BiocompilerCell cell){
		cell.devices.forEach[parts.removeAll(parts.filter[biologicalFunction == 'CLONINGSITE' && sequence == ''])]
		return cell
	}
	
	def BiocompilerCell setAllCloningSitesToUnassigned(BiocompilerCell cell){
		cell.devices.forEach[d | d.parts.filter[biologicalFunction == 'CLONINGSITE'].
			forEach[it => [
						sequence = ''; 
						accessionURL = ''; 
						name = #[cell.name, d.name, 'RE_' + d.parts.indexOf(it)].join('/')
			]]
		]
		return cell
	}
	
	// RBS Optimisation
	def Biopart optimiseRBS(Biopart part, Double rate){
		val device = part.eContainer as BiocompilerDevice
		val positionRBS = part.position.value
		val relativePosition = if(device.direction.value == 0) -1 else 1
		
		var preSequence  = device.parts.filter[position.value == (positionRBS - relativePosition ) ].get(0).sequence
		preSequence = preSequence.substring(preSequence.length-15)
		var postSequence = device.parts.filter[position.value == (positionRBS + relativePosition ) ].get(0).sequence.substring(0,14)
		
		part.sequence = optimiseRBS(preSequence,postSequence, rate)
		part.accessionURL = 'ATGC://computer-generated/RBS/seq#' + part.sequence 
				
		return part
	}
	
	def String optimiseRBS(String preSequence, String postSequence, Double translationInitiationRate){
		println("RBS optimisation in process...")
		println("\tpre: "+ preSequence)
		println("\tpost: "+ postSequence)
		println("\trate: "+ translationInitiationRate)
		
		var process = new ProcessBuilder(pathResources + "RBSCalculator/RBSDesignerWrapper.sh",preSequence, postSequence, translationInitiationRate.toString).start
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
	
		
	//	
	// utilities for Restriction enzymes
	//
	
	def boolean restrictionEnzymeCuts(String sequence, String reSequence){
			
		var pattern = reSequence.toUpperCase			

		for(v: wildCard) {
			pattern = pattern.replace(v.get(0), "[" + v.get(1) + "]")
		}
		
		return ((sequence.toUpperCase).split("(" + pattern + ")").size > 1)
	}
	
	def exactlyOneMatch(String s, String match){
			
		var pattern = match.toUpperCase			

		for(v: wildCard) {
			pattern = pattern.replace(v.get(0), "[" + v.get(1) + "]")
		}
		pattern = "(?=(" + pattern + "))"					// ?= is the look-ahead operator, for overlapping matches
		return ('x' + s.toUpperCase).split(pattern,-1).size == 2 
	}	

	def matchIndices(String s, String match){
	// returns the indices of the occurrences of match in s
			
		var pattern = match.toUpperCase			

		for(v: wildCard) {
			pattern = pattern.replace(v.get(0), "[" + v.get(1) + "]")
		}
		pattern = "(?=(" + pattern + "))"					// ?= is the look-ahead operator, for overlapping matches

		var index = Pattern.compile(pattern).matcher(s.toUpperCase) 
		
		var ArrayList<Integer> indices = new ArrayList
		while(index.find) indices.add(index.start)
		
		return indices	
	}

	// file IO
	def toFile(String filename, String content){
			
			Files.write(
				Paths.get(new File(filename).toURI), 
				content.getBytes("utf-8"), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)		
	}

	
	// read file into a string
	def String readFile(String path, Charset encoding)  throws IOException 
	{
		var byte[] encoded = Files.readAllBytes(Paths.get(path)) 
	 	return encoding.decode(ByteBuffer.wrap(encoded)).toString
	}
		 
	// from xml to EObject. Do explicitly cast after the call
	def EObject convertToEObject(String xmlString) throws IOException {
        var XMLResourceImpl resource = new XMLResourceImpl()
       	resource.setURI(URI.createURI("someURI"))
        resource.setEncoding("UTF-8")
        resource.load(new InputSource(new StringReader(xmlString)), null)
 
        return resource.getContents().get(0)
    }
    
    // export an EMF model to XML
	// via http://techblog.goelite.org/sending-emf-models-via-soap/
	def String convertToXml(EObject eObject) throws IOException {
		var resource = new XMLResourceImpl
		var processor = new XMLProcessor
		resource.getDefaultSaveOptions().put(XMLResourceImpl.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE)
		resource.setEncoding("UTF-8")
		resource.contents.add(eObject)
		return processor.saveToString(resource, null)
	}
  
  //
  	def List<Integer> uniqueInteger(List<Integer> i){
		return i.fold(<Integer>newArrayList)[a,b | if(a.contains(b)) a else {a.add(b);a}]
	}
  
    
	
}