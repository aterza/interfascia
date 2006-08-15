// Interfascia -- ALPHA 001
//
// A graphical user interface library for the
// Processing environment.
//
// by Brendan Berg
//
// This software is released under the LGPL?

package interfascia;
import processing.core.*;
import java.lang.reflect.*;

public class IFRadioController extends GUIComponent {
	
	public IFRadioController (String argLabel, Object l) {
		label = argLabel;
		listener = l;
		contents = new IFRadioButton[10];
	}
	
	public void setSelectedButton (IFRadioButton button) {
		buttonPressed(button);
	}
					System.out.println(ex.getCause().getMessage());