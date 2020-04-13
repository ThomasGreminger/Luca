
public class Extra {

	public static void main(String[] args) {
		printLinie1();	// TODO Auto-generated method stub
		printLinie2();
		printLinie1();
		printLinie2();
		printLinie1();
		printLinie2();
		printLinie1();
		printLinie2();
		
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
		System.out.println("**..**..**..");
	}	//Linie eins
	
	public static void printLinie2()	{
		System.out.println("..**..**..**");
	}
}
