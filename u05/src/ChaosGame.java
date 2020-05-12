import gui.Window;

public class ChaosGame {

	public static void main(String[] args) {
		Window window = new Window("Chaos", 800, 800);
		window.open();

		Punkt startPunkt;
		startPunkt = new Punkt((Math.random() * 790), (Math.random() * 790));
//		startPunkt.x=(Math.random() * 790);
//		startPunkt.y= (Math.random() * 790);

		Punkt[] dreieck = new Punkt[3];
		for (int i = 0; i < dreieck.length; i++) {
			dreieck[i] = new Punkt((Math.random() * 790), (Math.random() * 790)); // new Punkt(Math.random() *
																					// 790,Math.random() * 790);
			dreieck[i].r = 0;
			dreieck[i].g = 0;
			dreieck[i].b = 0;
		}

		dreieck[0].draw(window);
		dreieck[1].draw(window);
		dreieck[2].draw(window);
		dreieck[0].drawLine(dreieck[1], window);
		dreieck[1].drawLine(dreieck[2], window);
		dreieck[2].drawLine(dreieck[0], window);

		while (window.isOpen()) {
			int randomCorner = (int) (Math.random() * 3);

			startPunkt.setX((startPunkt.getX() + dreieck[randomCorner].getX()) / 2);
			startPunkt.setY((startPunkt.getY() + dreieck[randomCorner].getY()) / 2);

			startPunkt.draw(window);

			window.refresh(20);
		}
	}

}
