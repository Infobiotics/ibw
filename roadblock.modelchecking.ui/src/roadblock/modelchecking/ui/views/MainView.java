package roadblock.modelchecking.ui.views;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.runtime.VerificationManager;
import roadblock.modelchecking.ui.Activator;
import roadblock.modelchecking.ui.components.IblLabelProvider;
import roadblock.modelchecking.ui.components.IblTreeContentProvider;
import roadblock.modelchecking.ui.model.Configuration;
import roadblock.modelchecking.ui.util.ConfigurationUtil;
import roadblock.modelchecking.ui.util.ModelcheckingUtil;

public class MainView extends ViewPart implements IPartListener2 {

	public static final String ID = "roadblock.modelchecking.ui.views.mainView";

	private Model model;
	private Configuration config;
	private XtextResource currentIblResource;

	private MessageConsole verificationConsole;

	private CheckboxTreeViewer propertyTreeViewer;
	private Text modelFile;
	private Text dataFile;
	private Combo modelChecker;
	private Text confidenceValue;
	private Text pathLength;
	private Text sampleNumber;
	private Button modelcheckingButton;
	private Button exportPrismButton;

	private String tmpDirPath;
	private File tmpDir;

	@Override
	public void createPartControl(Composite parent) {

		// add change listener model
		//final Composite parentComposite = parent;
		getSite().getPage().addPartListener(this);

		verificationConsole = new MessageConsole("Verification Results", null);
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { verificationConsole });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(verificationConsole);

		// make temporary directory
		tmpDirPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + File.separator + "." + ID + ".tmp";
		tmpDir = new File(tmpDirPath);
		tmpDir.mkdir();

		// create widget layout
		GridLayout layout = new GridLayout(3, false);
		layout.marginRight = 5;
		parent.setLayout(layout);

		// create model file widget
		Label modelFileLabel = new Label(parent, SWT.NONE);
		modelFileLabel.setText("Model file: ");
		modelFileLabel.setToolTipText("filename of sbml/xml model");
		modelFile = new Text(parent, SWT.BORDER);
		modelFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		modelFile.setEnabled(false); // disable

