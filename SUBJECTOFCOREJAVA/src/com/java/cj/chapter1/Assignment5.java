package com.java.cj.chapter1;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		double d1=0.25;
		double d2 = 0.08;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = s.nextLine();
		System.out.println("Enter your age ");
		int age = s.nextInt();
		System.out.println("Enter the product name , which product you take ");
		String product = s.next();
		System.out.println("Enter price of the product");
		double price = s.nextDouble();
		System.out.println("Enter the quantity of the product");
		double quantity= s.nextDouble();
		
		double totalBill=price*quantity;
		if (age>50) {
			System.out.println("you got"+ d1 +" discount of all product");
			System.out.println("Customer name= "+name);
			System.out.println("Customer age="+age);
			System.out.println("your total bill ="+totalBill);
			System.out.println("Discount amount is " +d1);
			System.out.println("Net amount pay="+(totalBill-(totalBill*d1)));
		} else {
			System.out.println("you got 25% "+d2+"discount of all product");
			System.out.println("Customer name= "+name);
			System.out.println("Customer age="+age);
			System.out.println("your total bill ="+totalBill);
			System.out.println("Discount amount is " +d2);
			System.out.println("Net amount pay="+(totalBill-(totalBill*d2)));
		}

	}

}
