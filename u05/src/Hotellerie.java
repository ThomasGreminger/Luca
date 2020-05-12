import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Hotellerie {

	public static void main(String[] args) throws FileNotFoundException {

		// Sie koennen den Inhalt von main aendern

		Scanner scanner = new Scanner(new File("hotelDaten1.txt"));
		PrintStream output = new PrintStream(System.out);

		analyse(scanner, output);
	}

	public static void analyse(Scanner input, PrintStream output) throws FileNotFoundException {
		// TODO: Lesen Sie das Dateiinhalt von input und geben Sie Ihre Loesung nach
		// output aus.

		HotelBuchung[] hotelBuchungen = einlesen();

// aufgabe 1
		int[] numberBooked = new int[256];
		for (int i = 0; i < hotelBuchungen.length; i++) {

			int temp1 = hotelBuchungen[i].roomNumber;
			numberBooked[temp1 - 1]++;
		}
		int mostBooked = 0;
		int mostBookedRoomNr = 0;
		for (int j = 0; j < numberBooked.length; j++) {
			if (mostBooked <= numberBooked[j]) {
				mostBooked = numberBooked[j];
				mostBookedRoomNr = j + 1;
			}
		}
//		aufgabe 2
		int[] longestBooked = new int[256];
		for (int i = 0; i < hotelBuchungen.length; i++) {
			int temp1 = hotelBuchungen[i].startBooking;
			int temp2 = hotelBuchungen[i].endBooking;
			int temp3 = hotelBuchungen[i].roomNumber;
			longestBooked[temp3 - 1] = longestBooked[temp3 - 1] + temp2 - temp1;
		}
		int longestBookedRoom = 0;
		int longestBookedRoomNr = 0;
		for (int j = 0; j < numberBooked.length; j++) {
			if (longestBookedRoom <= longestBooked[j]) {
				longestBookedRoom = longestBooked[j];
				longestBookedRoomNr = j + 1;
			}
		}
//	aufgabe 3
		double[] bestRoom = new double[256];
		for (int i = 0; i < hotelBuchungen.length; i++) {
			int temp3 = hotelBuchungen[i].roomNumber;
			bestRoom[temp3 - 1] = bestRoom[temp3 - 1] + hotelBuchungen[i].buchungsBetrag();
		}
		double bestBookedAmount = 0;
		int bestBookedRoomNr = 0;
		for (int j = 0; j < numberBooked.length; j++) {
			if (bestBookedAmount <= bestRoom[j]) {
				bestBookedAmount = bestRoom[j];
				bestBookedRoomNr = j + 1;
			}
		}

//				aufgabe 4
		double incomeMoney = 0;
		for (int k = 0; k < bestRoom.length; k++) {
			incomeMoney = incomeMoney + bestRoom[k];
		}

		System.out.println("Am haeufigsten gebucht: " + mostBookedRoomNr);
		System.out.println("Am meisten besetzt: " + longestBookedRoomNr);
		System.out.println("Groessten Betrag eingebracht: " + bestRoom);
		System.out.println("Gesamteinnahmen des Hotels: " + incomeMoney);
	}

	public static HotelBuchung[] einlesen() throws FileNotFoundException {

		Scanner scanner;
		scanner = new Scanner(new File("hotelDaten1.txt"));
		int numberBookings = scanner.nextInt();
		String temp = scanner.nextLine();
		HotelBuchung[] hotelBuchungen = new HotelBuchung[numberBookings];
		for (int i = 0; i < numberBookings; i++) {
			temp = scanner.nextLine();
//			System.out.println(temp);
			Scanner scanner1 = new Scanner(temp);
			int roomNumber = scanner1.nextInt();
			int startBooking = scanner1.nextInt();
			int endBooking = scanner1.nextInt();
			double cost = scanner1.nextDouble();
			int discount = scanner1.nextInt();
			hotelBuchungen[i] = new HotelBuchung(roomNumber, startBooking, endBooking, cost, discount);
		}
		return hotelBuchungen;
	}
}
