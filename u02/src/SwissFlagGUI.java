import gui.Window;

public class SwissFlagGUI {

	public static void main(String[] args) {
		Window window = new Window("Fahne", 400, 400);

		window.steColor(225, 26, 39);
		window.fillRect(0, 0, 400, 400); // roter hintergrund

		window.steColor(225, 255, 255);
		window.fillRect(80, 160, 240, 80);
		window.fillRect(160, 80, 80, 240); // weisses kreuz

		window.open();
		window.waitUntilClosed();

	}

}
