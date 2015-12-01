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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
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
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.VerificationType;
import roadblock.modelchecking.filtering.FilteringManager;
import roadblock.modelchecking.runtime.IModelcheckingConfiguration;
import roadblock.modelchecking.runtime.VerificationManager;
import roadblock.modelchecking.runtime.mc2.Mc2Configuration;
import roadblock.modelchecking.runtime.nusmv.NuSmvConfiguration;
import roadblock.modelchecking.runtime.prism.PrismConfiguration;
import roadblock.modelchecking.ui.Activator;
import roadblock.modelchecking.ui.components.IblColumnLabelProvider;
import roadblock.modelchecking.ui.components.IblTreeContentProvider;
import roadblock.modelchecking.ui.model.Configuration;
import roadblock.modelchecking.ui.model.PropertySemanticEntityPair;
import roadblock.modelchecking.ui.model.PropertyTreeData;
import roadblock.modelchecking.ui.util.ConfigurationUtil;
import roadblock.modelchecking.ui.util.ModelcheckingUtil;

public class MainView extends ViewPart implements IPartListener2 {

	public static final String ID = "roadblock.modelchecking.ui.views.mainView";

	private Composite parentComposite;

	private PropertyTreeData propertyTreeData;
	private Configuration config;
	private XtextEditor iblEditor;
	private XtextResource currentIblResource;

	private MessageConsole verificationConsole;

	private CheckboxTreeViewer ctvPropertyTreeViewer;

	private Text txtModelFile;
	private Text txtDataFile;
	private Combo ddlVerificationType;

	private Group prismGroup;
	private Text txtConfidenceValue;
	private Text txtPathLength;
	private Text txtSampleNumber;

	private Group mc2Group;
	private Text txtMaxTime;
	private Text txtInterval;
	private Text txtRuns;
	private Combo ddlSimulator;

	private Button btnVerify;
	private Button btnExport;

	private String tmpDirPath;
	private File tmpDir;

