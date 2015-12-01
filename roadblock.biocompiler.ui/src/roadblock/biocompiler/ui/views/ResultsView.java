package roadblock.biocompiler.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;

public class ResultsView extends ViewPart implements IPartListener2 {
	Composite parent;

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "roadblock.biocompiler.ui.views.resultsView";

	private Browser browser;

	/**
	 * The constructor.
	 */
	public ResultsView() {
		System.out.println("Calling Results/Results");
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		this.parent = parent;
		browser = new Browser(parent, SWT.NONE);
		browser.setText("<body bgcolor='#ffffff'><h2>Initialisation</h2></body>");
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {

	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		// // TODO Auto-generated method stub
		// IWorkbenchPart part = partRef.getPart(true);
		// if (part instanceof XtextEditor) {
		// XtextEditor editor = (XtextEditor) part;
		// if (editor.getLanguageName().equals("org.icos.subtext.Subtext")) {
		// IReadAccess<XtextResource> document = editor.getDocument();
		// Resource resource = document.readOnly(new
		// IUnitOfWork<XtextResource,XtextResource>() {
		// public XtextResource exec(XtextResource state) {
		// return state;
		// }
		// });
		// currentResource = resource;
		// propertyChange(
		// new PropertyChangeEvent(resource, SubtextResourceScopeCache.MODEL,
		// null,
		// cache.getModel(resource)));
		// }
		// }
		//
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
	public void partDeactivated(IWorkbenchPartReference partRef) {
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

	protected void updateUI() {

	}

	@Override
	public void dispose() {
		// getSite().getPage().removePartListener(this);
	}

	// my own functions
	public void setContent(String html) {
		browser.setText(html);
	}
}