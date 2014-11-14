package roadblock.biocompiler.ui.views;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
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
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.browser.Browser;
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
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import roadblock.emf.ibl.Ibl.Model;
import roadblock.dataprocessing.flatModel.FlatModelManager;
import roadblock.simulation.ngss.Simulator;
import roadblock.biocompiler.ui.Activator;
import roadblock.biocompiler.ui.model.Configuration;
import roadblock.biocompiler.ui.util.ConfigurationUtil;
import roadblock.biocompiler.ui.util.SimulationUtil;
import roadblock.biocompiler.*;

public class MainView extends ViewPart implements IPartListener2 {

	public static final String ID = "roadblock.biocompiler.ui.views.mainView";

	private Model model;
	private Configuration config;
	private XtextResource currentIblResource;
//	private MessageConsole simulationConsole;
	
//	private Text modelFile;
//	private Text dataFile;
//	private Text maxTime;
//	private Text logInterval;
//	private Text sampleNumber;
//	private Combo SSAlgorithm;
	private Button compilationButton;
	private Browser browser;
	private Biocompiler biocompiler;
	
	@Override
	public void createPartControl(Composite parent) {

		// add change listener model
		getSite().getPage().addPartListener(this);
		
//		simulationConsole = new MessageConsole("Simulation Results", null);
//		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { simulationConsole });
//		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(simulationConsole);

		// create widget layout
		GridLayout layout = new GridLayout(1, false);
		layout.marginRight = 5;
		parent.setLayout(layout);
//
//		// create model file widget
//		Label modelFileLabel = new Label(parent, SWT.NONE);
//		modelFileLabel.setText("Model file: ");
//		modelFileLabel.setToolTipText("filename of sbml/xml model");
//		modelFile = new Text(parent, SWT.BORDER);
//		modelFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
//		modelFile.setEnabled(false); // disable

		// create data file widget
//		Label dataFileLabel = new Label(parent, SWT.NONE);
//		dataFileLabel.setText("Data file: ");
//		dataFileLabel.setToolTipText("file to save simulation data to");
//		dataFile = new Text(parent, SWT.BORDER);
//		dataFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
//		Button fileDialogButton = new Button(parent, SWT.PUSH);
//		fileDialogButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
//		fileDialogButton.setText("Directory...");
//		final DirectoryDialog directoryDialog = new DirectoryDialog(parent.getShell());
//		fileDialogButton.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				config.dataDirectory = directoryDialog.open();
//			}
//		});

//		Label maxTimeLabel = new Label(parent, SWT.NONE);
//		maxTimeLabel.setText("Max. Time: ");
//		maxTimeLabel.setToolTipText("end time of the simulation");
//		maxTime = new Text(parent, SWT.BORDER);
//		maxTime.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
//		
//		Label logIntervalLabel = new Label(parent, SWT.NONE);
//		logIntervalLabel.setText("Interval: ");
//		logIntervalLabel.setToolTipText("interval with which trajectories are sampled");
//		logInterval = new Text(parent, SWT.BORDER);
//		logInterval.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
//
//		// number of samples
//		Label samplesLabel = new Label(parent, SWT.NONE);
//		samplesLabel.setText("Number of runs: ");
//		samplesLabel.setToolTipText("number of samples for stochastic simulation");
//		sampleNumber = new Text(parent, SWT.BORDER);
//		sampleNumber.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
//
//		Label separator1 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
//		separator1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
//
//		// create stochastic simulation algorithm widget
//		Label SSLabel = new Label(parent, SWT.NONE);
//		SSLabel.setText("Simulation algorithm: ");
//		SSLabel.setToolTipText("simulation algorithm to use");
//		SSAlgorithm = new Combo(parent, SWT.NONE);
//		SSAlgorithm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
//		SSAlgorithm.add("dm");
//		SSAlgorithm.add("frm");
//		SSAlgorithm.add("cr");
//		SSAlgorithm.add("tl");
//		SSAlgorithm.add("nrm");
//		SSAlgorithm.add("pdm");
//		SSAlgorithm.add("ldm");
//		SSAlgorithm.add("sdm");
//		SSAlgorithm.add("odm");
		
		// create compilation button
		compilationButton = new Button(parent, SWT.PUSH);
		compilationButton.setText("Compile");
		compilationButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				performCompilation();
			}
		});
		compilationButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		compilationButton.setEnabled(false);
		
		// browser
		browser = new Browser(parent, SWT.FILL);
		browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		browser.setText("<BODY > empty model</BODY>");
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
//					bindValues();
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
	

	protected void updateUi()  {

		if (currentIblResource == null) {
			compilationButton.setEnabled(false);
		} else {

			model = SimulationUtil.getInstance().getModel(currentIblResource);
			compilationButton.setEnabled(true);
			System.out.println(model);
			

			try {
				// convert the model to XML
				System.out.println("Converting to XML");
				String xml = convertToXml(model);
				
				// save XML as file
				System.out.println("Saving to XML");
				String xmlFilename = config.dataDirectory + "/src-gen/EMFModelForBiocompiler.xml";
				writeTextFile(xmlFilename, xml);
				
				// run the biocompiler
				System.out.println("Running the biocompiler");
				String pathToBiocompiler = "/home/christophe/WualaDrive/koantig/work/roadblock/biocompilerStandAlone";
				Process process = new ProcessBuilder(pathToBiocompiler + "/atgcWrapper.sh",xmlFilename,".").start(); 
				
				InputStream is = process.getInputStream();
				InputStream is2 = process.getErrorStream();
				InputStreamReader isr = new InputStreamReader(is);
				InputStreamReader isr2 = new InputStreamReader(is2);
				BufferedReader br = new BufferedReader(isr);
				BufferedReader br2 = new BufferedReader(isr2);
				String line="";

				System.out.println("##########  Error stream ############");
				while ((line = br2.readLine()) != null) {
					System.out.println(line);
					}

				System.out.println("##########  Input stream ############");
				while ((line = br.readLine()) != null) {
					System.out.println(line);
					}
			} catch (IOException e) {
				System.out.println("Problem when creating the xml");
			}
			
//			biocompiler = new Biocompiler(model);
//			biocompiler.gatherParts();
//			browser.setText(biocompiler.identifiedPartsHtml());
//			//biocompiler.compile();
			updateConsoleView();
			
			
//			modelFile.setText(config.modelFile);
//			dataFile.setText(config.dataFile);
//			maxTime.setText(config.maxTime.toString());
//			logInterval.setText(config.logInterval.toString());
//			sampleNumber.setText(config.sampleNumber.toString());
//			SSAlgorithm.setText(config.SSAlgorithm);
		}
	}

	// bind class entries to widget entries
