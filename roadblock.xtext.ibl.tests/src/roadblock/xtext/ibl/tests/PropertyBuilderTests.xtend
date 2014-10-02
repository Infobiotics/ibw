package roadblock.xtext.ibl.tests

import com.google.inject.Inject
import java.io.IOException
import java.nio.ByteBuffer
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.emf.ecore.xmi.util.XMLProcessor
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import roadblock.dataprocessing.model.PropertyBuilder
import roadblock.xtext.ibl.IblInjectorProvider
import roadblock.xtext.ibl.ibl.CellBody
import roadblock.xtext.ibl.ibl.FunctionDefinition
import roadblock.xtext.ibl.ibl.Model
import roadblock.xtext.ibl.ibl.PropertyDefinition

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))
class PropertyBuilderTests {
	@Inject extension ParseHelper<Model>
	
	def private String readFile(String path, Charset encoding)  throws IOException 
	{
		var byte[] encoded = Files.readAllBytes(Paths.get(path)) 
	 	return encoding.decode(ByteBuffer.wrap(encoded)).toString
	}
	
	/*
	def private void writeFile(String path, String data, Charset encoding) {
		var byte[] binaryData = data.getBytes(encoding)
		Files.write(Paths.get("../roadblock.xtext.ibl.tests/targetSerialisations/property1.xml"), binaryData)
	}
	*/
	
