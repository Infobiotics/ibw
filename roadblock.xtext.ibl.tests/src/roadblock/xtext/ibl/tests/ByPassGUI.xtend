package roadblock.xtext.ibl.tests
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
//import org.eclipse.xtext.xbase.compiler.CompilationTestCustom
import roadblock.xtext.ibl.IblInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.ByteBuffer
import org.eclipse.emf.common.util.URI
import static org.junit.Assert.*
import roadblock.biocompiler.Biocompiler
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.xml.sax.InputSource
import java.io.StringReader
import roadblock.emf.ibl.Ibl.Model
import java.io.FileWriter

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))

class ByPassGUI {
	@Inject extension CompilationTestCustom
	val filename = 'builtFromBypassGUI.html'
	
	def String buildHtml(){
		'''
		<HTML>
<FRAMESET cols = "80%,20%">
	<FRAMESET rows = "50%, 50%">
		<FRAME src = "log.html">
		<FRAME src = "results.html">
	</FRAMESET>
	<FRAME src = "identifiedParts.html">
</FRAMESET>
</HTML>'''
	}
	
	def writeTextFile(String fileName, String s) {

		var output = null as FileWriter

		try {
			output = new FileWriter(fileName)
			output.write(s)

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (output != null) {
				try {
					output.flush
					output.close
					
				} catch (IOException e) {
					e.printStackTrace
				}
			}
		}
	}	
		// read file into a string
	def static String readFile(String path, Charset encoding)  throws IOException 
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
    
	@Test 
	def void testATGCDirectives(){
		// initialise html
		writeTextFile('identifiedParts.html', "<BODY><H1>Initialisation</H1></BODY>")
		writeTextFile('log.html', "<BODY><H1>Initialisation</H1></BODY>")
		writeTextFile('results.html', "<BODY><H1>Initialisation</H1></BODY>")
		writeTextFile(filename, buildHtml)

		val source = readFile("testModels/testATGC00.ibl",Charset.defaultCharset())
		var emfModel = source.compileToString()
		var Biocompiler biocompiler = new Biocompiler(emfModel.convertToEObject as Model)
		biocompiler.gatherParts
		writeTextFile('identifiedParts.html', biocompiler.identifiedPartsHtml)
		
		var success = biocompiler.compile

		// save to html
		writeTextFile('log.html', biocompiler.makeHtmlLog)
		if(success) writeTextFile('results.html', biocompiler.makeResultPage)
		writeTextFile(filename, buildHtml)
		
		assertTrue(success)
	}
}