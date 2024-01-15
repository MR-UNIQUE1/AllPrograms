package com.java.cj.method;

public class MethodEx11 {
	static int disp() {
		System.out.println("good morning ");
		return 10;
	}
	public static void main(String[] args) {
		int a =MethodEx11.disp();
		System.out.println(a);
		System.out.println(MethodEx11.disp());
	}
}
