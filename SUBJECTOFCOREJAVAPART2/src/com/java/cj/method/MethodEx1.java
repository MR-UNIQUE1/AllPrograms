package com.java.cj.method;

public class MethodEx1 {
	static int addition(int a , int b ) {
		int h= a+b;
		return h;
	}
	public static void main(String[] args) {
		int a=MethodEx1.addition(24,78);
		System.out.println(a);
	}
}
