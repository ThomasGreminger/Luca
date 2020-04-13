
/**
 * @author manna
 *
 */
public class Extra {

	public static void main(String[] args) {
		printLinie1(); // TODO Auto-generated method stub
		printLinie2();
		printLinie1();
		printLinie2();
		printLinie1();
		printLinie2();
		printLinie1();
		printLinie2();
<<<<<<< HEAD
		
		//2
		for(int lineLoop=0;lineLoop<9;lineLoop++) {
		
			//....1....
			int numberNumbers;
			if (lineLoop<5) {
				numberNumbers=1+2*lineLoop;
			}
			else {
			numberNumbers=17-2*lineLoop;
			}
			for(int zeilenLoop=0;zeilenLoop<numberNumbers;zeilenLoop++) {
				System.out.print(lineLoop+1);
			}
			System.out.println();
		}
		
	}	//main
	public static void printLinie1()	{
=======

		// Teilproblem 2
		teilproblem2();

	} // main

	public static void printLinie1() {
>>>>>>> 250c2b8e187b7cefb17d6667fd5dd14411c3b517
		System.out.println("**..**..**..");
	} // Linie eins

	public static void printLinie2() {
		System.out.println("..**..**..**");
	}

	public static void teilproblem2() {
		for (int i = 1; i <= 9; i++) {
			if(i<=5) {
				for(int k=1;k <= 5-i;k++) {
					System.out.print(".");
				}
				for(int k=0;k<2 * i - 1;k++) {
					System.out.print(i);
				}
				for(int k=1;k <= 5-i;k++) {
					System.out.print(".");
				}
			}else {
				for(int k=1;k <= i-5;k++) {
					System.out.print(".");
				}
				for(int k=0;k<19 - 2 * i;k++) {
					System.out.print(i);
				}
				for(int k=1;k <= i-5;k++) {
					System.out.print(".");
				}
			}
			
			System.out.println();
		}
	}
}
