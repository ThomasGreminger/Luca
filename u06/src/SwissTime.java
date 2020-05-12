import java.util.Scanner;

public class SwissTime {

	public static void main(String[] args) {

		String result = toSwissGerman("12:45");
		System.out.println(result);
		System.out.println(toSwissGerman("12:33"));
		System.out.println(toSwissGerman("23:59"));
		System.out.println(toSwissGerman("00:00"));
	}

	public static String toSwissGerman(String time) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter hours");
//		int timeHours = scanner.nextInt();
//		System.out.print("Enter minutes");
//		int timeMinutes = scanner.nextInt();

		int timeHours = Integer.parseInt(time.substring(0, 2));
		int timeMinutes = Integer.parseInt(time.substring(3, 5));

		if (!(timeHours >= 0 && timeHours <= 23)) {
			System.out.println("Invalid date!");
			return "Error";
		}
		if (!(timeMinutes >= 0 && timeMinutes <= 59)) {
			System.out.println("Invalid date!");
			return "Error";
		}

		String tempResult1;
		String tempResult2 = "";
		String tempResult3 = "";
		if (timeMinutes == 15) {
			tempResult1 = "virtel ab ";
		} else if (timeMinutes >= 25 && timeMinutes < 30) {
			// timeHours = timeHours + 1;
			tempResult1 = (30 - timeMinutes) + " vor halbi ";
		} else if (timeMinutes == 30) {
			timeHours = timeHours + 1;
			tempResult1 = "halb ";
		} else if (timeMinutes > 30 && timeMinutes <= 35) {
			timeHours = timeHours + 1;
			tempResult1 = timeMinutes - 30 + " ab halbi ";
		} else if (timeMinutes == 45) {
			timeHours = timeHours + 1;
			tempResult1 = "virtel vor ";
		} else if (timeMinutes > 0 && timeMinutes < 25) {
			tempResult1 = timeMinutes + " ab ";
		} else if (timeMinutes > 25 && timeMinutes <= 59) {
			timeHours = timeHours + 1;
			tempResult1 = (60 - timeMinutes) + " vor ";
		} else if (timeMinutes == 0) {
			tempResult1 = "12i";
		} else {
			System.out.println("Invalid date!");
			return "Error";
		}
		
		if(timeHours>=0 && timeHours<=5 || timeHours>21 && timeHours<=24) {
			tempResult3= " znacht";
		} else if(timeHours>5 && timeHours<= 10) {
			tempResult3= " am morge";
		} else if (timeHours>10 && timeHours<=13) {
			tempResult3 = " am mittag";
		} else if(timeHours>13 && timeHours>=17) {
			tempResult3=" am nammitag";
		} else if (timeHours>17&&timeHours<=21) {
			tempResult3=" am abig";
		}
		
		if (timeHours > 0 && timeHours <=12) {
			tempResult2 = String.valueOf(timeHours);
		} else if(timeHours>12 && timeHours<=24) {
			tempResult2 = String.valueOf(timeHours - 12);
		}

			return tempResult1 + tempResult2 + tempResult3;
		// return "Sollte niiiiii hierherkommen";
	}
}
