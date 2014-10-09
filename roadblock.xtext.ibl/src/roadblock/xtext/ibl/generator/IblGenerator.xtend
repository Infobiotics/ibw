/*
 * generated by Xtext
 */
package roadblock.xtext.ibl.generator

import java.io.File
import java.io.FileWriter
import java.io.IOException
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.emf.ecore.xmi.util.XMLProcessor
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import roadblock.dataprocessing.flatModel.FlatModelManager
import roadblock.dataprocessing.flatModel.PropertyCollector
import roadblock.dataprocessing.model.ModelBuilder
import roadblock.emf.ibl.Ibl.FlatModelPropertyPair
import roadblock.emf.ibl.Ibl.IProperty
import roadblock.emf.ibl.Ibl.Model
import roadblock.modelchecking.ModelcheckingTarget
import roadblock.modelchecking.translation.TranslationManager 
import roadblock.biocompiler.Biocompiler
/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class IblGenerator implements IGenerator {

	private TranslationManager translationManager = TranslationManager::instance;

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

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {

		val ModelBuilder modelPopulater = new ModelBuilder();
		var Model emfModel = modelPopulater.populate(resource.allContents.filter(roadblock.xtext.ibl.ibl.Model).head)

		println()
		println("After population")
		println("===============")

		var xml = convertToXml(emfModel)
		//println(xml)
		fsa.generateFile('EMFModel.xml', xml)
		//fsa.generateFile('unitTestingGenerator.xml', 'someContent')
		
		generateTranslations(emfModel);
		
		println("biocompiler starting")
		var Biocompiler biocompiler = new Biocompiler(emfModel)
		biocompiler.gatherParts
		println("end")
	}

	def generateTranslations(Model emfModel) {

		var flatModelManager = new FlatModelManager(emfModel);
		var properties = PropertyCollector::instance.getAll(emfModel);
		var index = 0;
		
		var directoryName = System.getProperty("user.dir") + "/ibw/translations/"
		var directory = new File(directoryName);

		if (!directory.exists() && !directory.mkdirs()) {
			throw new IllegalStateException("Couldn't create dir: " + directory);
		}

		var files = directory.listFiles;
		for (File file : files) {
			file.delete();
		}

		for (IProperty property : properties) {

			var FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
			var propetyTranslation = translationManager.translate(flatData.property, ModelcheckingTarget.PRISM);
			var modelTranslation = translationManager.translate(flatData.flatModel, flatData.property, ModelcheckingTarget.PRISM);

			index = index + 1;
			var fileName = directoryName + "model#" + index + ".pm";

			writeTextFile(fileName, "//" + propetyTranslation + "\n\n" + modelTranslation);
		}

		println("*** translation files have been save to " + directory.absolutePath + " ***")
	}

	def writeTextFile(String fileName, String s) {

		var output = null as FileWriter;

		try {

			output = new FileWriter(fileName);
			output.write(s);

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (output != null) {
				try {
					output.flush();
					output.close();
					
				} catch (IOException e) {
					e.printStackTrace
				}
			}
		}
	}
}
