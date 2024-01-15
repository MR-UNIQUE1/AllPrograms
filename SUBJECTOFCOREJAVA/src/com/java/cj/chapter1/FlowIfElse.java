package com.java.cj.chapter1;

import java.util.Scanner;

public class FlowIfElse {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=s.nextInt();
		if (age>=18) {
			System.out.println("your age ....."+age+" "+"you are eligible for merrage");
		} else {
			System.out.println("your age bellow than 18 so you are not eligible for merrage (try next year)");
		}
		if (false ) {
			System.out.println("sunil is a good student ");
		} else {
			System.out.println("mama will you marry me");
		}
		
		int c= 20;
		if (c==20) {
			System.out.println("sunil how ,you are so brilliant ");
		} else {
			System.out.println("mama ");
		}
		if (true) {
			System.out.println("sunil is a brilliant student ");
		} else {
			System.out.println("sunil is isssss");
		}
	}
}
