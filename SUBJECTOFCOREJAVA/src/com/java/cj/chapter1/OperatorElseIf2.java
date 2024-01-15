package com.java.cj.chapter1;

import java.util.InputMismatchException;
import java.util.Scanner;
@SuppressWarnings("resource")
public class OperatorElseIf2 {
	public static void main(String[] args) {
		try {
			Scanner g = new Scanner(System.in);
			System.out.println("enter your age ");
			int age =g. nextInt()	;
			if (age==18) {
				System.out.println("now you are adult");
			} else if(age==18 ) {
				System.out.println("focous on your study");
			}else {
				System.out.println("be enter correct value");
			}
		} catch (InputMismatchException e) {
			System.out.println("plz enter write instruction");
		}
		int a = 10;
		if (a==10)
		{	System.out.println("Tharun don't sleep");
		}
		else if (a==10)
		{	System.out.println("venkat don't sleep");
		}
		else
		{	System.out.println("ramu don't sleep");
		}
		
	}
}
