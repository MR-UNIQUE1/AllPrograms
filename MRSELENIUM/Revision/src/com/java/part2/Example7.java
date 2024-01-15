package com.java.part2;

import java.util.Scanner;

public class Example7 {

	/*@SuppressWarnings({  "resource" })
	public void pinvalidate (String pin) {
		if (pin.length()==6) {
			System.out.println("This pin is correct ");
		} else {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the pin \nthis pin is not correct ");
			String newpin = s.nextLine();
			pinvalidate(newpin);
		}
	}
	public static void main(String[] args) {
		Example7 s1 = new Example7();
		s1.pinvalidate("30393");
		
	}
	
	public void num (int num) {
		if (num!=0) {
			System.out.println("The numbers are "+ num);
			num(--num);
		}
		else {
			System.out.println("The number is 0");
		}
	}
	public static void main(String[] args) {
		Example7 s = new Example7();
		s.num(77);
	}*/
	
	public static int factorial (int n) {
		if (n!=0) {
			return n*factorial(n-1);
		} else {
			return 1;
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Put a number to perform the factoril");
		int fat= s.nextInt();
		int res = Example7.factorial(fat);
		System.out.println("The result is "+res);
	}
}
