package com.java.cj.chapter1;

import java.util.Scanner;

public class FlowIfElse4{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("enter two number and see theie sum");
		int number = s.nextInt();
		int number1 =s.nextInt();
		System.out.println("sum of two number is "+(number+number1));
		
	}
}
