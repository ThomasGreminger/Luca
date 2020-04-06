import java.util.Scanner;

public class ggT {

	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in);
		int userNumberX;
		System.out.println("Enter your first Number");
		userNumberX = myObj1.nextInt();

		Scanner myObj2 = new Scanner(System.in);
		int userNumberY;
		System.out.println("Enter your second Number");
		userNumberY = myObj2.nextInt();
		int result = myMethod(userNumberX, userNumberY);
		System.out.println("ggT(" + userNumberX + ", " + userNumberY + ") = " + result);
	}

	public static int myMethod(int userNumberX, int userNumberY) {
		if (userNumberY > userNumberX) {
			int p = userNumberX;
			userNumberX = userNumberY;
			userNumberY = p;
		}

		if (userNumberX % userNumberY == 0) {
			return (userNumberY);
		}
		userNumberX = userNumberX % userNumberY;
		int result = myMethod(userNumberX, userNumberY);
		return result;
	}
}
