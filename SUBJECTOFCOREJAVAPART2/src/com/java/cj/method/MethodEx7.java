package com.java.cj.method;

public class MethodEx7 {
	static void m3(int a ) {
		System.out.println("sunil is a good boy ");
		MethodEx7.m2(true, 6);
	}
	static void m2(boolean b, int ab) {
		System.out.println("sunil is outstanding ");
	}
	static void m1 (int a , int b) {
		MethodEx7.m3(8);
		System.out.println("mama(sanvi) is very good girl");
	}
	public static void main(String[] args) {
		MethodEx7.m1(10, 77);
	}
}
