// Interfascia -- ALPHA 001
import processing.core.*;

public class IFLookAndFeel {
	public int baseColor, borderColor, highlightColor, selectionColor, 
				activeColor, textColor, lightGrayColor, darkGrayColor;
	
	public static final char DEFAULT = 1;
	
	public IFLookAndFeel(char type) {
		
	}
	
	public void initWithParent(PApplet parent) {
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

		selectionColor = parent.color (255, 255, 0);
		borderColor = parent.color (255);
		textColor = parent.color (0);
		lightGrayColor = parent.color(100);
		darkGrayColor = parent.color(50);
		// Set the color mode back
		parent.colorMode(cMode, cModeX, cModeY, cModeZ, cModeA);
}