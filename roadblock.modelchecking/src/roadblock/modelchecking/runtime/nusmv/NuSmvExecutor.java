package roadblock.modelchecking.runtime.nusmv;

import java.io.FileWriter;
import java.io.IOException;

import roadblock.dataprocessing.flatModel.FlatModelManager;
import roadblock.emf.ibl.Ibl.FlatModelPropertyPair;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.runtime.IModelcheckingExecutor;
import roadblock.modelchecking.translation.TranslationManager;

public class NuSmvExecutor implements IModelcheckingExecutor<NuSmvConfiguration> {

	private TranslationManager translationManager = TranslationManager.getInstance();

	@Override
	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String modelTranslation = translationManager.translate(flatData.getFlatModel(), flatData.getProperty(), target);

		writeFile(filename + ".smv", modelTranslation);
	}

	@Override
	public Process verify(Model model, IProperty property, ModelcheckingTarget target, NuSmvConfiguration config) throws IOException {

		String verificationModelFileName = config.modelFileName + ".smv";

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);
		String modelTranslation = translationManager.translate(flatData.getFlatModel(), flatData.getProperty(), target);

		writeFile(verificationModelFileName, modelTranslation, propetyTranslation);

		String[] verificationCommand = new String[] { "NuSMV", verificationModelFileName };
		
		return Runtime.getRuntime().exec(verificationCommand);
	}

	private void writeFile(String fileName, String model) throws IOException {

		FileWriter writer = new FileWriter(fileName);

		writer.write(model);
		writer.flush();
		writer.close();
	}
	
	private void writeFile(String fileName, String model, String property) throws IOException {

		FileWriter writer = new FileWriter(fileName);

		writer.write(model);
		writer.write(System.getProperty("line.separator"));
		writer.write(System.getProperty("line.separator"));
		writer.write(String.format("SPEC %s", property));
		writer.flush();
		writer.close();
	}
}
