package roadblock.simulation.ui.views;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.typed.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
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
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.sbml.jsbml.SBMLWriter;

import roadblock.caching.ModelCache;
import roadblock.dataprocessing.export.SBML_Export;
import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.resource.IblResourceObservable;
import roadblock.simulation.EnvironmentType;
import roadblock.simulation.ngss.Simulator;
import roadblock.simulation.ssapredict.SSAPredictManager;
import roadblock.simulation.ui.Activator;
import roadblock.simulation.ui.model.Configuration;
import roadblock.simulation.ui.util.ConfigurationUtil;

public class MainView extends ViewPart implements Observer {

	public static final String ID = "roadblock.simulation.ui.views.mainView";

	private Configuration config;
	private XtextResource currentIblResource;
	private MessageConsole simulationConsole;

	private Text modelFile;
	private Text dataFile;
	private Text maxTime;
	private Text logInterval;
	private Text sampleNumber;
	private Combo comboRunOn;
	private Button simulationButton;

	@Override
	public void createPartControl(Composite parent) {

		simulationConsole = new MessageConsole("Simulation Output", null);
		simulationConsole.activate();

		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { simulationConsole });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(simulationConsole);

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
				config.dataDirectory = directoryDialog.open();
			}
		});

		Label maxTimeLabel = new Label(parent, SWT.NONE);
		maxTimeLabel.setText("Max. Time: ");
		maxTimeLabel.setToolTipText("end time of the simulation");
		maxTime = new Text(parent, SWT.BORDER);
		maxTime.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		Label logIntervalLabel = new Label(parent, SWT.NONE);
		logIntervalLabel.setText("Interval: ");
		logIntervalLabel.setToolTipText("interval with which trajectories are sampled");
		logInterval = new Text(parent, SWT.BORDER);
		logInterval.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		// number of samples
		Label samplesLabel = new Label(parent, SWT.NONE);
		samplesLabel.setText("Number of runs: ");
		samplesLabel.setToolTipText("number of samples for stochastic simulation");
		sampleNumber = new Text(parent, SWT.BORDER);
		sampleNumber.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		Label runOnLabel = new Label(parent, SWT.NONE);
		runOnLabel.setText("Run on: ");
		comboRunOn = new Combo(parent, SWT.READ_ONLY);
		comboRunOn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		comboRunOn.add("Local Environment");
		comboRunOn.setData("Local Environment", EnvironmentType.LOCAL);
		comboRunOn.add("Remote HPC Environment (GPU)");
		comboRunOn.setData("Remote HPC Environment (GPU)", EnvironmentType.REMOTE_HPC);
		comboRunOn.select(0);

		Label separator1 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));

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

		// add change listener model
		getSite().getPage().addPartListener(IblResourceObservable.getInstance());
		IblResourceObservable.getInstance().addObserver(this);
	}

	@Override
	public void dispose() {
		getSite().getPage().removePartListener(IblResourceObservable.getInstance());
		IblResourceObservable.getInstance().deleteObserver(this);
	}

	protected void updateUi() {

		if (currentIblResource == null) {
			simulationButton.setEnabled(false);
			simulationButton.setEnabled(false);
		} else {
			simulationButton.setEnabled(true);
			modelFile.setText(config.modelFile);
			dataFile.setText(config.dataFile);
			maxTime.setText(config.maxTime.toString());
			logInterval.setText(config.logInterval.toString());
			sampleNumber.setText(config.sampleNumber.toString());
		}
	}

	// bind class entries to widget entries
	private void bindValues() {

		DataBindingContext ctx = new DataBindingContext();
		Binding bindValue;

		IValidator<Double> positiveDoubleValidator = new IValidator<Double>() {
			// decimal number validator
			@Override
			public IStatus validate(Double value) {
				Double doubleValue = (Double) value;
				if (doubleValue <= 0) {
					return ValidationStatus.error("Should be greater than 0");
				}
				return ValidationStatus.ok();
			}
		};

		IValidator<Integer> positiveIntegerValidator = new IValidator<Integer>() {
			// integer number validator
			@Override
			public IStatus validate(Integer value) {
				Integer intValue = (Integer) value;
				if (intValue <= 0) {
					return ValidationStatus.error("should be greater than 0");
				}
				return ValidationStatus.ok();
			}
		};

		IValidator<String> nonEmptyStringValidator = new IValidator<String>() {
			// non-empty string validator
			@Override
			public IStatus validate(String value) {
				String stringValue = String.valueOf(value);
				if (stringValue.isEmpty()) {
					return ValidationStatus.error("Cannot be empty");
				}
				return ValidationStatus.ok();
			}
		};

		// model file widget
		IObservableValue<String> widgetValue = WidgetProperties.text(SWT.Modify).observe(modelFile);
		IObservableValue<Object> modelValue = PojoProperties.value(Configuration.class, "modelFile").observe(config);
		UpdateValueStrategy<String, String> stringUpdateStrategy = new UpdateValueStrategy<String, String>();
		stringUpdateStrategy.setBeforeSetValidator(nonEmptyStringValidator);
		bindValue = ctx.bindValue(widgetValue, modelValue, stringUpdateStrategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// data file widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(dataFile);
		modelValue = PojoProperties.value(Configuration.class, "dataFile").observe(config);
		stringUpdateStrategy = new UpdateValueStrategy<String, String>();
		stringUpdateStrategy.setBeforeSetValidator(nonEmptyStringValidator);
		bindValue = ctx.bindValue(widgetValue, modelValue, stringUpdateStrategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// max_time
		widgetValue = WidgetProperties.text(SWT.Modify).observe(maxTime);
		modelValue = PojoProperties.value(Configuration.class, "maxTime").observe(config);
		UpdateValueStrategy<String, Double> doubleUpdateStrategy = new UpdateValueStrategy<String, Double>();
		doubleUpdateStrategy.setBeforeSetValidator(positiveDoubleValidator);
		bindValue = ctx.bindValue(widgetValue, modelValue, doubleUpdateStrategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// logInterval
		widgetValue = WidgetProperties.text(SWT.Modify).observe(logInterval);
		modelValue = PojoProperties.value(Configuration.class, "logInterval").observe(config);
		doubleUpdateStrategy = new UpdateValueStrategy<String, Double>();
		doubleUpdateStrategy.setBeforeSetValidator(positiveDoubleValidator);
		bindValue = ctx.bindValue(widgetValue, modelValue, doubleUpdateStrategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// sampleNumber
		widgetValue = WidgetProperties.text(SWT.Modify).observe(sampleNumber);
		modelValue = PojoProperties.value(Configuration.class, "sampleNumber").observe(config);
		UpdateValueStrategy<String, Integer> integerUpdateStrategy = new UpdateValueStrategy<String, Integer>();
		integerUpdateStrategy.setBeforeSetValidator(positiveIntegerValidator);
		bindValue = ctx.bindValue(widgetValue, modelValue, integerUpdateStrategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
	}

	private void ensureConfig() {
		if (config == null) {
			// config =
			// ConfigurationUtil.getInstance(currentIblResource).getConfig(currentIblResource);
			config = ConfigurationUtil.getInstance().getConfig(currentIblResource);
		}
	}

	private String getOptimalSSA() {
		SSAPredictManager ssaPredictManager = SSAPredictManager.getInstance();

		try {
			String simulationTmpPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()
					+ "/.tmp/simulation/";
			String sbmlExportFilename = "export.sbml";
			String sbmlExportFullFulename = simulationTmpPath + sbmlExportFilename;

			FileUtils.forceMkdir(new File(simulationTmpPath));
			FileUtils.cleanDirectory(new File(simulationTmpPath));

			SBMLWriter writer = new SBMLWriter();

			FlatModel emfFlatModel = ModelCache.getInstance().getFlatModel(currentIblResource);
			writer.writeSBMLToFile(SBML_Export.makeSBMLDocument(null, emfFlatModel), sbmlExportFullFulename);

			File sbmlFile = new File(sbmlExportFullFulename);

			String predictedAlgorithm = ssaPredictManager.predictSimulationAlgorithm(sbmlFile);
			predictedAlgorithm = predictedAlgorithm.substring(0, predictedAlgorithm.length() - 6);

			return predictedAlgorithm;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "dm";
	}

	// launch simulator
	private void performSimulation() {
		EnvironmentType simulationEnvironment = (EnvironmentType) comboRunOn.getData(comboRunOn.getText());

		switch (simulationEnvironment) {
		case LOCAL:
			performLocalSimulation();
			break;
		case REMOTE_HPC:
			performRemoteHPCSimulation();
			break;
		}
	}

	private void performLocalSimulation() {
		IRunnableWithProgress simulationTask = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				try {
					monitor.internalWorked(30);
					
					final MessageConsoleStream consoleStream = simulationConsole.newMessageStream();

					final String workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()
							+ "/.tmp/simulation/";
					final String filename = String.format("%s%s%s", config.getDataDirectory(), File.separator,
							config.getDataFile());

					final String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf('.'));
					final String fileExtension = filename.substring(filename.lastIndexOf('.'));
					final String exportFilename = String.format("%s%s", filenameWithoutExtension, fileExtension);

					String xml = ModelCache.getInstance().getSerialisedFlatModel(currentIblResource);
					String optimalSSA = getOptimalSSA();

					Simulator simulator = new Simulator(xml);
					simulator.max_time = config.getMaxTime();
					simulator.log_interval = config.getLogInterval();
					simulator.runs = config.getSampleNumber();
					simulator.simulation_algorithm = optimalSSA;
					simulator.runSimulation(workspacePath, exportFilename, consoleStream);

					monitor.done();

				} catch (Exception e) {
					errorDialogWithStackTrace("Failed simulating the " + config.modelName + " model", e);
				}
			}
		};

		try {
			ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(getSite().getWorkbenchWindow().getShell());
			progressDialog.getProgressMonitor()
					.setTaskName("Performing simulation for the " + config.modelName + " model...");
			progressDialog.run(true, true, simulationTask);
			progressDialog.close();
			
			// refresh project explorer
			ResultsView resultsView = (ResultsView) getView("roadblock.simulation.ui.views.resultsView");
			if (resultsView != null) {
				resultsView.plotTrajectories();
			}
			
		} catch (InvocationTargetException | InterruptedException e) {
			errorDialogWithStackTrace("Failed simulating the " + config.modelName + " model", e);
		}
	}

	private void performRemoteHPCSimulation() {
		MessageDialog.openWarning(getSite().getShell(), "HPC Offline", "The HPC environment is currently offline.");
	}

	public IViewPart getView(String id) {
		IViewReference viewReferences[] = getSite().getWorkbenchWindow().getActivePage()
				.getViewReferences();
		//IViewReference viewReferences[] = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences();
		for (int i = 0; i < viewReferences.length; i++)
			if (id.equals(viewReferences[i].getId()))
				return viewReferences[i].getView(false);
		return null;
	}

	@SuppressWarnings("unused")
	private static void errorDialogWithStackTrace(String msg, Throwable t) {

		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);

		final String trace = sw.toString();
		List<Status> childStatuses = new ArrayList<Status>();
		for (String line : trace.split(System.getProperty("line.separator"))) {
			childStatuses.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID, line));
		}
		MultiStatus ms = new MultiStatus(Activator.PLUGIN_ID, IStatus.ERROR, childStatuses.toArray(new Status[] {}),
				t.getLocalizedMessage(), t);
		ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Error", msg, ms);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (IblResourceObservable.getInstance().getCurrentIblResource() != null) {
			currentIblResource = IblResourceObservable.getInstance().getCurrentIblResource();
			ensureConfig();
			bindValues();

			if (currentIblResource.getErrors().size() == 0) {
				updateUi();
			}
		}
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
}