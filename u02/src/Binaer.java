import java.util.Scanner;

public class Binaer {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Number");

		int number = myObj.nextInt(); // Read user input
		if(number==0) {
			System.out.println("0");
		}
		int k=0;
		while(Math.pow(2,k)<=number) {
			k++;
			//System.out.println(k);
		}
		String result="";
		for(int i = k - 1; i >=0; i--) {
			if(number>= Math.pow(2,i)) {
				result=result+"1";
				number=(int) (number-Math.pow(2, i));
			} 
			else {
				result=result+"0";
			}
		}
		System.out.println(result);
	}
}
