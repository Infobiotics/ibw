package roadblock.ibw.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class Modelchecking implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);

		IFolderLayout leftArea = layout.createFolder("left", IPageLayout.LEFT, .2f, editorArea);
		leftArea.addView("org.eclipse.ui.navigator.ProjectExplorer");

		IFolderLayout rightArea = layout.createFolder("right", IPageLayout.RIGHT, .7f, editorArea);
		rightArea.addView("roadblock.modelchecking.ui.views.mainView");

		layout.addView(IConsoleConstants.ID_CONSOLE_VIEW, IPageLayout.BOTTOM, .7f, editorArea);
	}
}
