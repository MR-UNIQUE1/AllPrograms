package com.java.cj.method;

public class MethodEx5 {
	int a=10,b=20;
	
	void add(int a,int b) {
		System.out.println(a+b);
		
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args) {
		MethodEx5 i = new MethodEx5();
		i.add(5, 5);
	}
}
