package roadblock.ibw.imports.sbol;

import org.eclipse.jface.viewers.IStructuredSelection;

import roadblock.ibw.imports.IBLImportWizardPage;
import roadblock.importing.ImportType;

public class SBOLImportWizardPage extends IBLImportWizardPage {
		
	public SBOLImportWizardPage(IStructuredSelection selection) {
		super(selection, "SBOL Import Settings", "Please configure the SBOL import details", ImportType.SBOL);
	}
}
