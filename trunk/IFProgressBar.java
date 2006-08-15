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

public class IFProgressBar extends GUIComponent {
	

	public void initWithParent () {
		parent.registerDraw(this);
		
		// Play nicely with other people's draw methods. They
		// may have changed the color mode.
		int cMode;
		float cModeX, cModeY, cModeZ, cModeA;

		cMode = parent.g.colorMode;
		cModeX = parent.g.colorModeX;
		cModeY = parent.g.colorModeY;
		cModeZ = parent.g.colorModeZ;
		cModeA = parent.g.colorModeA;
		parent.colorMode(parent.RGB, 255);

		progressColor = parent.color(255, 153, 51);
		borderColor = parent.color(255);
		
		// Set the color mode back
		parent.colorMode(cMode, cModeX, cModeY, cModeZ, cModeA);

	// Overriding the inherited mousePressed and mouseReleased
	// because the progress bar doesn't need to react to them.

	public void mousePressed (int mouseX, int mouseY) {
	}

	public void mouseReleased (int mouseX, int mouseY) {
	}
		parent.stroke (borderColor);
	}
