package roadblock.biocompiler.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;

public class ConsoleView extends ViewPart implements  IPartListener2{
		/**
	* The ID of the view as specified by the extension.
	*/
	public static final String ID = "roadblock.biocompiler.ui.views.consoleView";
	Composite parent;
	private Browser browser;

	/**
	* The constructor.
	*/
	public ConsoleView() {
	}

	/**
	* This is a callback that will allow us
	* to create the viewer and initialize it.
	*/
	public void createPartControl(Composite parent) {
		System.out.println("Calling: Console/createPartControl");
		this.parent=parent;
		browser = new Browser(parent,SWT.NONE);
		browser.setText("<body bgcolor='#ffffff'><h2>Initialisation</h2></body>");

	}
	/**
	* Passing the focus request to the viewer's control.
	*/
	public void setFocus() {
		// label.setText("Focus set at " + (new Date()));
	}
	
	// Own functions
	public void setContent(String html){
		browser.setText(html);
	}
//	public void setText(String myText){
//		textField.setText(myText);	
//	}
//	
//	public void addText(String myText){
//		textField.setText(textField.getText()+"\n"+myText);	
//	}
//	
//	public void emptyText(){
//		textField.setText("");
//	}
	
	@Override
	public void partActivated(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void partBroughtToTop(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partClosed(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partHidden(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partInputChanged(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partOpened(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partVisible(IWorkbenchPartReference arg0) {
		// TODO Auto-generated method stub
		
	} 
}
