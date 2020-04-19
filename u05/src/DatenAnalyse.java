import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import gui.Window; // dieser Import wird benoetigt, falls das Histogramm in einem Fenster gezeichnet wird und die Window-Klasse verwendet wird

public class DatenAnalyse {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("groessen.txt"));
		int[] groessen = liesGroessen(scanner);
		scanner.close();

		einfacheAnalyse(groessen);

		int histMin = 140; // Wir nehmen an, dass alle Groessen >= 1.40m sind
		int histMax = 200; // Wir nehmen an, dass alle Groessen < 2.00m sind
		histogrammAnalyse(groessen, histMin, histMax);
	}

	/**
	 * Liest die Körpergrössen von dem gegebenen Scanner ein und gibt sie als Array
	 * zurück.
	 */
	static int[] liesGroessen(Scanner scanner) {
		int length = scanner.nextInt();
		int[] groessen = new int[length];
		for (int i = 0; i < groessen.length; i++) {
			groessen[i] = scanner.nextInt();
		}
		return groessen;
	}

	/**
	 * Macht eine einfache Datenanalyse: Gibt die Anzahl Daten, das Minimum, das
	 * Maximum und den Durchschnitt der Körpergrössen aus.
	 */
	static void einfacheAnalyse(int[] groessen) {
		int maxValue = max(groessen);
		int minValue = min(groessen);
		double avgValue = average(groessen);
		System.out.println(maxValue);
		System.out.println(minValue);
		System.out.println(avgValue);

	}

	public static int max(int[] a) {
		int temp = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (temp <= a[i]) {
				temp = a[i];
			}
		}
		return temp;
	}

	public static int min(int[] b) {
		int temp = Integer.MAX_VALUE;
		for (int i = 0; i < b.length; i++) {
			if (temp >= b[i]) {
				temp = b[i];
			}
		}
		return temp;
	}

	public static double average(int[] c) {
		int i = 0;
		double temp = 0;
		while (!(c.length == i)) {
			temp = temp + c[i];
			i = i + 1;
		}
		temp = temp / c.length;
		return temp;
	}

	/**
	 * Erstellt ein Histogramm der Körpergrössen und gibt es aus. Zuerst wird der
	 * Benutzer nach der Anzahl Histogramm-Klassen gefragt.
	 */
	static void histogrammAnalyse(int[] groessen, int histMin, int histMax) {
		System.out.println("Geben Sie an wieviele Kästchen sie in ihrem Histogramm wollen.");
		Scanner scanner = new Scanner(System.in);	
	
		int anzahlKlassen = scanner.nextInt();
		System.out.println(anzahlKlassen);
		int klassenBreite=klassenBreite(histMin,histMax,anzahlKlassen);
		int[] hist= erstelleHistogramm(groessen, histMin, histMax, anzahlKlassen);
		
		for(int i = 0; i < anzahlKlassen; i++) {
			System.out.print("[" + (histMin + klassenBreite * i) + ", " + (histMin + klassenBreite * (i + 1)) + ") ");
			for(int j = 0; j < hist[i]; j++) {
				System.out.print("|");
			}
			System.out.println();
		}
	}

	/**
	 * Erstellt von den Körpergrössen in dem "groessen"-Array ein Histogramm mit den
	 * gegebenen Grössen Minimum, Maximum und Anzahl Klassen.
	 * 
	 * @return das Histogramm, als Array. Jedes Element entspricht einer Klasse im
	 *         Histogramm und enthält die Anzahl Körpergrössen in dieser Klasse.
	 */
	static int[] erstelleHistogramm(int[] groessen, int histMin, int histMax, int anzahlKlassen) {
		int klassenBreite=klassenBreite(histMin,histMax,anzahlKlassen);
		int[] hist = new int[anzahlKlassen];
		for(int i = 0; i<groessen.length; i++) {
			int klasse = 0;
			klasse = (groessen[i] - histMin)/klassenBreite;
			hist[klasse] = hist[klasse]+1;
		}
		return hist;
	}

	/**
	 * Gibt die Klassenbreite in einem Histogramm mit den gegebenen Grössen Minimum,
	 * Maximum und Anzahl Klassen zurück. Falls sich die gesamte Breite des
	 * Histogramms nicht restlos auf die Klassen aufteilen lässt, wird die
	 * Klassenbreite aufgerundet. Das heisst, dass das Histogramm "histMax"
	 * überschreiten kann.
	 */
	static int klassenBreite(int histMin, int histMax, int klassen) {
		int klassenBreite;
		if ((histMax - histMin) % klassen == 0) {
			klassenBreite = (histMax - histMin) / klassen;
		} else {
			klassenBreite = (histMax - histMin) / klassen + 1;
		}
		return klassenBreite;

	}

}
