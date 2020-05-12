import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
 * Author: Luca Manna
 * für Einführung in die Programmierung
 * 
 * Analysiert einen Datensatz von Personen-Eigenschaften. Findet "ungesunde" Personen und teilt
 * alle Personen in Trainingspartner-Paare ein.
 */
public class PersonenAnalyse {

	public static void main(String[] args) {

		/**
		 * Liest die Personen-Daten von dem gegebenen Scanner ein und gibt sie als
		 * Person[] zurück.
		 */

		File myFile = new File("body.dat.txt");

		try {
			Scanner scanner = new Scanner(myFile);
			Person[] groessen = liesPersonen(scanner);

			druckeUngesunde(groessen, System.out);
			druckeGuteTrainingsPartner(groessen);

		} catch (FileNotFoundException e) {
			// do stuff here..
		}

	}

	static Person[] liesPersonen(Scanner scanner) {
		// TODO
		int length = scanner.nextInt();
		String temp = scanner.nextLine();
		Person[] personen = new Person[length];
		for (int i = 0; i < personen.length; i++) {
			String line = scanner.nextLine();
			// 42.9 17.7 28.0 21 65.6 174.0 1

			double schulterBreite = Double.parseDouble(line.substring(0, 4));
			double brustTiefe = Double.parseDouble(line.substring(5, 9));
			double brustBreite = Double.parseDouble(line.substring(10, 14));
			int alter = Integer.parseInt(line.substring(15, 17));
			double gewicht = Double.parseDouble(line.substring(18, 23));
			double groesse = Double.parseDouble(line.substring(24, 29));
			int temp1 = Integer.parseInt(line.substring(30, 31));
			boolean istMaennlich;
			if (temp1 == 1) {
				istMaennlich = true;
			} else {
				istMaennlich = false;
			}

			personen[i] = new Person(alter, gewicht, groesse, istMaennlich, schulterBreite, brustTiefe, brustBreite);
//			System.out.println(personen[i].beschreibung());

		}
		return personen;
	}

	/**
	 * Findet alle Personen, die nicht normalgewichtig sind und gibt deren
	 * Beschreibungen, sowie die entsprechende Gewichts-Klassen aus.
	 */
	static void druckeUngesunde(Person[] personen, PrintStream ausgabe) {
		for (int j = 0; j < personen.length; j++) {
			if (personen[j].bodyMassIndex() < 18.5) {
				ausgabe.println(personen[j].beschreibung() + " ist untergewichtig");
			} else if (personen[j].bodyMassIndex() >= 18.5 && personen[j].bodyMassIndex() < 25.0) {
				//System.out.println(personen[j].beschreibung() + " ist normalgewichtig");
			} else if (personen[j].bodyMassIndex() >= 25.0 && personen[j].bodyMassIndex() < 30.0) {
				ausgabe.println(personen[j].beschreibung() + " ist übergewichtig");
			} else if (personen[j].bodyMassIndex() >= 30.0) {
				ausgabe.println(personen[j].beschreibung() + " ist fettleibig");
			}

		}
	}

	/**
	 * Gibt die Partner-Qualität von zwei Trainingspartner p1 und p2 zurück. Wert
	 * liegt zwischen 0 (schlechtester Wert) und 1 (bester Wert).
	 */
	static double partnerQualitaet(Person p1, Person p2) {
		double grössenDiff = p1.groesse - p2.groesse;
		double brustDiff = p1.brustBreite * p1.brustTiefe - p2.brustBreite * p2.brustTiefe;
		double schulterDiff = p1.schulterBreite - p2.schulterBreite;
		double q = 1 / (1 + Math.pow(grössenDiff, 2) + (Math.abs(brustDiff) / 5) + (Math.pow(schulterDiff, 2) / 2));
		return q;
	}

	static void druckeGuteTrainingsPartner(Person[] personen) {
		for (int j = 0; j < personen.length; j++) {
			for (int i = j+1; i < personen.length; i++) {
				if (partnerQualitaet(personen[j], personen[i]) > 0.8) {
					System.out.println(personen[j].beschreibung());
					System.out.println(personen[i].beschreibung());
					System.out.println(partnerQualitaet(personen[j], personen[i]));

				}
			}
		}
	}
}