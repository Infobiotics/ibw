package roadblock.simulation.ui.views;

import org.eclipse.swt.widgets.Composite;
import org.csstudio.swt.xygraph.figures.XYGraph;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;

public class ResultsView extends ViewPart implements IPartListener2 {
	Composite parent;

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "roadblock.simulation.ui.views.resultsView";

	private XYGraph xyGraph; // = new XYGraph();
	
	/**
	 * The constructor.
	 */
	public ResultsView() {
		System.out.println("Calling Results/Results");
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		this.parent = parent;
		// TODO XY Graph
	}


	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
	}

	
	protected void updateUI() {
	}
	
	@Override
	public void dispose() {
	}
	
	// my own functions
	public void setContent(){
		// TODO do work here?
	}
}