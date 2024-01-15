package com.java.cj.chapter1;

import java.util.Scanner;

public class Assignment2 {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name ");
		String name= s.nextLine();
		
		System.out.println("Enter your grade");
		String grade = s.next();
		
		System.out.println("enter your salary");
		double salary=s.nextDouble();
		
		System.out.println("Enter your status");
		String status = s.next();
		
		System.out.println("Enter your HRA");
		double HRA= s.nextDouble();
		
		System.out.println("Enter your transport");
		double transport= s.nextDouble();
		
		double TotalSalary = salary-(HRA+transport);
		if (true ) {
			System.out.println("Your name is "+name);
			System.out.println("Your grade is "+grade);
			System.out.println("Your salary is "+salary);
			System.out.println("Including GST , HRA ,trasport etc your total salary is "+TotalSalary);
		}
		
	}
}
