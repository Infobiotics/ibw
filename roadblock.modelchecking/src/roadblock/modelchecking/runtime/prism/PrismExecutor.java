package roadblock.modelchecking.runtime.prism;

import java.io.IOException;
import java.io.PrintWriter;

import roadblock.dataprocessing.flatModel.FlatModelManager;
import roadblock.emf.ibl.Ibl.FlatModelPropertyPair;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.runtime.IModelcheckingExecutor;
import roadblock.modelchecking.translation.TranslationManager;

public class PrismExecutor implements IModelcheckingExecutor<PrismConfiguration> {

	private TranslationManager translationManager = TranslationManager.getInstance();

	@Override
	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String modelTranslation = translationManager.translate(flatData.getFlatModel(), flatData.getProperty(), target);

		writeFile(filename + ".sm", modelTranslation);
	}

	@Override
	public Process verify(Model model, IProperty property, ModelcheckingTarget target, PrismConfiguration config) throws IOException {

		String verificationModelFileName = config.modelFileName + ".sm";

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);
		String modelTranslation = translationManager.translate(flatData.getFlatModel(), flatData.getProperty(), target);

		writeFile(verificationModelFileName, modelTranslation);

		String[] verificationCommand = new String[] { "prism", verificationModelFileName, "-csl", propetyTranslation, "-sim", "-simmethod", "ci",
				"-simconf", String.valueOf(config.confidence), "-simsamples", String.valueOf(config.samples), "-simpathlen",
				String.valueOf(config.pathLength) };

		// String[] verificationCommand = new String[] { "prism",
		// config.modelFileName, "-csl", propetyTranslation };
		// String[] verificationCommand = new String[] { "ping", "google.ro",
		// "-c", "10" };

		// System.out.println(verificationCommand[0] + " " +
		// verificationCommand[1] + " " + verificationCommand[2] + " \'" +
		// verificationCommand[3] + "\'");

		return Runtime.getRuntime().exec(verificationCommand);
	}

	private void writeFile(String fileName, String content) throws IOException {

		PrintWriter writer = new PrintWriter(fileName);

		writer.write(content);
		writer.flush();
		writer.close();
	}
}
