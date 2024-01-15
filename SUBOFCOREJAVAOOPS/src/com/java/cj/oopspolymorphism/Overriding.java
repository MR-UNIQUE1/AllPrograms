package com.java.cj.oopspolymorphism;

public class Overriding {
	void properties() {
		System.out.println("gold + land +money +car ...");
	}
	void mrg() {
		System.out.println("black girl");
	}
}
class Test11 extends Overriding{
	public void mrg() {
		System.out.println("white girl");
	}
	public static void main(String[] args) {
		Test11 r = new Test11();
		r.properties();
		r.mrg();
	}
}
