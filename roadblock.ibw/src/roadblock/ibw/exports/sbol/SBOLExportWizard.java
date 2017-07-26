package roadblock.ibw.exports.sbol;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

public class SBOLExportWizard extends Wizard implements IExportWizard {

	private SBOLExportWizardPage wizardPage;

	@Override
	public String getWindowTitle() {
		return "SBOL Export";
	}

	@Override
	public void addPages() {
		wizardPage = new SBOLExportWizardPage();
		addPage(wizardPage);
	}

	@Override
	public boolean performFinish() {

		// Call here the code to perform the SBOL export
		
		return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	public SBOLExportWizard() {
		setNeedsProgressMonitor(true);
	}
}