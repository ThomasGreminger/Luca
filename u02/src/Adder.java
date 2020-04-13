<<<<<<< HEAD
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
=======
import java.util.Scanner;

public class Adder {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    int number1;
	    	//Enter username and press enter
	    System.out.println("Enter first Number"); 
	    number1 = myObj.nextInt();
	
	    
	    int number2;
	    	//Enter username and press enter
	    System.out.println("Enter second Number"); 
	    number2 = myObj.nextInt();
	    
	    System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
	}

}
>>>>>>> 250c2b8e187b7cefb17d6667fd5dd14411c3b517
