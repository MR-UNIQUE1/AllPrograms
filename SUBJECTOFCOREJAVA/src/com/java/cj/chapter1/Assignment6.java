package com.java.cj.chapter1;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		
		while (true) {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter a number and check weather it positive or negetive or zero");
			System.out.println("Enter 1st number ");
			int num1=s.nextInt();
			System.out.println("Enter 2nd number ");
			int num2=s.nextInt();
			if (num1>num2) {
				System.out.println("bigger number is ..."+num1);
			} else {
				System.out.println("bigger number is ..."+num2);
			}
		}
		
	}

}
