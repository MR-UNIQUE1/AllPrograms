package com.java.cj.chapter1;

import java.util.Scanner;

public class FlowSwitch {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number beetwin 1 and 7");
		int day = s.nextInt();
		switch (day) {
		case 1:System.out.println("monday");	
			break;
		case 2:System.out.println("tuesday");
			break;
		case 3:System.out.println("wednesday");	
			break;
		case 4:System.out.println("thursday");
			break;
		case 5:System.out.println("friday");	
			break;
		case 6:System.out.println("saturday");	
			break;
		case 7:System.out.println("sunday");
			break;
			
		default:System.out.println("plz enter above giving instruction");
			break;
		}
		
		int a=10;
		switch (a)
		{		case 10:System.out.println("sunil is a good boy");
		}
		int b=100;
		switch (b)
		{default:	System.out.println("Good Morning...");	
		}
	}
}
