package com.java.cj.assignments;

import java.util.Scanner;

public class Assignment9 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while (true) {
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter user name ");
			String uname=scanner.next();
			System.out.println("Enter your pasword");
			String pasward=scanner.next();
			if (uname.equals("sunil") || pasward.equalsIgnoreCase("sparida617@gmail.com")) {
				System.out.println("login sucess");
			} else {
				System.out.println("login failure");
			}
		}
	}
}
