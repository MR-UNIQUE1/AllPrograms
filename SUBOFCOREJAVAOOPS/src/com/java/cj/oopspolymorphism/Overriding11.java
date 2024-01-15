package com.java.cj.oopspolymorphism;

public class Overriding11 {
	static void add() {
		System.out.println("parent class add method");
	}
}
class childd extends Overriding11{
	static void add() {
		System.out.println("child class add method");
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	childd y = new childd();
		y.add();
	}
}
