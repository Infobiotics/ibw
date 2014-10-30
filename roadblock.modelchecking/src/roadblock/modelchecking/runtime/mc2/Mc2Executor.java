package roadblock.modelchecking.runtime.mc2;

import java.io.IOException;
import java.io.PrintWriter;

import roadblock.dataprocessing.flatModel.FlatModelManager;
import roadblock.emf.ibl.Ibl.FlatModelPropertyPair;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.runtime.IModelcheckingExecutor;
import roadblock.modelchecking.translation.TranslationManager;

public class Mc2Executor implements IModelcheckingExecutor<Mc2Configuration> {

	private TranslationManager translationManager = TranslationManager.getInstance();

	@Override
	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);

		writeFile(filename + ".queries", propetyTranslation);
	}

	@Override
	public Process verify(Model model, IProperty property, ModelcheckingTarget target, Mc2Configuration config) throws IOException {

		String verificationModelFileName = config.modelFileName + ".sm";

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);

		// writeFile(verificationModelFileName, modelTranslation,
		// propetyTranslation);

		String[] verificationCommand = new String[] { "prism", verificationModelFileName, "-csl", propetyTranslation, "-sim", "-simmethod" };

		// String[] verificationCommand = new String[] { "prism",
		// config.modelFileName, "-csl", propetyTranslation };
		// String[] verificationCommand = new String[] { "ping", "google.ro",
		// "-c", "10" };

		// System.out.println(verificationCommand[0] + " " +
		// verificationCommand[1] + " " + verificationCommand[2] + " \'" +
		// verificationCommand[3] + "\'");

		return Runtime.getRuntime().exec(verificationCommand);
	}

	private void writeFile(String fileName, String property) throws IOException {

		PrintWriter writer = new PrintWriter(fileName);

		writer.write(property);
		writer.flush();
		writer.close();
	}
}
