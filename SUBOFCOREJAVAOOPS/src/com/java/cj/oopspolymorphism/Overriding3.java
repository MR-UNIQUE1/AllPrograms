package com.java.cj.oopspolymorphism;

public class Overriding3 {
	int mrg () {
		System.out.println("black girl ");
		return 29;
	}
}
class Overridingd extends Overriding3 {
	int  mrg() {
		System.out.println("white girl with me");
		return 334;
	}
	public static void main(String[] args) {
		Overridingd h = new Overridingd() ;
		 h.mrg();
	}
}
