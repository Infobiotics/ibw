package roadblock.modelchecking.runtime;

import java.io.FileWriter;
import java.io.IOException;

import roadblock.dataprocessing.flatModel.FlatModelManager;
import roadblock.emf.ibl.Ibl.FlatModelPropertyPair;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.translation.TranslationManager;

public class NuSmvExecutor implements IModelcheckingExecutor {

	private TranslationManager translationManager = TranslationManager.getInstance();

	@Override
	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String modelTranslation = translationManager.translate(flatData.getFlatModel(), flatData.getProperty(), target);

		writeFile(filename + ".smv", modelTranslation);
	}

	@Override
	public Process verify(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {

		return null;
	}

	private void writeFile(String fileName, String content) throws IOException {

		FileWriter writer = new FileWriter(fileName);

		writer.write(content);
		writer.flush();
		writer.close();
	}
}
