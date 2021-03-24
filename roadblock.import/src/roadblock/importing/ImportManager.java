package roadblock.importing;

import roadblock.importing.sbml.SBMLImporter;
import roadblock.importing.sbol.SBOLImporter;

public class ImportManager {

	private static ImportManager instance = null;

	public static ImportManager getInstance() {

		if (instance == null) {
			instance = new ImportManager();
		}

		return instance;
	}

	public String translate(String filename, ImportType target) throws Exception {

		IModelImporter modelTranslator = getModelTranslator(target);

		return modelTranslator.translate(filename);
	}

	private IModelImporter getModelTranslator(ImportType target) {

		IModelImporter modelTranslator = null;

		switch (target) {
		case SBML:
			modelTranslator = new SBMLImporter();
			break;
		case SBOL:
			modelTranslator = new SBOLImporter();
			break;
		default:
			break;
		}

		return modelTranslator;
	}

	private ImportManager() {
	}
}