//	private void bindValues() {
//
//		DataBindingContext ctx = new DataBindingContext();
//		IObservableValue widgetValue;
//		IObservableValue modelValue;
//		IValidator validator;
//		UpdateValueStrategy strategy;
//		Binding bindValue;
//
//		// model file widget
//		widgetValue = WidgetProperties.text(SWT.Modify).observe(modelFile);
//		modelValue = BeanProperties.value(Configuration.class, "modelFile").observe(config);
//
//		// add a validator so can only be a non-empty string
//		validator = new IValidator() {
//			@Override
//			public IStatus validate(Object value) {
//				if (value instanceof String) {
//					String stringValue = String.valueOf(value);
//					if (stringValue.isEmpty()) {
//						return ValidationStatus.error("cannot be empty");
//					}
//					return ValidationStatus.ok();
//				}
//				return ValidationStatus.error("not a string");
//			}
//		};
//		strategy = new UpdateValueStrategy();
//		strategy.setBeforeSetValidator(validator);
//		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
//		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
//
//		// data file widget
//		widgetValue = WidgetProperties.text(SWT.Modify).observe(dataFile);
//		modelValue = BeanProperties.value(Configuration.class, "dataFile").observe(config);
//
//		// add a validator so can only be a non-empty string
//		validator = new IValidator() {
//			@Override
//			public IStatus validate(Object value) {
//				if (value instanceof String) {
//					String stringValue = String.valueOf(value);
//					if (stringValue.isEmpty()) {
//						return ValidationStatus.error("cannot be empty");
//					}
//					return ValidationStatus.ok();
//				}
//				return ValidationStatus.error("not a string");
//			}
//		};
//		strategy = new UpdateValueStrategy();
//		strategy.setBeforeSetValidator(validator);
//		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
//		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
//	}

	private void ensureConfig() {
		if (config == null) {
			config = ConfigurationUtil.getInstance(currentIblResource).getConfig(currentIblResource);
		}
	}

	private void updateConsoleView(){
		ConsoleView myConsole = (ConsoleView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("roadblock.biocompiler.ui.views.consoleView");
//		myConsole.setContent(biocompiler.makeHtmlLog()); 
	}

	private void updateResultsView(){
		ResultsView resultsView = (ResultsView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("roadblock.biocompiler.ui.views.resultsView");
//		resultsView.setContent(biocompiler.makeResultPage()); 
	}
	
	
	// Compile
	private void performCompilation() {
//		biocompiler.compile();
		updateConsoleView();
		updateResultsView();
		
		// XXX read model from EMFModel.xml rather than regenerating it
//		final MessageConsoleStream consoleStream = simulationConsole.newMessageStream();

//		final String filename = String.format("%s%s%s", config.getDataDirectory(), File.separator, config.getDataFile());
//		final String filenameWithoutExtension = filename.substring(0, filename.lastIndexOf('.'));
//		final String fileExtension = filename.substring(filename.lastIndexOf('.'));
//		final String exportFilename = String.format("%s%s", filenameWithoutExtension, fileExtension);
//
//		String xml = null;
//		try {
//			/* ideally, the model xml should only be regenerated when the source code changes */
//			FlatModelManager flatModelManager = new FlatModelManager(model);
//			xml = convertToXml(flatModelManager.getFlatModel());
//		} catch (IOException e) {
//			errorDialogWithStackTrace("Failed to export model to xml", e);
//		}
//		
//		Simulator simulator = new Simulator(xml);
//		simulator.max_time = config.getMaxTime();
//		simulator.log_interval = config.getLogInterval();
//		simulator.runs = config.getSampleNumber();
//		//simulator.max_runtime = 0.0;
//		//simulator.seed = 0;
////		simulator.runSimulation(exportFilename, consoleStream);
	}

	// export an EMF model to XML
	// via http://techblog.goelite.org/sending-emf-models-via-soap/
	public static String convertToXml(EObject eObject) throws IOException {
		XMLResourceImpl resource = new XMLResourceImpl();
		XMLProcessor processor = new XMLProcessor();
		resource.getDefaultSaveOptions().put(XMLResourceImpl.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		resource.setEncoding("UTF-8");
		resource.getContents().add(eObject);
		return processor.saveToString(resource, null);
	}

	public void  writeTextFile(String fileName, String s) {

		FileWriter output = null ;

		try {
			output = new FileWriter(fileName);
			output.write(s);

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (output != null) {
				try {
					output.flush();
					output.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
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