		// create data file widget
		Label dataFileLabel = new Label(parent, SWT.NONE);
		dataFileLabel.setText("Data file: ");
		dataFileLabel.setToolTipText("file to save model checking data to");
		dataFile = new Text(parent, SWT.BORDER);
		dataFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		Button fileDialogButton = new Button(parent, SWT.PUSH);
		fileDialogButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		fileDialogButton.setText("Directory...");
		final DirectoryDialog directoryDialog = new DirectoryDialog(parent.getShell());
		fileDialogButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				config.setDataDirectory(directoryDialog.open());
			}
		});

		// create model checker algorithm widget
		Label modelCheckerLabel = new Label(parent, SWT.NONE);
		modelCheckerLabel.setText("Model checker: ");
		modelCheckerLabel.setToolTipText("model checker to use");
		modelChecker = new Combo(parent, SWT.NONE);
		modelChecker.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		modelChecker.add("PRISM");
		modelChecker.setData("PRISM", ModelcheckingTarget.PRISM);
		modelChecker.add("MC2");
		modelChecker.setData("MC2", ModelcheckingTarget.MC2);

		// create confidence value widget
		Label confidenceLabel = new Label(parent, SWT.NONE);
		confidenceLabel.setText("Confidence: ");
		confidenceLabel.setToolTipText("confidence value for stochastic model checking");
		confidenceValue = new Text(parent, SWT.BORDER);
		confidenceValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		// create path length widget
		Label pathLabel = new Label(parent, SWT.NONE);
		pathLabel.setText("Path length: ");
		pathLabel.setToolTipText("length of the maximum path for stochastic model checking");
		pathLength = new Text(parent, SWT.BORDER);
		pathLength.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		// number of samples
		Label samplesLabel = new Label(parent, SWT.NONE);
		samplesLabel.setText("Samples: ");
		samplesLabel.setToolTipText("number of samples for stochastic model checking");
		sampleNumber = new Text(parent, SWT.BORDER);
		sampleNumber.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		Label separator1 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));

		propertyTreeViewer = new CheckboxTreeViewer(parent, SWT.MULTI | SWT.V_SCROLL);
		propertyTreeViewer.setLabelProvider(new IblLabelProvider());
		propertyTreeViewer.setContentProvider(new IblTreeContentProvider());
		propertyTreeViewer.setAutoExpandLevel(4);
		Tree tree = propertyTreeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 3));
		propertyTreeViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {

				if (event.getChecked()) {
					propertyTreeViewer.setSubtreeChecked(event.getElement(), true);
				} else {
					propertyTreeViewer.setSubtreeChecked(event.getElement(), false);
				}
			}
		});

		Label separator2 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));

		// create export to PRISM button
		exportPrismButton = new Button(parent, SWT.PUSH);
		exportPrismButton.setText("Export to PRISM");
		exportPrismButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				exportVerificationModel();
			}
		});
		exportPrismButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		exportPrismButton.setEnabled(false);

		// create model checking button
		modelcheckingButton = new Button(parent, SWT.PUSH);
		modelcheckingButton.setText("Verify");
		modelcheckingButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				performModelChecking();
			}
		});
		modelcheckingButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		modelcheckingButton.setEnabled(false);
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		IWorkbenchPart part = partRef.getPart(true);
		if (part instanceof XtextEditor) {
			XtextEditor iblEditor = (XtextEditor) part;
			if (iblEditor.getLanguageName().equals("roadblock.xtext.ibl.Ibl")) {
				IXtextDocument iblDocument = iblEditor.getDocument();
				XtextResource iblResource = iblDocument.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
					@Override
					public XtextResource exec(XtextResource state) throws Exception {
						return state;
					}
				});

				if (iblResource != currentIblResource) {
					currentIblResource = iblResource;
					ensureConfig();
					bindValues();
				}

				if (iblResource.getErrors().size() == 0) {
					updateUi();
				}
			}
		}
	}

	@Override
	public void dispose() {
		getSite().getPage().removePartListener(this);
	}

	protected void updateUi() {

		if (currentIblResource == null) {
			modelcheckingButton.setEnabled(false);
			modelcheckingButton.setEnabled(false);
		} else {

			model = ModelcheckingUtil.getInstance().getModel(currentIblResource);

			if (model != null) {

				((IblLabelProvider) propertyTreeViewer.getLabelProvider()).resetIndex();
				propertyTreeViewer.setInput(model);
			}

			modelcheckingButton.setEnabled(true);
			exportPrismButton.setEnabled(true);
			modelFile.setText(config.getModelFile());
			dataFile.setText(config.getDataFile());
			modelChecker.setText(config.getModelChecker());
			confidenceValue.setText(config.getConfidenceValue().toString());
			pathLength.setText(config.getPathLength().toString());
			sampleNumber.setText(config.getSampleNumber().toString());
		}
	}

	// bind class entries to widget entries
	private void bindValues() {

		DataBindingContext ctx = new DataBindingContext();
		IObservableValue widgetValue;
		IObservableValue modelValue;
		IValidator validator;
		UpdateValueStrategy strategy;
		Binding bindValue;

		// model file widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(modelFile);
		modelValue = BeanProperties.value(Configuration.class, "modelFile").observe(config);

		// add a validator so can only be a non-empty string
		validator = new IValidator() {
			@Override
			public IStatus validate(Object value) {
				if (value instanceof String) {
					String stringValue = String.valueOf(value);
					if (stringValue.isEmpty()) {
						return ValidationStatus.error("cannot be empty");
					}
					return ValidationStatus.ok();
				}
				return ValidationStatus.error("not a string");
			}
		};
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(validator);
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// data file widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(dataFile);
		modelValue = BeanProperties.value(Configuration.class, "dataFile").observe(config);

		// add a validator so can only be a non-empty string
		validator = new IValidator() {
			@Override
			public IStatus validate(Object value) {
				if (value instanceof String) {
					String stringValue = String.valueOf(value);
					if (stringValue.isEmpty()) {
						return ValidationStatus.error("cannot be empty");
					}
					return ValidationStatus.ok();
				}
				return ValidationStatus.error("not a string");
			}
		};
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(validator);
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
	}

	private void ensureConfig() {
		if (config == null) {
			config = ConfigurationUtil.getInstance(currentIblResource).getConfig(currentIblResource);
		}
	}

	private void exportVerificationModel() {

		final Object[] selectedProperties = propertyTreeViewer.getCheckedElements();
		final ModelcheckingTarget target = (ModelcheckingTarget) modelChecker.getData(modelChecker.getText());

		final String filename = String.format("%s%s%s", config.getDataDirectory(), File.separator, config.getDataFile());
		final String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf('.'));
		final String fileExtension = filename.substring(filename.lastIndexOf('.'));

		IRunnableWithProgress exportTask = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				try {
					int exportIndex = 0;

					for (Object checkedProperty : selectedProperties) {
						if (checkedProperty instanceof IProperty) {

							IProperty property = (IProperty) checkedProperty;
							String exportFilename = String.format("%s%s%s", filenameWithoutExtension, ++exportIndex, fileExtension);

							VerificationManager.getInstance().export(model, property, target, exportFilename);
						}
					}
				} catch (IOException e) {
					errorDialogWithStackTrace("Failed exporting " + config.getModelName() + " to " + modelChecker.getText(), e);
				}
			}
		};

		try {
			ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(getSite().getWorkbenchWindow().getShell());
			progressDialog.getProgressMonitor().setTaskName("Exporting " + config.getModelName() + " to " + modelChecker.getText() + "...");
			progressDialog.run(true, true, exportTask);
		} catch (InvocationTargetException | InterruptedException e) {
			errorDialogWithStackTrace("Failed exporting " + config.getModelName() + " to " + modelChecker.getText(), e);
		}

	}

	// launch model checking
	private void performModelChecking() {

		final Object[] selectedProperties = propertyTreeViewer.getCheckedElements();
		final ModelcheckingTarget target = (ModelcheckingTarget) modelChecker.getData(modelChecker.getText());

		final String filename = String.format("%s%s%s", config.getDataDirectory(), File.separator, config.getDataFile());
		final String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf('.'));
		final String fileExtension = filename.substring(filename.lastIndexOf('.'));

		final MessageConsoleStream consoleStream = verificationConsole.newMessageStream();

		IRunnableWithProgress verificationTask = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				try {
					int exportIndex = 0;

					for (Object checkedProperty : selectedProperties) {
						if (checkedProperty instanceof IProperty) {

							IProperty property = (IProperty) checkedProperty;
							final String exportFilename = String.format("%s%s%s", filenameWithoutExtension, ++exportIndex, fileExtension);

							final Process verificationProcess = VerificationManager.getInstance().verify(model, property, target, exportFilename);

							Thread streamingThread = new Thread(new Runnable() {
								public void run() {

									try {

										BufferedReader in = new BufferedReader(new InputStreamReader(verificationProcess.getInputStream()));
										BufferedWriter fileStream = new BufferedWriter(new PrintWriter(exportFilename + ".result"));

										String part = null;
										while ((part = in.readLine()) != null) {
											fileStream.write(part);
											fileStream.newLine();
											consoleStream.println(part);
											fileStream.flush();
										}

										in.close();
										fileStream.close();

									} catch (IOException e) {
									}
								}
							});

							streamingThread.start();

							while (!monitor.isCanceled() && streamingThread.isAlive()) {
							}

							if (streamingThread.isAlive()) {
								streamingThread.interrupt();
								break;
							}

							verificationProcess.destroy();
						}
					}

					monitor.done();

				} catch (IOException e) {
					errorDialogWithStackTrace("Failed verifying the " + config.modelName + " model", e);
				}
			}
		};

		try {
			ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(getSite().getWorkbenchWindow().getShell());
			progressDialog.getProgressMonitor().setTaskName("Performing verification for the " + config.modelName + " model...");
			progressDialog.run(true, true, verificationTask);
		} catch (InvocationTargetException | InterruptedException e) {
			errorDialogWithStackTrace("Failed verifying the " + config.modelName + " model", e);
		}
	}

	private static void errorDialogWithStackTrace(String msg, Throwable t) {

		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);

		final String trace = sw.toString();
		List<Status> childStatuses = new ArrayList<Status>();
		for (String line : trace.split(System.getProperty("line.separator"))) {
			childStatuses.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID, line));
		}
		MultiStatus ms = new MultiStatus(Activator.PLUGIN_ID, IStatus.ERROR, childStatuses.toArray(new Status[] {}), t.getLocalizedMessage(), t);
		ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Error", msg, ms);
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
		updateUi();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}
}
