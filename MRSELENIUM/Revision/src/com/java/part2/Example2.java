package com.java.part2;

public class Example2 {

	public void validate (int num) {
		if (num>0) {
			System.out.println("The numbers is "+ num);
			validate(--num);
		} else {
			System.out.println("This number is 0 ");
		}
	}
	public static void main(String[] args) {
		Example2 s = new Example2();
		s.validate(30);
	}

}
