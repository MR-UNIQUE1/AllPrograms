package com.java.assertion;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter u r name:");
		String name = s.next();
		assert name.equals("ratan"):"This name is not good";
		System.out.println("The name is working good....");

	}

}
