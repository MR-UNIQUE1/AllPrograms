package com.java.cj.assignments;

import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number ");
		int num= s.nextInt();
		if (num%2==0) {
			System.out.println("the number is even");
		} else {
			System.out.println("the number is off");
		}
	}
}
