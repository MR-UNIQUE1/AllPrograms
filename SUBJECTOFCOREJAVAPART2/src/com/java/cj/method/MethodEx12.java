package com.java.cj.method;

public class MethodEx12 {
	static int disp() {
		return 10;
	}
	public static void main(String[] args) {
		int num=MethodEx12.disp();
		System.out.println(num);
		System.out.println("***********");
		System.out.println(MethodEx12.disp());
	}
}
