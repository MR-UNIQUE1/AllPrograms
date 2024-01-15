package com.java.part2;

public class Example4 {
	
	public void validate (int num) {
		if (num>0) {
			System.out.println("The numbers are "+num);
			validate(--num);
		} else {
			System.out.println("the numbers are 0");
		}
	}

	public static void main(String[] args) {
		Example4 s = new Example4();
		s.validate(38);

	}

}
