package generalProgram;

import java.util.Scanner;

public class Factorial1 {
	public static int validate (int a ) {
		if (a>0) {
			return a*validate(--a);
		} else {
			return 1;
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial ");
		int num = s.nextInt();
		int result = Factorial1.validate(num);
		System.out.println("The factorial of this number is \n"+result);

	}

}
