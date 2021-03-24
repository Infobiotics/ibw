package roadblock.ibw.imports.sbml;

import org.eclipse.jface.viewers.IStructuredSelection;

import roadblock.ibw.imports.IBLImportWizardPage;
import roadblock.importing.ImportType;

public class SBMLImportWizardPage extends IBLImportWizardPage {
		
	public SBMLImportWizardPage(IStructuredSelection selection) {
		super(selection, "SBML Import Settings", "Please configure the SBML import details", ImportType.SBML);
	}
}
