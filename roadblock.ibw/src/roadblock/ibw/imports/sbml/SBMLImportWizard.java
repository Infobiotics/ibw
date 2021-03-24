package roadblock.ibw.imports.sbml;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;

@SuppressWarnings("restriction")
public class SBMLImportWizard extends Wizard implements IImportWizard {

	private IStructuredSelection selection;
	private SBMLImportWizardPage wizardPage;

	@Override
	public String getWindowTitle() {
		return "SBML Import";
	}

	@Override
	public void addPages() {
		wizardPage = new SBMLImportWizardPage(selection);
		addPage(wizardPage);
	}

	@Override
	public boolean performFinish() {
		return wizardPage.finish();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		this.selection = currentSelection;

		List<?> selectedResources = IDE.computeSelectedResources(currentSelection);
		if (!selectedResources.isEmpty()) {
			this.selection = new StructuredSelection(selectedResources);
		}

		setWindowTitle(DataTransferMessages.DataTransfer_export);
		setNeedsProgressMonitor(true);
	}
}