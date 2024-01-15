package trikiquestions;

import java.util.Scanner;

public class OnlyBitwiseOperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number ");
		int num1 = s.nextInt();
		System.out.println("Enter second number ");
		int num2 = s.nextInt();
		System.out.println("The addition of two number is "+add (num1,num2));
		}
	static int add (int s1,int s2) {
		int sum = s1^s2;
		int div = s1&s2;
		while (div!=0) {
			div<<=1;
			sum = s1^s2;
			div = s1&s2;
		}
		return sum;
	}
}
