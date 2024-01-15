package com.java.cj.oopsabstraction;

abstract class Test {
	void add() {
		System.out.println("abstract class with normal method");
	}
	void disp() {
		System.out.println("abstract class with disp normal method ");
	}
}
class Teast extends Test{
	public void add() {
		System.out.println("normal class with normal method");
	}
	public void disp() {
		System.out.println("normal class with disp normal method");
	}
}
class TestClient {
	public static void main(String[] args) {
		Teast y = new Teast();
		y.add();
		y.disp();
	}
}

