package com.java.part2;

import java.util.Scanner;

public class Example3 {

	@SuppressWarnings("resource")
	public void check (String pin) {
		if (pin.length()==6) {
			System.out.println("congratulation pin entered sucessuful ");
		}
		else {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the pin");
			String c = s.nextLine();
			check(c);
			
		}
	}
	public static void main(String[] args) {
		Example3 s1 = new Example3();
		s1.check("39383");
	}

}
