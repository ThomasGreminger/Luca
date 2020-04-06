import java.util.Scanner;

public class Reihe {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int userNumber;
		// Enter userNumber and press enter
		System.out.println("Enter your Number");
		userNumber = myObj.nextInt();

		double S = 0;
		for (int i = 1; i <= userNumber; i = i + 1) {
			S =  1.0 / ((double)i*i)+S;
		}
		System.out.println("Das resultat ist: " + S);
	}

}
