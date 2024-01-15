package com.java.cj.oppsinheritance;

public class OppsInEx1 {
	public void add() {
		System.out.println("sunil parida");
	}
	public void mul() {
		System.out.println("swagatika behera");
	}
}
class OppsInEx22 extends OppsInEx1{
	public void div() {
		System.out.println("sanvi sreyansi pradhan");
	}
	public static void main(String[] args) {
		OppsInEx1 k =new OppsInEx22();
		k.add();
		k.mul();
		OppsInEx22 u=(OppsInEx22)k;
		u.div();
	}
}
