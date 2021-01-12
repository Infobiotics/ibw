package roadblock.resource;

import java.util.Observable;
import java.util.Observer;

import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class IblResourceObservable extends Observable implements IPartListener2 {

	private static IblResourceObservable instance = new IblResourceObservable();
	private XtextResource currentIblResource;
	private String iblLanguageName = "roadblock.xtext.ibl.Ibl";

	public static IblResourceObservable getInstance() {
		return instance;
	}

	private IblResourceObservable() {
	}

	public XtextResource getCurrentIblResource() {
		return currentIblResource;
	}

	private void inspectPart(IWorkbenchPartReference partRef) {
		IWorkbenchPart part = partRef.getPart(true);

		if (part instanceof XtextEditor) {

			XtextEditor iblEditor = (XtextEditor) part;

			if (iblEditor.getLanguageName().equals(iblLanguageName)) {

				IXtextDocument iblDocument = iblEditor.getDocument();

				XtextResource iblResource = iblDocument.readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
					@Override
					public XtextResource exec(XtextResource state) throws Exception {
						return state;
					}
				});

				/*
				if (iblResource != null && iblResource != currentIblResource) {
					currentIblResource = iblResource;
					setChanged();
					notifyObservers(currentIblResource);
				}
				*/
				
				if (iblResource.getErrors().size() == 0) {
					currentIblResource = iblResource;
					setChanged();
					notifyObservers(currentIblResource);
				}
			}
		}
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		inspectPart(partRef);
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
		inspectPart(partRef);
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
		inspectPart(partRef);
	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);

		if (currentIblResource != null) {
			setChanged();
			notifyObservers(currentIblResource);
		}
	}
}
