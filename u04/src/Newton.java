import java.util.Scanner;

/*Author: Thomas Greminger
Dieses Programm verlangt einen Double als Input und rechnet mittels dem 
Gauss Algorithmus die Quadratwurzel aus.

Datum: 17.10.2019*/

public class Newton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein:");
		double c = console.nextDouble();
		console.close();
		System.out.println("Sie haben eingegeben:" + c);

		double t = c / 2;
		double eps = 1e-12;
		while (Math.abs(t * t - c) > eps) {
			t = (c / t + t) / 2;
//			System.out.println(t*t);
		}
		System.out.println("Das Resultat ist:" + t);
	}

}