	@Override
	public void createPartControl(Composite parent) {

		parentComposite = parent;

		// add change listener model
		// final Composite parentComposite = parent;
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
		txtModelFile = new Text(parent, SWT.BORDER);
		txtModelFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		txtModelFile.setEnabled(false); // disable

		// create data file widget
		Label dataFileLabel = new Label(parent, SWT.NONE);
		dataFileLabel.setText("Generated file: ");
		dataFileLabel.setToolTipText("file to save verification data to");
		txtDataFile = new Text(parent, SWT.BORDER);
		txtDataFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
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

		// create verification type widget
		Label verificationTypeLabel = new Label(parent, SWT.NONE);
		verificationTypeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		verificationTypeLabel.setText("Verification: ");
		verificationTypeLabel.setToolTipText("verification type");

		ddlVerificationType = new Combo(parent, SWT.READ_ONLY);
		ddlVerificationType.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		ddlVerificationType.add("Qualitative");
		ddlVerificationType.setData("Qualitative", VerificationType.QUALITATIVE);
		ddlVerificationType.add("Quantitative");
		ddlVerificationType.setData("Quantitative", VerificationType.QUANTITATIVE);
		ddlVerificationType.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				handlePropertyItemChecked(null);

				parentComposite.layout();
				updateUi();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		prismGroup = new Group(parent, SWT.SHADOW_ETCHED_IN);
		prismGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		prismGroup.setLayout(new GridLayout(3, false));
		prismGroup.setText("PRISM parameters");

		// create confidence value widget
		Label confidenceLabel = new Label(prismGroup, SWT.NONE);
		confidenceLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		confidenceLabel.setText("Confidence: ");
		confidenceLabel.setToolTipText("confidence value for stochastic model checking");
		txtConfidenceValue = new Text(prismGroup, SWT.BORDER);
		txtConfidenceValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		// create path length widget
		Label pathLabel = new Label(prismGroup, SWT.NONE);
		pathLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		pathLabel.setText("Path length: ");
		pathLabel.setToolTipText("length of the maximum path for stochastic model checking");
		txtPathLength = new Text(prismGroup, SWT.BORDER);
		txtPathLength.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		// number of samples
		Label samplesLabel = new Label(prismGroup, SWT.NONE);
		samplesLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		samplesLabel.setText("Samples: ");
		samplesLabel.setToolTipText("number of samples for stochastic model checking");
		txtSampleNumber = new Text(prismGroup, SWT.BORDER);
		txtSampleNumber.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		mc2Group = new Group(parent, SWT.SHADOW_ETCHED_IN);
		mc2Group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		mc2Group.setLayout(new GridLayout(3, false));
		mc2Group.setText("MC2 parameters");

		// create max time widget
		Label maxTimeLabel = new Label(mc2Group, SWT.NONE);
		maxTimeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		maxTimeLabel.setText("Max. Time: ");
		maxTimeLabel.setToolTipText("end time of the simulation");
		txtMaxTime = new Text(mc2Group, SWT.BORDER);
		txtMaxTime.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		// create interval widget
		Label intervalLabel = new Label(mc2Group, SWT.NONE);
		intervalLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		intervalLabel.setText("Interval: ");
		intervalLabel.setToolTipText("interval with which trajectories are sampled");
		txtInterval = new Text(mc2Group, SWT.BORDER);
		txtInterval.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		// create number of runs widget
		Label runsLabel = new Label(mc2Group, SWT.NONE);
		runsLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		runsLabel.setText("No. of runs: ");
		runsLabel.setToolTipText("number of simulation runs");
		txtRuns = new Text(mc2Group, SWT.BORDER);
		txtRuns.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));

		// create stochastic simulation algorithm widget
		Label simulatorLabel = new Label(mc2Group, SWT.NONE);
		simulatorLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		simulatorLabel.setText("Simulator: ");
		simulatorLabel.setToolTipText("simulation algorithm to use");
		ddlSimulator = new Combo(mc2Group, SWT.READ_ONLY);
		ddlSimulator.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		ddlSimulator.add("dm");
		ddlSimulator.add("frm");
		ddlSimulator.add("cr");
		ddlSimulator.add("tl");
		ddlSimulator.add("nrm");
		ddlSimulator.add("pdm");
		ddlSimulator.add("ldm");
		ddlSimulator.add("sdm");
		ddlSimulator.add("odm");

		Label separator1 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));

		Label propertiesLabel = new Label(parent, SWT.CENTER);
		propertiesLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		propertiesLabel.setText("Properties");

		Label separator2 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));

		ctvPropertyTreeViewer = new CheckboxTreeViewer(parent, SWT.MULTI | SWT.V_SCROLL);
		// ctvPropertyTreeViewer.setLabelProvider(new IblLabelProvider());
		ctvPropertyTreeViewer.setContentProvider(new IblTreeContentProvider());
		ctvPropertyTreeViewer.setAutoExpandLevel(4);
		Tree tree = ctvPropertyTreeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 3));
		TreeViewerColumn column = new TreeViewerColumn(ctvPropertyTreeViewer, SWT.NONE);
		column.getColumn().setWidth(500);
		column.getColumn().setResizable(false);
		column.setLabelProvider(new IblColumnLabelProvider());
		ColumnViewerToolTipSupport.enableFor(ctvPropertyTreeViewer, ToolTip.RECREATE);
		ctvPropertyTreeViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (event.getChecked()) {
					ctvPropertyTreeViewer.setSubtreeChecked(event.getElement(), true);
					btnExport.setEnabled(true);
					btnVerify.setEnabled(true);
				} else {
					ctvPropertyTreeViewer.setSubtreeChecked(event.getElement(), false);
					boolean isAnyPropertyChecked = ctvPropertyTreeViewer.getCheckedElements().length > 0;
					btnExport.setEnabled(isAnyPropertyChecked);
					btnVerify.setEnabled(isAnyPropertyChecked);
				}

				List<PropertySemanticEntityPair> propertyItems = new ArrayList<>();
				for (Object o : ctvPropertyTreeViewer.getCheckedElements()) {
					if (o instanceof PropertySemanticEntityPair) {
						propertyItems.add((PropertySemanticEntityPair) o);
					}
				}

				handlePropertyItemChecked(propertyItems);
			}
		});
		tree.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (iblEditor != null && propertyTreeData != null && e.item.getData() instanceof PropertySemanticEntityPair) {
					PropertySemanticEntityPair selection = (PropertySemanticEntityPair) e.item.getData();

					INode propertyNode = NodeModelUtils.getNode(selection.semanticEntity);
					ISourceViewer textViewer = iblEditor.getInternalSourceViewer();
					// textViewer.setRangeIndication(propertyNode.getOffset(),
					// propertyNode.getLength(), false);
					textViewer.revealRange(propertyNode.getOffset(), propertyNode.getLength());
					textViewer.setSelectedRange(propertyNode.getOffset(), propertyNode.getLength());
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// Auto-generated method stub
			}
		});

		Label separator3 = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));

		// create export to PRISM button
		btnExport = new Button(parent, SWT.PUSH);
		btnExport.setText("Export Model");
		btnExport.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				exportVerificationModel();
			}
		});
		btnExport.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		btnExport.setEnabled(false);

		// create model checking button
		btnVerify = new Button(parent, SWT.PUSH);
		btnVerify.setText("Verify");
		btnVerify.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				performModelChecking();
			}
		});
		btnVerify.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		btnVerify.setEnabled(false);

		ddlVerificationType.select(0);
		ddlSimulator.select(0);
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		IWorkbenchPart part = partRef.getPart(true);
		if (part instanceof XtextEditor) {
			iblEditor = (XtextEditor) part;
			if (iblEditor.getLanguageName().equals("roadblock.xtext.ibl.Ibl")) {
				IXtextDocument iblDocument = iblEditor.getDocument();
				iblDocument.addModelListener(new IXtextModelListener() {

					@Override
					public void modelChanged(XtextResource resource) {
						if (resource != currentIblResource) {
							System.out.println("Changed!");
						}
					}

				});
				XtextResource iblResource = iblDocument.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
					@Override
					public XtextResource exec(XtextResource state) throws Exception {
						return state;
					}
				});

				if (iblResource != currentIblResource) {
					currentIblResource = iblResource;
					if (config == null) {
						ensureConfig();
						bindValues();
					}
				}

				if (iblResource.getErrors().size() == 0) {
					updateUi();
					handlePropertyItemChecked(null);
				}
			}
		}
	}

	@Override
	public void dispose() {
		getSite().getPage().removePartListener(this);
	}

	protected void updateUi() {

		btnExport.setEnabled(false);
		btnVerify.setEnabled(false);

		if (currentIblResource != null) {

			VerificationType verificationType = (VerificationType) ddlVerificationType.getData(ddlVerificationType.getText());
			propertyTreeData = ModelcheckingUtil.getInstance().getPropertyTreeData(currentIblResource, verificationType);

			if (propertyTreeData != null) {
				ctvPropertyTreeViewer.setInput(propertyTreeData);
			}

			txtModelFile.setText(config.getModelFile());
			txtDataFile.setText(config.getDataFile());
			txtConfidenceValue.setText(config.getConfidenceValue().toString());
			txtPathLength.setText(config.getPathLength().toString());
			txtSampleNumber.setText(config.getSampleNumber().toString());
			txtMaxTime.setText(config.getMaxTime().toString());
			txtInterval.setText(config.getLogInterval().toString());
			txtRuns.setText(config.getRuns().toString());
		}

		getSite().getShell().layout(true, true);
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
		widgetValue = WidgetProperties.text(SWT.Modify).observe(txtModelFile);
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
		widgetValue = WidgetProperties.text(SWT.Modify).observe(txtDataFile);
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

		// confidence value widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(txtConfidenceValue);
		modelValue = BeanProperties.value(Configuration.class, "confidenceValue").observe(config);

		// add a validator so can only be a decimal number
		validator = new IValidator() {
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
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(validator);
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// sample number value widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(txtSampleNumber);
		modelValue = BeanProperties.value(Configuration.class, "sampleNumber").observe(config);

		// add a validator so can only be an integer number
		validator = new IValidator() {
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
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(validator);
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// path length value widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(txtPathLength);
		modelValue = BeanProperties.value(Configuration.class, "pathLength").observe(config);

		// add a validator so can only be an integer number
		validator = new IValidator() {
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
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(validator);
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// max time widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(txtMaxTime);
		modelValue = BeanProperties.value(Configuration.class, "maxTime").observe(config);

		// add a validator so can only be a decimal number
		validator = new IValidator() {
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
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(validator);
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// log interval widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(txtInterval);
		modelValue = BeanProperties.value(Configuration.class, "logInterval").observe(config);

		// add a validator so can only be a decimal number
		validator = new IValidator() {
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
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(validator);
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// no. of runs widget
		widgetValue = WidgetProperties.text(SWT.Modify).observe(txtRuns);
		modelValue = BeanProperties.value(Configuration.class, "runs").observe(config);

		// add a validator so can only be an integer number
		validator = new IValidator() {
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
		strategy = new UpdateValueStrategy();
		strategy.setBeforeSetValidator(validator);
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
		ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);

		// simulation algorithm widget
		widgetValue = WidgetProperties.selection().observe(ddlSimulator);
		modelValue = BeanProperties.value(Configuration.class, "simulationAlgorithm").observe(config);

		strategy = new UpdateValueStrategy();
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);

		// verification type widget
		widgetValue = WidgetProperties.selection().observe(ddlVerificationType);
		modelValue = BeanProperties.value(Configuration.class, "verificationType").observe(config);

		strategy = new UpdateValueStrategy();
		bindValue = ctx.bindValue(widgetValue, modelValue, strategy, null);
	}

	private void ensureConfig() {
		if (config == null) {
			config = ConfigurationUtil.getInstance(currentIblResource).getConfig(currentIblResource);
		}
	}

	private void exportVerificationModel() {

		final Object[] selectedPropertyPairs = ctvPropertyTreeViewer.getCheckedElements();
		final VerificationType verificationType = (VerificationType) ddlVerificationType.getData(ddlVerificationType.getText());
		final String filename = String.format("%s%s%s", config.getDataDirectory(), File.separator, config.getDataFile());

		IRunnableWithProgress exportTask = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				try {
					int exportIndex = 0;

					for (Object checkedProperty : selectedPropertyPairs) {
						if (checkedProperty instanceof PropertySemanticEntityPair) {

							IProperty property = ((PropertySemanticEntityPair) checkedProperty).property;

							List<ModelcheckingTarget> targets = FilteringManager.getInstance().getModelcheckingTargets(property);
							ModelcheckingTarget target = ModelcheckingUtil.getInstance().getPreferredTarget(targets, verificationType);

							String exportFilename = String.format("%s%s", filename, ++exportIndex);

							VerificationManager.getInstance().export(propertyTreeData.model, property, target, exportFilename);
						}
					}
				} catch (IOException e) {
					errorDialogWithStackTrace("Failed exporting " + config.getModelName(), e);
				}
			}
		};

		try {
			ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(getSite().getWorkbenchWindow().getShell());
			progressDialog.getProgressMonitor().setTaskName("Exporting " + config.getModelName());
			progressDialog.run(true, true, exportTask);
		} catch (InvocationTargetException | InterruptedException e) {
			errorDialogWithStackTrace("Failed exporting " + config.getModelName(), e);
		}

	}

	// launch model checking
	private void performModelChecking() {

		final Object[] selectedPropertyPairs = ctvPropertyTreeViewer.getCheckedElements();
		final VerificationType verificationType = (VerificationType) ddlVerificationType.getData(ddlVerificationType.getText());

		final String filename = config.getDataFile();

		final double confidence = Double.parseDouble(txtConfidenceValue.getText());
		final long pathLength = Long.parseLong(txtPathLength.getText());
		final long samples = Long.parseLong(txtSampleNumber.getText());

		final double maxTime = Double.parseDouble(txtMaxTime.getText());
		final double logInterval = Double.parseDouble(txtInterval.getText());
		final long runs = Long.parseLong(txtRuns.getText());
		final String simulationAlgorithm = ddlSimulator.getText();

		final MessageConsoleStream consoleStream = verificationConsole.newMessageStream();

		IRunnableWithProgress verificationTask = new IRunnableWithProgress() {

			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

				Process runningProcess = null;

				try {
					int exportIndex = 0;

					for (Object checkedProperty : selectedPropertyPairs) {
						if (checkedProperty instanceof PropertySemanticEntityPair) {

							IProperty property = ((PropertySemanticEntityPair) checkedProperty).property;

							List<ModelcheckingTarget> targets = FilteringManager.getInstance().getModelcheckingTargets(property);
							ModelcheckingTarget target = ModelcheckingUtil.getInstance().getPreferredTarget(targets, verificationType);

							final String exportFileName = String.format("%s%s", filename, ++exportIndex);
							IModelcheckingConfiguration config = null;

							switch (target) {
							case PRISM:
								PrismConfiguration prismConfig = new PrismConfiguration();
								prismConfig.modelFileName = exportFileName;
								prismConfig.confidence = confidence;
								prismConfig.pathLength = pathLength;
								prismConfig.samples = samples;
								config = prismConfig;
								break;
							case NUSMV:
								NuSmvConfiguration nuSmvConfig = new NuSmvConfiguration();
								nuSmvConfig.modelFileName = exportFileName;
								config = nuSmvConfig;
								break;
							case MC2:
								Mc2Configuration mc2Config = new Mc2Configuration();
								mc2Config.modelFileName = exportFileName;
								mc2Config.maxTime = maxTime;
								mc2Config.logInterval = logInterval;
								mc2Config.runs = runs;
								mc2Config.simulationAlgorithm = simulationAlgorithm;
								config = mc2Config;
								break;
							}

							final Process verificationProcess = runningProcess = VerificationManager.getInstance().verify(propertyTreeData.model, property, target,
									config);

							Thread streamingThread = new Thread(new Runnable() {
								public void run() {

									try {

										BufferedReader in = new BufferedReader(new InputStreamReader(verificationProcess.getInputStream()));
										BufferedReader err = new BufferedReader(new InputStreamReader(verificationProcess.getErrorStream()));
										BufferedWriter fileStream = new BufferedWriter(new PrintWriter(exportFileName + ".result"));

										String part = null;
										while ((part = in.readLine()) != null) {
											fileStream.write(part);
											fileStream.newLine();
											consoleStream.println(part);
											fileStream.flush();
										}
										in.close();

										while ((part = err.readLine()) != null) {
											fileStream.write(part);
											fileStream.newLine();
											consoleStream.println(part);
											fileStream.flush();
										}
										err.close();

										fileStream.close();

									} catch (IOException e) {
										verificationProcess.destroy();
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
					if (runningProcess != null) {
						runningProcess.destroy();
					}
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

	private void handlePropertyItemChecked(List<PropertySemanticEntityPair> checkedPropertyItems) {

		toggleControls(prismGroup, false);
		toggleControls(mc2Group, false);

		if (checkedPropertyItems != null) {
			Set<ModelcheckingTarget> targets = new HashSet<>();

			for (PropertySemanticEntityPair item : checkedPropertyItems) {
				List<ModelcheckingTarget> availableTargets = FilteringManager.getInstance().getModelcheckingTargets(item.property);
				VerificationType verificationType = (VerificationType) ddlVerificationType.getData(ddlVerificationType.getText());
				ModelcheckingTarget target = ModelcheckingUtil.getInstance().getPreferredTarget(availableTargets, verificationType);

				targets.add(target);
			}

			for (ModelcheckingTarget target : targets) {
				switch (target) {
				case PRISM:
					toggleControls(prismGroup, true);
					break;
				case MC2:
					toggleControls(mc2Group, true);
					break;
				default:
					break;
				}
			}
		}

		parentComposite.layout();
	}

	private void toggleControls(Control control, boolean asVisible) {
		GridData layoutData = (GridData) control.getLayoutData();
		layoutData.exclude = !asVisible;
		control.setVisible(asVisible);
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
