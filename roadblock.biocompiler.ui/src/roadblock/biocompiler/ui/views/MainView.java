package roadblock.biocompiler.ui.views;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;

import roadblock.biocompiler.Biocompiler;
import roadblock.biocompiler.ui.Activator;
import roadblock.biocompiler.ui.util.BiocompilationUtil;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.resource.IblResourceObservable;

public class MainView extends ViewPart implements Observer {

	public static final String ID = "roadblock.biocompiler.ui.views.mainView";

	private Model model;
	private String biocopilationWorkspace = String.format("%s%s%s%s%s%s", Platform.getLocation().toString(),
			File.separator, ".tmp", File.separator, "biocompilation", File.separator);
	private XtextResource currentIblResource;

	private Button compilationButton;
	private Button refreshButton;
	private Browser browser;
	private MessageConsole atgcConsole;

	@Override
	public void createPartControl(Composite parent) {

		atgcConsole = new MessageConsole("Biocompilation Output", null);
		atgcConsole.activate();

		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { atgcConsole });
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(atgcConsole);

		// create widget layout
		GridLayout layout = new GridLayout(1, false);
		layout.marginRight = 5;
		parent.setLayout(layout);

		// create refresh button
		refreshButton = new Button(parent, SWT.PUSH);
		refreshButton.setText("Refresh model");
		refreshButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				refreshModel();
			}
		});
		refreshButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		refreshButton.setEnabled(true);

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

		// add change listener model
		getSite().getPage().addPartListener(IblResourceObservable.getInstance());
		IblResourceObservable.getInstance().addObserver(this);
	}

	private void refreshModel() {
		if (currentIblResource == null)
			System.out.println("CurrentIblresource is null");
		if (currentIblResource.getErrors().size() == 0) {
			updateUi();
			compilationButton.setEnabled(true);
		}
	}

	@Override
	public void dispose() {
		getSite().getPage().removePartListener(IblResourceObservable.getInstance());
		IblResourceObservable.getInstance().deleteObserver(this);
	}

	public void runBiocompiler(final String xmlFilename, final String command) {

		final MessageConsoleStream consoleStream = atgcConsole.newMessageStream();

		try {
			// run the biocompiler
			System.out.println("Running the biocompiler");

			IRunnableWithProgress verificationTask = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

					System.setOut(new PrintStream(consoleStream));
					System.setErr(new PrintStream(consoleStream));

					Biocompiler.execute(xmlFilename);

					System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
				}
			};

			try {
				ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
						getSite().getWorkbenchWindow().getShell());
				progressDialog.getProgressMonitor().setTaskName("Compilation...");
				progressDialog.run(true, true, verificationTask);
			} catch (InvocationTargetException | InterruptedException e) {
				errorDialogWithStackTrace("Failed to compile the model", e);
			}
		} catch (Exception e) {

		}
	}

	protected void updateUi() {
		System.out.println("Calling updateUi");
		if (currentIblResource == null) {
			compilationButton.setEnabled(false);
		} else {

			model = BiocompilationUtil.getInstance().getModel(currentIblResource);
			compilationButton.setEnabled(true);
			System.out.println(model);
			try {
				// convert the model to XML
				System.out.println("Converting to XML");
				String xml = convertToXml(model);

				// save XML as file
				System.out.println("Saving to XML");
				String xmlFilename = biocopilationWorkspace + "EMFModelForBiocompiler.xml";
				writeTextFile(xmlFilename, xml);

				runBiocompiler(xmlFilename, "parse");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				String identifiedParts = readFile(biocopilationWorkspace + "identifiedParts.html",
						Charset.defaultCharset());
				browser.setText(identifiedParts);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private void updateConsoleView() {
		ConsoleView myConsole = (ConsoleView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.findView("roadblock.biocompiler.ui.views.consoleView");
		try {
			String console = readFile(biocopilationWorkspace + "console.html", Charset.defaultCharset());
			myConsole.setContent(console);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void updateResultsView() {
		ResultsView resultsView = (ResultsView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.findView("roadblock.biocompiler.ui.views.resultsView");
		try {
			String console = readFile(biocopilationWorkspace + "results.html", Charset.defaultCharset());
			resultsView.setContent(console);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Compile
	private void performCompilation() {

		runBiocompiler(biocopilationWorkspace + "EMFModelForBiocompiler.xml", "compile");
		updateConsoleView();
		updateResultsView();
		compilationButton.setEnabled(false);
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

	// read file into a string
	public String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return encoding.decode(ByteBuffer.wrap(encoded)).toString();
	}

	public void writeTextFile(String fileName, String s) {

		FileWriter output = null;

		try {
			File file = new File(fileName);
			file.getParentFile().mkdirs();
			output = new FileWriter(file);
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
		MultiStatus ms = new MultiStatus(Activator.PLUGIN_ID, IStatus.ERROR, childStatuses.toArray(new Status[] {}),
				t.getLocalizedMessage(), t);
		ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Error", msg, ms);
	}

	@Override
	public void setFocus() {
		// Auto-generated method stub

	}

	@Override
	public void update(Observable o, Object arg) {
		if (IblResourceObservable.getInstance().getCurrentIblResource() != null) {
			currentIblResource = IblResourceObservable.getInstance().getCurrentIblResource();
		}
	}

}
