// Interfascia -- ALPHA 001

package interfascia;
import processing.core.*;
import java.awt.event.*;

		parent.registerMouseEvent(this);
	}

	public void mouseEvent (MouseEvent e) {
		if (e.getID() == MouseEvent.MOUSE_PRESSED) {
			if (isMouseOver (parent.mouseX, parent.mouseY)) {
			if (wasClicked && isMouseOver (parent.mouseX, parent.mouseY)) {
					fireEventNotification(this, "Unchecked");
					selected = false;
				} else {
					fireEventNotification(this, "Checked");
					selected = true;
				}
	}
	
	public void keyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_TYPED && e.getKeyChar() == ' ') {
			fireEventNotification(this, "Selected");
			if (selected) {
	}

		parent.stroke(lookAndFeel.borderColor);