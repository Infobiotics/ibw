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
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);

		writeModel(filename + ".smv", modelTranslation, propetyTranslation, false);
	}

	@Override
	public Process verify(Model model, IProperty property, ModelcheckingTarget target, NuSmvConfiguration config) throws IOException {

		String verificationModelFileName = config.modelFileName + ".smv";

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);
		String modelTranslation = translationManager.translate(flatData.getFlatModel(), flatData.getProperty(), target);

		writeModel(verificationModelFileName, modelTranslation, propetyTranslation, true);

		String[] verificationCommand = new String[] { "NuSMV", verificationModelFileName };

		return Runtime.getRuntime().exec(verificationCommand);
	}

	private void writeModel(String fileName, String model, String property, boolean writeProperty) throws IOException {

		FileWriter writer = new FileWriter(fileName);

		writer.write(String.format("-- The generated NuSMV model corresponding to property: SPEC %s", property));
		writer.write(System.getProperty("line.separator"));
		writer.write(System.getProperty("line.separator"));
		writer.write(model);

		if (writeProperty) {
			writer.write(System.getProperty("line.separator"));
			writer.write(System.getProperty("line.separator"));
			writer.write(String.format("SPEC %s", property));
		}
		
		writer.flush();
		writer.close();
	}
}
