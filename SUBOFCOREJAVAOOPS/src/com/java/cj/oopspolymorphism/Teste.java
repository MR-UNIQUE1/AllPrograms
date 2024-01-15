package com.java.cj.oopspolymorphism;

interface Teset{
	void swim();
	void fly();
}
class Doge implements Teset {
	public void swim() {
		System.out.println("Dog can swim");
	}
	public void fly() {
		System.out.println("Dog can't fly");
	}
}
class Duck implements Teset  {
	public void swim() {
		System.out.println("Duck can't swim");
	}
	public void fly() {
		System.out.println("Duck can fly");
	}
}
class TestClie6nT{
	void DogImpl(Doge f) {
		f.swim();
		f.fly();
	}
	void DuckImpl(Duck g ) {
		g.swim();
		g.fly();
	}
	public static void main(String[] args) {
		TestClie6nT o = new TestClie6nT();
		o.DogImpl(new Doge());
		o.DuckImpl(new Duck());
		
	}
	
}