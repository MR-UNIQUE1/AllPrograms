package com.java.cj.oopspolymorphism;

interface Hh{
	void eat();
	void drink();
}
class Man implements Hh{
	public void eat() {
		System.out.println("Man can't eat ");
	}
	public void drink() {
		System.out.println("Man can drink");
	}
}
class Female implements Hh{
	public void eat() {
		System.out.println("female can eaat ");
	}
	public void drink() {
		System.out.println("female can't drink");
	}
}
class Tetclient{
	static void manInfo(Hh y ) {
		y.eat();
		y.drink();
	}
	public static void main(String[] args) {
		Tetclient.manInfo(new Female());
	}
}
