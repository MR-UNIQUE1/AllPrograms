package generalProgram;

import java.util.Scanner;

public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int fact = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial ");
		int num = s.nextInt();
		for (int i = 1; i <=num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of this number is \n"+fact);

	}

}
