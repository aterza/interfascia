// Interfascia -- ALPHA 001

package interfascia;
import processing.core.*;
import java.awt.event.*;
	protected IFLookAndFeel lookAndFeel;
	protected int index;
	protected GUIController controller;
	
	public void setIndex(int i) {
		index = i;
	}
	
	public int getIndex() {
		return index;
	}
	
	
	public void setController (GUIController c) {
		controller = c;
	}
	
	public GUIController getController() {
		return controller;
	}
		initWithParent ();
	
	public void setLookAndFeel(IFLookAndFeel lf) {
		lookAndFeel = lf;
	}
	public void mouseEvent (MouseEvent e) {
		if (e.getID() == MouseEvent.MOUSE_PRESSED) {
			if (isMouseOver (parent.mouseX, parent.mouseY)) {
			if (wasClicked && isMouseOver (parent.mouseX, parent.mouseY)) {
	}
	
	public void keyEvent (KeyEvent e) {
	}
					// Spit out the cause of the exception
					System.out.println(ex.getCause().getMessage());