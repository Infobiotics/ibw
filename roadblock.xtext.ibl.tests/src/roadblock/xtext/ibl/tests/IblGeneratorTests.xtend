package roadblock.xtext.ibl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import roadblock.xtext.ibl.IblInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.ByteBuffer

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))

class IblGeneratorTests {
	
	@Inject extension CompilationTestHelper
	
	// read file into a string
	// from http://stackoverflow.com/questions/326390/how-to-create-a-java-string-from-the-contents-of-a-file
	// yep, 3 lines and 5 imports just to read a text file. Java.
	def static String readFile(String path, Charset encoding)  throws IOException 
	{
		var byte[] encoded = Files.readAllBytes(Paths.get(path)) 
	 	return encoding.decode(ByteBuffer.wrap(encoded)).toString
	}

	@Test
	def void testMinimalModel(){
		val source = readFile("../roadblock.xtext.ibl/models/minimalModel.ibl",Charset.defaultCharset())
		source.assertCompilesTo(readFile("../roadblock.xtext.ibl/models/minimalModel.xml",Charset.defaultCharset()))		
	}
	
	@Test
	def void testBioSensorFlat(){
		val source = readFile("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl",Charset.defaultCharset())
		source.assertCompilesTo(readFile("../roadblock.xtext.ibl/models/biosensor_flat.xml",Charset.defaultCharset()))		
	}
	
	@Test 
	def void testATGCDirectives(){
		val source = readFile("testModels/testATGC00.ibl",Charset.defaultCharset())
		source.assertCompilesTo(readFile("testModels/testATGC00.xml",Charset.defaultCharset()))
	}
}