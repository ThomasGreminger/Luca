import java.util.Scanner;

public class OhneSieben {

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
		int a = s / 2 + 1;
		int b=s-a;
		
		while (a > 0) {
			if (a % 10 == 7) {
				a = a + 1;
				b=s-a;
			}
			break;
		}
		
		while (b > 0) {
			if (b % 10 == 7) {
				b = b - 1;
				a = a ++;
			}
			break;
		}

		result[0] = a;
		result[1] = b;
		return result;
	}

}
