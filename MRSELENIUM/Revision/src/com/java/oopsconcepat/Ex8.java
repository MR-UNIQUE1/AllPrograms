package com.java.oopsconcepat;

public class Ex8 {
	public void properties () {
		System.out.println("Gold car money etc................");
	}
	public void mrg () {
		System.out.println("Black girl");
	}
}
class child extends Ex8 {
	public void mrg () {
		System.out.println("Red girl ");
	}
	public static void main(String[] args) {
		child d = new child();
		d.properties();
		d.mrg();
	}
}
