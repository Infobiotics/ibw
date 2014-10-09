package roadblock.simulation.ui.views;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.ErrorDialog;
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
import roadblock.caching.ModelCache;
import roadblock.simulation.ngss.Simulator;
import roadblock.simulation.ui.Activator;
import roadblock.simulation.ui.model.Configuration;
import roadblock.simulation.ui.util.ConfigurationUtil;

public class MainView extends ViewPart implements IPartListener2 {

	public static final String ID = "roadblock.simulation.ui.views.mainView";

	private Configuration config;
	private XtextResource currentIblResource;
	private MessageConsole simulationConsole;

	// private CheckboxTreeViewer propertyTreeViewer;
	private Text modelFile;
	private Text dataFile;
	private Text maxTime;
	private Text logInterval;
	private Text sampleNumber;
	private Combo SSAlgorithm;
	private Button simulationButton;

	@Override
	public void createPartControl(Composite parent) {

		// add change listener model
		getSite().getPage().addPartListener(this);

		simulationConsole = new MessageConsole("Simulation Results", null);
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

		Label separator1 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));

		// create stochastic simulation algorithm widget
		Label SSLabel = new Label(parent, SWT.NONE);
		SSLabel.setText("Simulation algorithm: ");
		SSLabel.setToolTipText("simulation algorithm to use");
		SSAlgorithm = new Combo(parent, SWT.NONE);
		SSAlgorithm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		// XXX use human readable names and map them to acronyms.
		SSAlgorithm.add("dm");
		SSAlgorithm.add("frm");
		SSAlgorithm.add("cr");
		SSAlgorithm.add("tl");
		SSAlgorithm.add("nrm");
		SSAlgorithm.add("pdm");
		SSAlgorithm.add("ldm");
		SSAlgorithm.add("sdm");
		SSAlgorithm.add("odm");

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
			/*
			 * if (model != null) {
			 * 
			 * ((IblLabelProvider)
			 * propertyTreeViewer.getLabelProvider()).resetIndex();
			 * propertyTreeViewer.setInput(model); }
			 */
			simulationButton.setEnabled(true);
			modelFile.setText(config.modelFile);
			dataFile.setText(config.dataFile);
			maxTime.setText(config.maxTime.toString());
			logInterval.setText(config.logInterval.toString());
			sampleNumber.setText(config.sampleNumber.toString());
			SSAlgorithm.setText(config.SSAlgorithm);
		}
	}

	private class NonEmptyStringValidator implements IValidator {
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
	
	private class IntegerValidator implements IValidator {
		@Override
		public IStatus validate(Object value) {
			if (value instanceof Integer) {
				Integer intValue = (Integer) value;
				if (intValue <= 0) {
					return ValidationStatus.error("should be greater than 0");
				}
				return ValidationStatus.ok();
			}
			return ValidationStatus.error("not an integer number");
		}
	};
	
	private class DecimalValidator implements IValidator {
		@Override
		public IStatus validate(Object value) {
			if (value instanceof Double) {
				Double doubleValue = (Double) value;
				if (doubleValue <= 0) {
					return ValidationStatus.error("should be greater than 0");
				}
				return ValidationStatus.ok();
			}
			return ValidationStatus.error("not a decimal number");
		}
	};
	
	// bind class entries to widget entries
	private void bindValues() {

		DataBindingContext ctx = new DataBindingContext();
		IObservableValue widgetValue;
		IObservableValue modelValue;
		UpdateValueStrategy strategy;
		Binding bindValue;

		// model file widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(modelFile);
		modelValue = BeanProperties.value(Configuration.class, "modelFile").observe(config);
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(new NonEmptyStringValidator());
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// data file widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(dataFile);
		modelValue = BeanProperties.value(Configuration.class, "dataFile").observe(config);
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(new NonEmptyStringValidator());
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// maxTime widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(maxTime);
		modelValue = BeanProperties.value(Configuration.class, "maxTime").observe(config);
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(new DecimalValidator());
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// logInterval widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(logInterval);
		modelValue = BeanProperties.value(Configuration.class, "logInterval").observe(config);
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(new DecimalValidator());
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// sample number value widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(sampleNumber);
		modelValue = BeanProperties.value(Configuration.class, "sampleNumber").observe(config);
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(new IntegerValidator());
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// stochastic simulation algorithm value widget
		widgetValue = WidgetProperties.selection().observe(SSAlgorithm);
		modelValue = BeanProperties.value(Configuration.class, "SSAlgorithm").observe(config);
		strategy = new UpdateValueStrategy();
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);

	}

	private void ensureConfig() {
		if (config == null) {
			config = ConfigurationUtil.getInstance(currentIblResource).getConfig(currentIblResource);
		}
	}

	// launch simulator
	private void performSimulation() {
		// XXX read model from EMFModel.xml rather than regenerating it
		final MessageConsoleStream consoleStream = simulationConsole.newMessageStream();

		final String filename = String.format("%s%s%s", config.getDataDirectory(), File.separator, config.getDataFile());
		final String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf('.'));
		final String fileExtension = filename.substring(filename.lastIndexOf('.'));
		final String exportFilename = String.format("%s%s", filenameWithoutExtension, fileExtension);

		String xml = ModelCache.getInstance().getSerialisedFlatModel(currentIblResource);

		Simulator simulator = new Simulator(xml);
		simulator.max_time = config.getMaxTime();
		simulator.log_interval = config.getLogInterval();
		simulator.runs = config.getSampleNumber();
		// simulator.max_runtime = 0.0;
		// simulator.seed = 0;
		simulator.runSimulation(exportFilename, consoleStream);
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
		MultiStatus ms = new MultiStatus(Activator.PLUGIN_ID, IStatus.ERROR, childStatuses.toArray(new Status[] {}), t.getLocalizedMessage(), t);
		ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Error", msg, ms);
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
		updateUi();
	}

	@Override
	public void setFocus() {
		// Auto-generated method stub

	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		// Auto-generated method stub

	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) {
		// Auto-generated method stub

	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
		// Auto-generated method stub

	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
		// Auto-generated method stub

	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
		// Auto-generated method stub

	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
		// Auto-generated method stub

	}
}
