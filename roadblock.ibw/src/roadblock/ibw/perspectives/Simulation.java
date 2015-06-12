package roadblock.ibw.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class Simulation implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);		
		IFolderLayout leftArea = layout.createFolder("left", IPageLayout.LEFT, 0.20f, editorArea);
		IFolderLayout rightArea = layout.createFolder("right", IPageLayout.RIGHT, 0.70f, editorArea);
		IFolderLayout bottomArea = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.80f, editorArea); 
		leftArea.addView("org.eclipse.ui.navigator.ProjectExplorer");
		rightArea.addView("roadblock.simulation.ui.views.mainView");
		bottomArea.addView(IConsoleConstants.ID_CONSOLE_VIEW);
		bottomArea.addView("roadblock.simulation.ui.views.resultsView");
	}
}
