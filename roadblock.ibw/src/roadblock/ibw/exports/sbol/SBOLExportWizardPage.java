package roadblock.ibw.exports.sbol;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;

public class SBOLExportWizardPage extends WizardPage {

	private String exportFilePath;

	private Composite container;

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;

		Button fileDialogButton = new Button(container, SWT.PUSH);
		fileDialogButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		fileDialogButton.setText("Select path...");
		final Text exportFileWidget = new Text(container, SWT.BORDER);
		exportFileWidget.setEnabled(false);
		exportFileWidget.setText("");
		exportFileWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		final FileDialog directoryDialog = new FileDialog(container.getShell());
		fileDialogButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				exportFilePath = directoryDialog.open();
				exportFileWidget.setText(exportFilePath);
				setPageComplete(true);
			}
		});

		// required to avoid an error in the system
		setControl(container);
		setPageComplete(false);
	}

	public String getExportFilePath() {
		return exportFilePath;
	}

	public SBOLExportWizardPage() {
		super("SBOL Export Settings");
		setTitle("SBOL Export Settings");
		setDescription("Please configure the details of the SBOL export");
	}
}
