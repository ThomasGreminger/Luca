import gui.Window;

public class Punkt {
	private double x;
	private double y;
	int r = 255;
	int g = 0;
	int b = 0;

	public Punkt(double initialX, double initialY) {
		x=initialX;
		y=initialY;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double arg) {
		x=arg;
	}

	public void setY(double arg) {
		y=arg;
	}
	
	
	public void draw(Window window) {
		window.setColor((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
		window.fillCircle(x, y, 3);
	}

	public void drawLine(Punkt punkt2, Window window) {

		window.drawLine(x, y, punkt2.x, punkt2.y);
	}
}
