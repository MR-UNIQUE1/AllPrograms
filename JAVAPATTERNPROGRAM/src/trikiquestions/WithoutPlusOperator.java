package trikiquestions;

import java.util.Scanner;

public class WithoutPlusOperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First number ");
		int num1 = s.nextInt();
		System.out.println("Enter second number ");
		int num2 = s.nextInt();
		System.out.println(num1-(-num2));
	}

}
