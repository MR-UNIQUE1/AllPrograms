package com.java.cj.oppsinheritance;

//multilevel inheritance

public class OppsInEx5 {
	void add() {
		System.out.println("parent class method");
	}
}
class OppInEx51 extends OppsInEx5{
	void mul() {
		System.out.println("child 1(like parent)");
	}
}
class OppInEx511 extends OppInEx51{
	void div() {
		System.out.println("grand child ");
	}
	public static void main(String[] args) {
		OppInEx511 o =new OppInEx511();
		o.add();
		o.mul();
		o.div();
		
	}
}
