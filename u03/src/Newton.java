import java.util.Scanner;

public class Newton {

	public static void main(String[] args) {
		System.out.println("Geben Sie eine possitive ganze Zahlle ein.");
		Scanner j = new Scanner(System.in);
		int c = j.nextInt();
		System.out.println(c);
		double t = 1.0;
		double epsilon = 0.000000001;
		
		while (!(-epsilon < c - t * t && c - t * t < epsilon)) {
			t = (t + c/t) / 2;
		}
		System.out.println(t);
	}

}
