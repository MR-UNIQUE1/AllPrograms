package com.java.cj.constructor;

public class ConstructorEx3 {
	void wish() {
		System.out.println("sunil is a good boy");
	}
	public static void main(String[] args) {
		ConstructorEx3 n=new ConstructorEx3();
		n.wish();
		
		new ConstructorEx3().wish();
	}
}
