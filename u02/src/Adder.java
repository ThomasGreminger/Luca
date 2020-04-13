import java.util.Scanner;

public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Geben Sie Zahl 1 ein:");
		int z1 = console.nextInt();

		System.out.println("Geben Sie Zahl 1 ein:");
		int z2 = console.nextInt();
		System.out.println(z1 + "+" + z2 + "=" + (z1 + z2));

	}

}
