package roadblock.xtext.ibl.tests

import com.google.inject.Inject
import java.io.IOException
import java.nio.ByteBuffer
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import roadblock.dataprocessing.flatModel.FlatModelManager
import roadblock.dataprocessing.flatModel.PropertyCollector
import roadblock.dataprocessing.model.ModelBuilder
import roadblock.modelchecking.ModelcheckingTarget
import roadblock.modelchecking.translation.TranslationManager
import roadblock.xtext.ibl.IblInjectorProvider
import roadblock.xtext.ibl.ibl.Model

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))
class PrismModelTranslatorTests {
	@Inject extension ParseHelper<Model>
	
	@Test
	def void testBiosensorPrismTranslationForProperty1() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_1.pm", 0);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty2() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_1.pm", 1);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty3() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_1.pm", 2);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty4() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_1.pm", 3);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty5() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_1.pm", 4);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty6() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_1.pm", 5);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty7() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_1.pm", 6);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty8() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_1.pm", 7);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty9() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_2.pm", 8);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty10() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_2.pm", 9);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty11() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_1.pm", 10);
	}
	
	@Test
	def void testBiosensorPrismTranslationForProperty12() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid_1.pm", 11);
	}
	
	private def testPrismTranslation(String iblModelPath, String translationPath, int propertyIndex) {
		
		val semanticModel = readFile(iblModelPath, Charset.defaultCharset()).parse
		
		val ModelBuilder modelBuilder = new ModelBuilder()
		val model = modelBuilder.populate(semanticModel)
		
		val property = PropertyCollector::instance.getAll(model).get(propertyIndex);
		
		val flatModelManager = new FlatModelManager(model)
		val flatModelData = flatModelManager.getFlatData(property)
		
		val candidate = TranslationManager::instance.translate(flatModelData.flatModel, flatModelData.property, ModelcheckingTarget.PRISM)
		val target = readFile(translationPath, Charset.defaultCharset())
		
		Assert::assertEquals(target, candidate)
	}
	
	def private String readFile(String path, Charset encoding)  throws IOException 
	{
		var byte[] encoded = Files.readAllBytes(Paths.get(path)) 
	 	return encoding.decode(ByteBuffer.wrap(encoded)).toString
	}
}
