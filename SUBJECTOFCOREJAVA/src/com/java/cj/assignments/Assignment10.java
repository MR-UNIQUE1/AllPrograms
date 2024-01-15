package com.java.cj.assignments;

import java.util.Scanner;

public class Assignment10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num= scanner.nextInt();
		if (num>0) {
			System.out.println("number are positive");
		} else if (num<0) {
			System.out.println("number are negetive");
		} else{
			System.out.println("number is zero "+"('0')");
		}
		
	}
}
