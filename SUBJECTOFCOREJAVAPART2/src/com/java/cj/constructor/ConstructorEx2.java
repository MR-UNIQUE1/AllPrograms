package com.java.cj.constructor;

public class ConstructorEx2 {
	public ConstructorEx2(int a ) {
		System.out.println("1-agrs cons");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorEx2 y = new ConstructorEx2(9);
	}
}
