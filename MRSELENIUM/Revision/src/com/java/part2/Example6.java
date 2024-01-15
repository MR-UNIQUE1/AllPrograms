package com.java.part2;

import java.util.Scanner;

public class Example6 {

	public static int factorial (int a) {
		if (a!=0) {
			return a* factorial(a-1);
		} else {
			System.out.println("This number is :- 0");
			return 1;
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number and see the factorial of this number ");
		
		int num = s.nextInt();
		int factorialls = Example6.factorial(num);
		System.out.println("The factorial of this number "+ num + "is :-"+factorialls);
	}

}
