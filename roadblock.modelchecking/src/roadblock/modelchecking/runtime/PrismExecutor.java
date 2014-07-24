package roadblock.modelchecking.runtime;

import java.io.FileWriter;
import java.io.IOException;

import roadblock.dataprocessing.flatModel.FlatModelManager;
import roadblock.emf.ibl.Ibl.FlatModelPropertyPair;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.translation.TranslationManager;

public class PrismExecutor implements IModelcheckingExecutor {

	private TranslationManager translationManager = TranslationManager.getInstance();

	@Override
	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String modelTranslation = translationManager.translate(flatData.getFlatModel(), flatData.getProperty(), target);

		writeFile(filename, modelTranslation);
	}

	@Override
	public Process verify(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);
		String modelTranslation = translationManager.translate(flatData.getFlatModel(), flatData.getProperty(), target);

		writeFile(filename, modelTranslation);

		String[] verificationCommand = new String[] { "prism", filename, "-csl", propetyTranslation };
		// String[] verificationCommand = new String[] { "ping", "google.ro" };

		System.out.println(verificationCommand[0] + " " + verificationCommand[1] + " " + verificationCommand[2] + " " + verificationCommand[3]);

		return Runtime.getRuntime().exec(verificationCommand);
	}

	private void writeFile(String fileName, String content) throws IOException {

		FileWriter writer = new FileWriter(fileName);

		writer.write(content);
		writer.flush();
		writer.close();
	}
}
