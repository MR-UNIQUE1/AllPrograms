package com.java.part2;

public class Example1 {
	int a = 10,b=20;
	public void wish (int a,int b) {
		System.out.println(this.a+this.b);
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		Example1 s = new Example1();
		s.wish(33, 90);
	}

}
