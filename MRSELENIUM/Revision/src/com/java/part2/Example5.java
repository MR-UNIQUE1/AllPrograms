package com.java.part2;

import java.util.Scanner;

public class Example5 {
	
	@SuppressWarnings("resource")
	public void pinValidate (String pin) {
		if (pin.length()==6) {
			System.out.println("pin is correct congratulation");
		} else {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the pin ");
			String newpin = s.nextLine();
			pinValidate(newpin);
		}
	}

	public static void main(String[] args) {
		
		Example5 y = new Example5();
		y.pinValidate("fduee");
	}

}
