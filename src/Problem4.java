import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

public class Problem4 extends GraphicsProgram {

	private static final int SQUARE_SIZE = 75;
	private static final int NROWS = 4;
	private static final int NCOLUMNS = 7;
	private GImage frog; 
	private double fx; 
	private double fy; 
	public static final int APPLICATION_WIDTH = NCOLUMNS * SQUARE_SIZE;
	public static final int APPLICATION_HEIGHT = NROWS * SQUARE_SIZE;

	public void run() {
		frog = new GImage("frog.gif");
		fx = (NCOLUMNS / 2 + 0.5) * SQUARE_SIZE;
		fy = (NROWS - 0.5) * SQUARE_SIZE;
		add(frog, fx - frog.getWidth() / 2, fy - frog.getHeight() / 2);
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		double mx = e.getX();
		double my = e.getY();
		if (Math.abs(mx - fx) > Math.abs(my - fy)) {
			if (mx > fx) {
				moveFrog(SQUARE_SIZE, 0);
			} else {
				moveFrog(-SQUARE_SIZE, 0);
			}
		} else {
			if (my > fy) {
				moveFrog(0, SQUARE_SIZE);
			} else {
				moveFrog(0, -SQUARE_SIZE);
			}
		}
	}

	private void moveFrog(double dx, double dy) {
		if (insideFroggerWorld(fx + dx, fy + dy)) {
			fx += dx;
			fy += dy;
			frog.move(dx, dy);
		}
	}

	private boolean insideFroggerWorld(double x, double y) {
		return (x >= 0 && x <= NCOLUMNS * SQUARE_SIZE && y >= 0 && y <= NROWS * SQUARE_SIZE);
	}

}