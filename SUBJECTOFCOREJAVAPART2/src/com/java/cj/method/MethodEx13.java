package com.java.cj.method;

public class MethodEx13 {
	int num=10;
	int disp(int num) {
		return num;
	}
	public static void main(String[] args) {
		MethodEx13 j = new MethodEx13();
		int g = j.disp(88);
		System.out.println(g);
		
	}
}
