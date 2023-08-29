package advjava.exceptionhandling;

import java.util.Scanner;

public class WithoutTryblock {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in);
		System.out.println("Enter a number ");
		int num = s.nextInt();
		System.out.println(10/num);
		System.out.println("rest of the application ");

	}

}
