import java.util.Scanner;

public class OhneSieben1 {

	
	
	public static void main(String[] args) {
		System.out.println("Geben Sie eine positive Zahln ein");
		Scanner console = new Scanner(System.in);
		int s = console.nextInt();
		System.out.println(s);
		int[] a = calculate(s);
		System.out.println(a[0]);
		System.out.println(a[1]);
	}

	public static int[] calculate(int s) {
		int[] result = new int[2];
		for(int i=1;i<s/2;i++) {
			int j=s-i;
			String iString=Integer.toString(i);
			String jString=Integer.toString(j);
			if(!(iString.contains("7")||jString.contains("7"))) {
				result[0]=i;
				result[1]=j;
				return result;
			} 
		}

		return result;
	}

}
