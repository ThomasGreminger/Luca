import java.util.Scanner;
import java.util.Arrays;

public class Zahlen {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter code");

		String code = myObj.nextLine(); // Read user input
		// System.out.println("code is: " + code); // Output user input
		String sortedCode = sortString(code);
		System.out.println("Input String : " + code);
		System.out.println("sortedCode : " + sortedCode);
		int result = decode(sortedCode);
		if (result == -1) {
			System.out.println("Ungülteriger Code...");
		} else {
			System.out.println(result);

		}

	}

	public static String sortString(String inputString) {
		// convert input string to char array
		char tempArray[] = inputString.toCharArray();

		// sort tempArray
		Arrays.sort(tempArray);

		// return new sorted string
		return new String(tempArray);
	}

	public static int decode(String sortedCode) {
		if (sortedCode.equals("abcdef")) {
			return 0;
		}
		if (sortedCode.equals("bc")) {
			return 1;
		}
		if (sortedCode.equals("abdeg")) {
			return 2;
		}
		if (sortedCode.equals("abcdg")) {
			return 3;
		}
		if (sortedCode.equals("bcfg")) {
			return 4;
		}
		if (sortedCode.equals("acdfg")) {
			return 5;
		}
		if (sortedCode.equals("acdefg")) {
			return 6;
		}
		if (sortedCode.equals("abc")) {
			return 7;
		}
		if (sortedCode.equals("abcdefg")) {
			return 8;
		}
		if (sortedCode.equals("abcdfg")) {
			return 9;
		}
		return -1;
	}
}
