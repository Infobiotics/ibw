package roadblock.ibw.imports;

import java.io.File;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.wizards.datatransfer.WizardFileSystemResourceImportPage1;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;

import roadblock.importing.ImportType;

@SuppressWarnings("restriction")
public class IBLImportWizardPage extends WizardFileSystemResourceImportPage1 {
	
	protected IBLImportStructureProvider iblImportStructureProvider;
	
	@Override
	protected boolean importResources(List fileSystemObjects) {
		ImportOperation operation;
		
		File sourceDirectory = getSourceDirectory();
		if (createTopLevelFolderCheckbox.getSelection() && sourceDirectory.getParentFile() != null)
			sourceDirectory = sourceDirectory.getParentFile();
			operation = new ImportOperation(getContainerFullPath(),
				sourceDirectory, iblImportStructureProvider, this, fileSystemObjects);

		operation.setContext(getShell());
		return executeImportOperation(operation);
	}
	
	public IBLImportWizardPage(IStructuredSelection selection, String title, String description, ImportType importType) {
		super(title, PlatformUI.getWorkbench(), selection);
		setTitle(title);
		setDescription(description);
		
		this.iblImportStructureProvider = new IBLImportStructureProvider(importType);
	}
}
