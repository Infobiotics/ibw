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
import roadblock.modelchecking.translation.TranslationManager
import roadblock.modelchecking.translation.TranslationTarget
import roadblock.xtext.ibl.IblInjectorProvider
import roadblock.xtext.ibl.ibl.Model

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))
class PrismModelTranslatorTests {
	@Inject extension ParseHelper<Model>
	
	@Test
	def void testBiosensorPrismTranslation1() {
		
		testPrismTranslation("../roadblock.xtext.ibl/models/biosensor_flat_valid.ibl", "../roadblock.xtext.ibl.tests/modelTranslations/biosensor_flat_valid.pm");
	}
	
	private def testPrismTranslation(String iblModelPath, String translationPath) {
		
		val semanticModel = readFile(iblModelPath, Charset.defaultCharset()).parse
		
		val ModelBuilder modelBuilder = new ModelBuilder()
		val model = modelBuilder.populate(semanticModel)
		
		val property = PropertyCollector::instance.getAll(model).head;
		
		val flatModelManager = new FlatModelManager(model)
		val flatModelData = flatModelManager.getFlatData(property)
		
		val candidate = TranslationManager::instance.translate(flatModelData.flatModel, flatModelData.property, TranslationTarget.PRISM)
		val target = readFile(translationPath, Charset.defaultCharset())
		
		Assert::assertEquals(target, candidate)
	}
	
	def private String readFile(String path, Charset encoding)  throws IOException 
	{
		var byte[] encoded = Files.readAllBytes(Paths.get(path)) 
	 	return encoding.decode(ByteBuffer.wrap(encoded)).toString
	}
}