	def private String convertToXml(EObject eObject) throws IOException {
		var resource = new XMLResourceImpl
		var processor = new XMLProcessor
		resource.getDefaultSaveOptions().put(XMLResourceImpl.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		resource.setEncoding("UTF-8");
		resource.contents.add(eObject);
		return processor.saveToString(resource, null);
	}

	@Test
	def void testEventuallyProperty() {
		val model = '''
			define cell typeof CELL(){
				a = MOLECULE()
				
				VERIFY [a > 0 uM] EVENTUALLY HOLDS WITHIN [100,200] s WITH PROBABILITY >= 0.9
			}
		'''.parse

		val cell = (model.members.get(0) as FunctionDefinition).functionBody as CellBody
		val propertyDefinition = cell.functionContent.members.filter(PropertyDefinition).head
		
		val propertyBuilder = new PropertyBuilder();
		
		val candidate = convertToXml(propertyBuilder.build(propertyDefinition) as EObject)
		val target = readFile("../roadblock.xtext.ibl.tests/targetSerialisations/eventuallyProperty.xml", Charset.defaultCharset()) 
		
		Assert::assertEquals(target, candidate)
	}
	
	@Test
	def void testNeverProperty() {
		val model = '''
			define cell typeof CELL(){
				a = MOLECULE()
				
				VERIFY [a > 0 pM] NEVER HOLDS
			}
		'''.parse

		val cell = (model.members.get(0) as FunctionDefinition).functionBody as CellBody
		val propertyDefinition = cell.functionContent.members.filter(PropertyDefinition).head
		
		val propertyBuilder = new PropertyBuilder();
		
		val candidate = convertToXml(propertyBuilder.build(propertyDefinition) as EObject)
		val target = readFile("../roadblock.xtext.ibl.tests/targetSerialisations/neverProperty.xml", Charset.defaultCharset()) 
		
		Assert::assertEquals(target, candidate)
	}
	
	@Test
	def void testAlwaysProperty() {
		val model = '''
			define cell typeof CELL(){
				a = MOLECULE()
				
				VERIFY [a > 0 fM] ALWAYS HOLDS
			}
		'''.parse

		val cell = (model.members.get(0) as FunctionDefinition).functionBody as CellBody
		val propertyDefinition = cell.functionContent.members.filter(PropertyDefinition).head
		
		val propertyBuilder = new PropertyBuilder();
		
		val candidate = convertToXml(propertyBuilder.build(propertyDefinition) as EObject)
		val target = readFile("../roadblock.xtext.ibl.tests/targetSerialisations/alwaysProperty.xml", Charset.defaultCharset()) 
		
		Assert::assertEquals(target, candidate)
	}
	
	@Test
	def void testSteadyStateProperty() {
		val model = '''
			define cell typeof CELL(){
				a = MOLECULE()
				
				VERIFY [a > 0 molecules] HOLDS IN STEADY-STATE
			}
		'''.parse

		val cell = (model.members.get(0) as FunctionDefinition).functionBody as CellBody
		val propertyDefinition = cell.functionContent.members.filter(PropertyDefinition).head
		
		val propertyBuilder = new PropertyBuilder();
		
		val candidate = convertToXml(propertyBuilder.build(propertyDefinition) as EObject)
		val target = readFile("../roadblock.xtext.ibl.tests/targetSerialisations/steadyStateProperty.xml", Charset.defaultCharset()) 
		
		Assert::assertEquals(target, candidate)
	}
	
	@Test
	def void testInfinitelyOftenProperty() {
		val model = '''
			define cell typeof CELL(){
				a = MOLECULE()
				
				VERIFY [a > 24 M] HOLDS INFINITELY OFTEN
			}
		'''.parse

		val cell = (model.members.get(0) as FunctionDefinition).functionBody as CellBody
		val propertyDefinition = cell.functionContent.members.filter(PropertyDefinition).head
		
		val propertyBuilder = new PropertyBuilder();
		
		val candidate = convertToXml(propertyBuilder.build(propertyDefinition) as EObject)
		val target = readFile("../roadblock.xtext.ibl.tests/targetSerialisations/infinitelyOftenProperty.xml", Charset.defaultCharset()) 
		
		Assert::assertEquals(target, candidate)
	}
	
	@Test
	def void testUntilProperty() {
		val model = '''
			define cell typeof CELL(){
				a = MOLECULE()
				b = MOLECULE()
				
				VERIFY [a > 2 fM] WILL HOLD UNTIL THEN [b > 4 uM]
			}
		'''.parse

		val cell = (model.members.get(0) as FunctionDefinition).functionBody as CellBody
		val propertyDefinition = cell.functionContent.members.filter(PropertyDefinition).head
		
		val propertyBuilder = new PropertyBuilder();
		
		val candidate = convertToXml(propertyBuilder.build(propertyDefinition) as EObject)
		val target = readFile("../roadblock.xtext.ibl.tests/targetSerialisations/untilProperty.xml", Charset.defaultCharset()) 
		
		Assert::assertEquals(target, candidate)
	}
	
	@Test
	def void testExpectedAtProperty() {
		val model = '''
			define cell typeof CELL(){
				a = MOLECULE()
				
				VERIFY EXPECTED [a] AT 200 s IS ?
			}
		'''.parse

		val cell = (model.members.get(0) as FunctionDefinition).functionBody as CellBody
		val propertyDefinition = cell.functionContent.members.filter(PropertyDefinition).head
		
		val propertyBuilder = new PropertyBuilder();
		
		val candidate = convertToXml(propertyBuilder.build(propertyDefinition) as EObject)
		val target = readFile("../roadblock.xtext.ibl.tests/targetSerialisations/expectedAtProperty.xml", Charset.defaultCharset()) 
		
		Assert::assertEquals(target, candidate)
	}
	
	@Test
	def void testExpectedWithinProperty() {
		val model = '''
			define cell typeof CELL(){
				a = MOLECULE()
				
				VERIFY EXPECTED [a] WITHIN 100 mins IS ?
			}
		'''.parse

		val cell = (model.members.get(0) as FunctionDefinition).functionBody as CellBody
		val propertyDefinition = cell.functionContent.members.filter(PropertyDefinition).head
		
		val propertyBuilder = new PropertyBuilder();
		
		val candidate = convertToXml(propertyBuilder.build(propertyDefinition) as EObject)
		val target = readFile("../roadblock.xtext.ibl.tests/targetSerialisations/expectedWithinProperty.xml", Charset.defaultCharset()) 
		
		Assert::assertEquals(target, candidate)
	}
}
