package roadblock.biocompiler.ui.views;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
import org.eclipse.xtext.ui.util.ResourceUtil;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.biocompiler.ui.Activator;
import roadblock.biocompiler.ui.util.BiocompilationUtil;
import roadblock.bin.BinaryPathProvider;

public class MainView extends ViewPart implements IPartListener2 {

	public static final String ID = "roadblock.biocompiler.ui.views.mainView";

	private Model model;
	private String dataDirectory = null;
	private XtextResource currentIblResource;

	private Button compilationButton;
	private Button refreshButton;
	private Browser browser;
	private MessageConsole atgcConsole;

	private String pathToBiocompiler = BinaryPathProvider.getInstance()
			.getAtgcPath();

	@Override
	public void createPartControl(Composite parent) {

		atgcConsole = new MessageConsole("Raw output", null);

		ConsolePlugin.getDefault().getConsoleManager()
				.addConsoles(new IConsole[] { atgcConsole });
		ConsolePlugin.getDefault().getConsoleManager()
				.showConsoleView(atgcConsole);

		// add change listener model
		getSite().getPage().addPartListener(this);

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
		refreshButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 3, 1));
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
		compilationButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 3, 1));
		compilationButton.setEnabled(false);

		// browser
		browser = new Browser(parent, SWT.FILL);
		browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		browser.setText("<BODY > empty model</BODY>");
	}

	private void refreshModel() {
		if (currentIblResource == null)
			System.out.println("CurrentIblresource is null");
		if (currentIblResource.getErrors().size() == 0) {
			updateUi();
			// runBiocompiler(config.dataDirectory +
			// "/src-gen/EMFModelForBiocompiler.xml", "parse");
			compilationButton.setEnabled(true);
		}
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		IWorkbenchPart part = partRef.getPart(true);
		if (part instanceof XtextEditor) {
			XtextEditor iblEditor = (XtextEditor) part;
			if (iblEditor.getLanguageName().equals("roadblock.xtext.ibl.Ibl")) {
				IXtextDocument iblDocument = iblEditor.getDocument();
				XtextResource iblResource = iblDocument
						.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
							@Override
							public XtextResource exec(XtextResource state)
									throws Exception {
								return state;
							}
						});

				if (iblResource != currentIblResource) {
					currentIblResource = iblResource;
					ensureConfig();
				}

			}
		}
	}

	@Override
	public void dispose() {
		getSite().getPage().removePartListener(this);
	}

	public void runBiocompiler(final String xmlFilename, final String command) {
		 String wrapperName = "atgcWrapper.sh"; // default wrapper
		if (System.getProperty("os.name").startsWith("Windows"))
			wrapperName = "atgcWrapper.bat";
		
		final String wrapperName2 = wrapperName;

		final MessageConsoleStream consoleStream = atgcConsole
				.newMessageStream();
		try {


			// run the biocompiler
			System.out.println("Running the biocompiler");

			IRunnableWithProgress verificationTask = new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {

					Process runningProcess = null;

					try {
						final Process process = runningProcess = new ProcessBuilder(
								pathToBiocompiler + File.separator
										+ wrapperName2, xmlFilename,
								dataDirectory + File.separator + "src-gen",
								command).start();

						Thread streamingThread = new Thread(new Runnable() {
							public void run() {

								try {
									BufferedReader in = new BufferedReader(
											new InputStreamReader(
													process.getInputStream()));
									BufferedReader err = new BufferedReader(
											new InputStreamReader(
													process.getErrorStream()));

									String part = null;
									while ((part = in.readLine()) != null) {
										consoleStream.println(part);
									}
									in.close();

									while ((part = err.readLine()) != null) {
										consoleStream.println(part);
									}
									err.close();

								} catch (IOException e) {
									process.destroy();
								}
							}
						});

						streamingThread.start();

						while (!monitor.isCanceled()
								&& streamingThread.isAlive()) {
						}

						if (streamingThread.isAlive()) {
							streamingThread.interrupt();
							throw new IOException(); // replaced break
						}

						process.destroy();
						monitor.done();

					} catch (IOException e) {
						if (runningProcess != null) {
							runningProcess.destroy();
						}
						errorDialogWithStackTrace(
								"Failed to compile the model", e);
					}
				}
			};

			 try {
				 ProgressMonitorDialog progressDialog = new
				 ProgressMonitorDialog(getSite().getWorkbenchWindow().getShell());
				 progressDialog.getProgressMonitor().setTaskName("Compilation...");
				 progressDialog.run(true, true, verificationTask);
			 } catch (InvocationTargetException | InterruptedException e) {
				 errorDialogWithStackTrace("Failed to compile the model", e);
			 }

			/*
			 * InputStream is = process.getInputStream(); InputStream is2 =
			 * process.getErrorStream(); InputStreamReader isr = new
			 * InputStreamReader(is); InputStreamReader isr2 = new
			 * InputStreamReader(is2); BufferedReader br = new
			 * BufferedReader(isr); BufferedReader br2 = new
			 * BufferedReader(isr2); String line="";
			 * 
			 * System.out.println("##########  Error stream ############");
			 * 
			 * while ((line = br2.readLine()) != null) {
			 * System.out.println(line); consoleStream.println(line);
			 * 
			 * }
			 * 
			 * System.out.println("##########  Input stream ############");
			 * while ((line = br.readLine()) != null) {
			 * System.out.println(line); consoleStream.println(line); } } catch
			 * (IOException e) {
			 * System.out.println("Problem when creating the xml"); }
			 */

		} catch (Exception e) {

		}
	}

	protected void updateUi() {
		System.out.println("Calling updateUi");
		if (currentIblResource == null) {
			compilationButton.setEnabled(false);
		} else {

			model = BiocompilationUtil.getInstance().getModel(
					currentIblResource);
			compilationButton.setEnabled(true);
			System.out.println(model);
			try {
				// convert the model to XML
				System.out.println("Converting to XML");
				String xml = convertToXml(model);

				// save XML as file
				System.out.println("Saving to XML");
				String xmlFilename = dataDirectory
						+ "/src-gen/EMFModelForBiocompiler.xml";
				writeTextFile(xmlFilename, xml);

				runBiocompiler(xmlFilename, "parse");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				String identifiedParts = readFile(dataDirectory
						+ "/src-gen/identifiedParts.html",
						Charset.defaultCharset());
				browser.setText(identifiedParts);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private void ensureConfig() {
		if (dataDirectory == null) {
			dataDirectory = ResourcesPlugin.getWorkspace().getRoot()
					.getLocation().toOSString()
					+ ResourceUtil.getFile(currentIblResource).getFullPath()
							.removeLastSegments(1).toOSString();
			// create a src-gen folder if there isn't one.
			File f = new File(dataDirectory + File.separator + "src-gen");
			if (!f.exists()) {
				try {
					f.mkdirs();
				} catch (SecurityException e) {
					e.printStackTrace();
				}
			}

		}
	}

	private void updateConsoleView() {
		ConsoleView myConsole = (ConsoleView) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.findView("roadblock.biocompiler.ui.views.consoleView");
		try {
			String console = readFile(dataDirectory + "/src-gen/console.html",
					Charset.defaultCharset());
			myConsole.setContent(console);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void updateResultsView() {
		ResultsView resultsView = (ResultsView) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.findView("roadblock.biocompiler.ui.views.resultsView");
		try {
			String console = readFile(dataDirectory + "/src-gen/results.html",
					Charset.defaultCharset());
			resultsView.setContent(console);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Compile
	private void performCompilation() {

		runBiocompiler(dataDirectory + "/src-gen/EMFModelForBiocompiler.xml",
				"compile");
		updateConsoleView();
		updateResultsView();
		compilationButton.setEnabled(false);
	}

	// export an EMF model to XML
	// via http://techblog.goelite.org/sending-emf-models-via-soap/
	public static String convertToXml(EObject eObject) throws IOException {
		XMLResourceImpl resource = new XMLResourceImpl();
		XMLProcessor processor = new XMLProcessor();
		resource.getDefaultSaveOptions().put(
				XMLResourceImpl.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
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
			childStatuses.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					line));
		}
		MultiStatus ms = new MultiStatus(Activator.PLUGIN_ID, IStatus.ERROR,
				childStatuses.toArray(new Status[] {}),
				t.getLocalizedMessage(), t);
		ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Error",
				msg, ms);
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
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
