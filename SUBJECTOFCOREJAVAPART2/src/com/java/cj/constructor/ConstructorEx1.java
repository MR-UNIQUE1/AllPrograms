package com.java.cj.constructor;

public class ConstructorEx1 {
	public ConstructorEx1() {
		System.out.println("sunil is a good boy");
	}
	ConstructorEx1(int a ){
		System.out.println("sunil is briliant ");
	}
	ConstructorEx1(int a, int b){
		System.out.println("miss is a good girl");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorEx1 y = new ConstructorEx1();
		ConstructorEx1 u = new ConstructorEx1(10);
		ConstructorEx1 m = new ConstructorEx1(10,39);
	}
}
