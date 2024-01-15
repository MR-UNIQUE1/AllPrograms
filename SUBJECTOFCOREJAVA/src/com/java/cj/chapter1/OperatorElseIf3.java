package com.java.cj.chapter1;

import java.util.Scanner;
public class OperatorElseIf3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new  Scanner(System.in );
		System.out.println("enter some number ");
		int number = s.nextInt();
		if (number >0) {
			System.out.println("number are positive(+ve)");
		}else if (number <0 ) {
			System.out.println("numbers are negetive(-ve)");
		}else {
			System.out.println("numbers are zero");
		}
		
	}
}
