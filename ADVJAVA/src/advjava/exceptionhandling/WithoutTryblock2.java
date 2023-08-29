package advjava.exceptionhandling;

import java.util.Scanner;

public class WithoutTryblock2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while (true) {
			Scanner s = new Scanner( System.in);
			System.out.println("Enter a number ");
			int num = s.nextInt();
			try {
				System.out.println(10/num);
			} catch (ArithmeticException e) {
				System.out.println("Enter another number except '0 ");
			}
			
			System.out.println("rest of the application ");

		}
		}

}
