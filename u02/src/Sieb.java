import java.util.Arrays;
import java.util.Scanner;

public class Sieb {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Number");

		int limit = myObj.nextInt(); // Read user input
		System.out.println(limit);

		int[] primzahlen = new int[limit + 1];
//		Initialisieren des Arrays auf 1
		for (int i = 0; i < primzahlen.length; i++) {
			primzahlen[i] = 1;
		}

		for (int erstePrimzahl = 2; erstePrimzahl < limit + 1; erstePrimzahl++) {
			for (int multiplikator = 2; multiplikator * erstePrimzahl < limit + 1; multiplikator++) {
				primzahlen[multiplikator * erstePrimzahl] = 0;
			}
//			System.out.println(Arrays.toString(primzahlen));
		}
//		Jetzt werden die Primzahlen zussammen gezählt
		int result = 0;
		for(int i = 2; i< limit +1; i++) {
			result = result+ primzahlen[i];
		}
		System.out.println(result);
	}

}
