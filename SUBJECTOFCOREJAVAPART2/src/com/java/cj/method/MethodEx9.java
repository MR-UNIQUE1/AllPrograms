package com.java.cj.method;

import java.util.Scanner;

public class MethodEx9 {
	static void pinValidate(String pin)
	{	if (pin.length()==6)
		{	System.out.println("Your pin is valid congratulations....");
		}
		else
		{	@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
			System.out.println("Your pin Wrong ...Enter your pin Again...");
			String newpin = s.next();
			pinValidate(newpin);
		}
	}
	public static void main(String[] args) 
	{	MethodEx9.pinValidate("53302");
	}
}
