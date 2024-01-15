package com.java.cj.method;

import java.util.Scanner;

public class MethodEx8 {
	static void add(int num) {
		if (num>=0) {
			System.out.println("the numer is positive and your number is......."+num);
			add(--num);
		} else {
			System.out.println("your number is -ve");
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your number ");
		int num1=s.nextInt();
		MethodEx8.add(num1);
	}
}
