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
