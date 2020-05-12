import java.io.File;
import java.util.Random;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WoerterRaten {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("woerter.txt"));
		String[] woerter = liesWoerter(scanner);
		scanner.close();

		rateSpiel(woerter);
	}

	/**
	 * Liest die Wörter von dem gegebenen Scanner ein und gibt sie als Array zurück.
	 */
	static String[] liesWoerter(Scanner scanner) {
		String[] woerter = new String[scanner.nextInt()];
		for (int i = 0; i < woerter.length; i++) {
			woerter[i] = scanner.next();
		}
		return woerter;
	}

	/**
	 * Führt das Rate-Spiel einmal durch.
	 */
	static void rateSpiel(String[] woerter) {
		String zielWort = zufallsWort(woerter);
//		zielWort = "alloh";

		Boolean richtigesWortGefunden = false;
		while (!richtigesWortGefunden) {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter Word or letter");
			String tipp = myObj.nextLine();

			String h = hinweis(zielWort, tipp);

			if (h == "ist") {
				richtigesWortGefunden = true;

			} else {
				System.out.println("Uuups, falsch, hinweis:" + h);
			}

		}
		System.out.println("Super du hast das richtige wort gefunden.");

	}

	/**
	 * Wählt zufällig ein Wort aus dem "woerter"-Array aus und gibt es zurück.
	 */
	static String zufallsWort(String[] woerter) {
		Random r = new Random(2);
		int q = r.nextInt(woerter.length);
		return woerter[q];
	}

	/**
	 * Vergleicht das gegebene "wort" und die "tipp"-Zeichenkette und gibt einen
	 * Hinweis zurück. Folgende Hinweise sind möglich: "ist", "beginnt mit", "endet
	 * mit", "beginnt mit und endet mit", "enthält" oder "enthält nicht".
	 */
	static String hinweis(String wort, String tipp) {
		if (wort.equals(tipp)) {
			return "ist";
		}
		int tippLengnth = tipp.length();
		int wortLength = wort.length();
		if (wort.length() >= tipp.length()) {
			if (wort.substring(0, tippLengnth).equals(tipp)
					&& wort.substring(wortLength - tippLengnth, wortLength).equals(tipp)) {
				return "beginnt mit und endet mit";
			}
		}
		if (wort.length() >= tipp.length()) {
			if (wort.substring(0, tippLengnth).equals(tipp)) {
				return "beginnt mit";
			}
		}
		if (wort.length() >= tipp.length()) {
			if (wort.substring(wortLength - tippLengnth, wortLength).equals(tipp)) {
				return "endet mit";
			}
		}
		if (wort.contains(tipp)) {
			return "enthält";
		}
		return "enthält nicht";
	}
}
