import gui.Window;
import java.util.Scanner;

/**
 * Programm zeichnet eine Schweizer Fahne
 * 
 * @author Thomas Datum: 18.10.2019
 *
 */
public class RealSwissFlag {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Geben Sie die grösse der Schwizer Fahne ein:");

		int windowSize = 400;
		Window window = new Window("Fahne", windowSize, windowSize);
		int flagOrigin = 50;
//		int flagSize = (windowSize - flagOrigin) / 5 * 4;
//		int flagSize = (windowSize - 2 * flagOrigin);
		int flagSize=console.nextInt();
		window.setColor(225, 26, 39);// rgb of swiss flag 225/26/39
		window.fillRect(flagOrigin, flagOrigin, flagSize, flagSize);
		window.setColor(256, 256, 256);
		int crossSize = flagSize / 5;

		// center white area
		
		window.fillRect(flagOrigin + 2 * crossSize, flagOrigin + 2 * crossSize,crossSize, crossSize); // top white area 
		window.fillRect(flagOrigin + 2 *crossSize, flagOrigin + 1 * crossSize, crossSize, crossSize); // left white
	    window.fillRect(flagOrigin + 1 * crossSize, flagOrigin + 2 * crossSize,crossSize, crossSize); // bottom white area 
	    window.fillRect(flagOrigin + 2 *crossSize, flagOrigin + 3 * crossSize, crossSize, crossSize); // left white
		window.fillRect(flagOrigin + 3 * crossSize, flagOrigin + 2 * crossSize,crossSize, crossSize); window.open();
		 
		window.waitUntilClosed();
	}

}
