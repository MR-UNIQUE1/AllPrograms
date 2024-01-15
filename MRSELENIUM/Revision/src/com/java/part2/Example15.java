package com.java.part2;

public class Example15 {
	
	public  void hh(int x) {
		x = 10;
	}

	public static void main(String[] args) {
		int x= 5;
		Example15 s = new Example15();
		s.hh(x);
		System.out.println(x);
	}

}
