package com.java.cj.chapter1;

import java.util.Scanner;

public class Assignment3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number");
		int num1= s.nextInt();
		
		System.out.println("Enter second number ");
		int num2= s.nextInt();
		
		int addition;
		addition= num1+num2;
		System.out.println("addition of two number is ........"+addition);

	}

}
