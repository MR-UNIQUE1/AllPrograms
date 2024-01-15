package com.java.cj.chapter1;

import java.util.Scanner;
@SuppressWarnings({ "unused", "resource" })
public class FlowIfElse2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = s.nextLine();
		System.out.println("enter your age");
		int age= s.nextInt();
		System.out.println("enter your company name ");
		String company=s.next();
		System.out.println("enter your salary");
		double sal= s.nextDouble();
		
		if (sal>100020) {
			System.out.println("your name...."+name+". "+"your age...."+age+ ". "+"your company...."+company+". "+"your salary...."+sal);
			System.out.println("Congrat your merrage will be fix ");
		} else {
			System.out.println("your name...."+name+"your age...."+age+"your company"+company+"your salary"+sal);
			System.out.println("sorry , you are not good for my doughter");
		}
		s.close();
	}
}
