package com.java.cj.oopspolymorphism;

interface Birds {
	void fly();
	void swim();
}
class Parrot implements Birds{
	public void fly() {
		System.out.println("par rot can fly ");
	}
	public void swim() {
		System.out.println("parrot cannot swim");
	}
}
class Penguine implements Birds {
	public void fly() {
		System.out.println("penguine can't fly");
	}
	public void swim () {
		System.out.println("penguine can swim");
	}
}
class TestcliEnt {
	public static void main(String[] args) {
		Parrot  h = new Parrot();
		h.fly();
		h.swim();
		Penguine g =new Penguine() ;
		g.fly();
		g.swim();
		
	}
}
