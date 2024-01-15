package corejava.ajassignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int j;
		@SuppressWarnings("resource")
		Scanner s = new  Scanner(System.in);
		System.out.println("Enter the Starting number ");
		int num1 = s.nextInt();
		System.out.println("Enter the ending number ");
		int num2 = s.nextInt();
		for (int i = num1; i <=num2; i++) {
			for ( j = 2; j <=i
					; j++) {
				if (i%j==0) {
					break;
				}
			}
			if (i==j) {
				System.out.println(j);
			}	
		}
	}
}
