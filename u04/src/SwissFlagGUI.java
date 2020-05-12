import gui.Window;

public class SwissFlagGUI {

	public static void main(String[] args) {
		
		int size=400;
		
		Window window = new Window("Fahne", size, size);

		window.setColor(225, 26, 39);
		window.fillRect(0, 0, size, size); // roter hintergrund

		window.setColor(225, 255, 255);
		window.fillRect(80, 160, 240, 80);
		window.fillRect(160, 80, 80, 240); // weisses kreuz

		window.open();
		window.waitUntilClosed();

	}

}

