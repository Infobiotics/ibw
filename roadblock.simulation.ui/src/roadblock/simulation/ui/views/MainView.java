package roadblock.simulation.ui.views;

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
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.xtext.ibl.generator.IblGenerator;
import roadblock.simulation.ngss.Simulator;
import roadblock.simulation.ui.Activator;
//import roadblock.simulation.ui.components.IblLabelProvider;
//import roadblock.simulation.ui.components.IblTreeContentProvider;
import roadblock.simulation.ui.model.Configuration;
import roadblock.simulation.ui.util.ConfigurationUtil;
import roadblock.simulation.ui.util.SimulationUtil;

public class MainView extends ViewPart implements IPartListener2 {

	public static final String ID = "roadblock.simulation.ui.views.mainView";

	private Model model;
	private Configuration config;
	private XtextResource currentIblResource;
	private MessageConsole simulationConsole;
	
	//private CheckboxTreeViewer propertyTreeViewer;
	private Text modelFile;
	private Text dataFile;
	private Combo SSAlgorithm;
	private Text sampleNumber;
	private Button simulationButton;
	private Button exportSBMLButton;

	//private String tmpDirPath;
	//private File tmpDir;

	@Override
	public void createPartControl(Composite parent) {

		// add change listener model
		// XXX final Composite parentComposite = parent;
		getSite().getPage().addPartListener(this);
		
		simulationConsole = new MessageConsole("Simulation Results", null);
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { simulationConsole });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(simulationConsole);

		// make temporary directory
		/*
		tmpDirPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + File.separator + "." + ID + ".tmp";
		tmpDir = new File(tmpDirPath);
		tmpDir.mkdir();
		*/

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
		dataFileLabel.setToolTipText("file to save simulation data to");
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

		// create stochastic simulation algorithm widget
		Label SSLabel = new Label(parent, SWT.NONE);
		SSLabel.setText("Simulation algorithm: ");
		SSLabel.setToolTipText("simulation algorithm to use");
		SSAlgorithm = new Combo(parent, SWT.NONE);
		SSAlgorithm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		SSAlgorithm.add("XXX PRISM");
		SSAlgorithm.add("XXX MC2");

		// XXX more widgets
		
		// number of samples
		Label samplesLabel = new Label(parent, SWT.NONE);
		samplesLabel.setText("Samples: ");
		samplesLabel.setToolTipText("number of samples for stochastic simulation");
		sampleNumber = new Text(parent, SWT.BORDER);
		sampleNumber.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		Label separator1 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));

		// create export SBML button
		exportSBMLButton = new Button(parent, SWT.PUSH);
		exportSBMLButton.setText("Export SBML");
		exportSBMLButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				exportSBML();
			}
		});
		exportSBMLButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		exportSBMLButton.setEnabled(false);

		// create simulation button
		simulationButton = new Button(parent, SWT.PUSH);
		simulationButton.setText("Simulate");
		simulationButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				performSimulation();
			}
		});
		simulationButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		simulationButton.setEnabled(false);
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
			simulationButton.setEnabled(false);
			simulationButton.setEnabled(false);
		} else {

			model = SimulationUtil.getInstance().getModel(currentIblResource);
/*
			if (model != null) {

				((IblLabelProvider) propertyTreeViewer.getLabelProvider()).resetIndex();
				propertyTreeViewer.setInput(model);
			}
*/
			simulationButton.setEnabled(true);
			exportSBMLButton.setEnabled(true);
			modelFile.setText(config.getModelFile());
			dataFile.setText(config.getDataFile());
			SSAlgorithm.setText(config.getSSAlgorithm());
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

	private void exportSBML() {
		/*
		final Object[] selectedProperties = propertyTreeViewer.getCheckedElements();
		final SimulationTarget target = (SimulationTarget) modelChecker.getData(modelChecker.getText());

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
		*/
	}

	// launch simulator
	private void performSimulation() {
		final MessageConsoleStream consoleStream = simulationConsole.newMessageStream();

/*
		IblGenerator generator = new IblGenerator();
		IFileSystemAccess fsa = new IFileSystemAccess();
		generator.doGenerate(currentIblResource, fsa);
*/
		Simulator simulator = new Simulator("EMFModel.xml"); // XXX hard wired...
		consoleStream.println(modelFile.getText());
		// XXX read config from Configuration or widgets
		simulator.max_time = 100.0;
		simulator.max_runtime = 0.0;
		simulator.log_interval = 1.0;
		simulator.runs = 1;
		simulator.seed = 0;
		// XXX simulator.runSimulation();
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
