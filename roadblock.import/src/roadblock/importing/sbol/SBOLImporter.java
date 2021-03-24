package roadblock.importing.sbol;

import org.infobiotics.sbol2ibl.sbolimportsa.Converter;

import roadblock.importing.IModelImporter;
import roadblock.importing.ImportType;

public class SBOLImporter implements IModelImporter {

	@Override
	public String translate(String sbolFilename) throws Exception {
		return Converter.SBOL2IBL(sbolFilename);
	}

	@Override
	public ImportType getTarget() {
		return ImportType.SBOL;
	}
}
