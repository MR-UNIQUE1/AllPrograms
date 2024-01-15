package com.java.part2;

public class Example9 {
	
	int a = 20;
	int b = 30;
	
	public void disp () {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		Example9 s = new Example9();
		System.out.println(s.a+s.b);
		s.disp();
	}

}
