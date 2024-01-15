package com.java.cj.method;

import java.util.Scanner;

public class MethodEx4 {
	static void add (int a ,int b) {
		int res;
		res=a+b;
		System.out.println(res);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		MethodEx4.add(10, 20);
		System.out.println("***************");
		int x=30,y=40;
		MethodEx4.add(x, y);
		System.out.println("***************");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your 1st number ");
		int num1=s.nextInt();
		System.out.println("Enter your 2nd number ");
		int num2=s.nextInt();
		MethodEx4.add(num1, num2);
	}
}
