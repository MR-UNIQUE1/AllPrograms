package com.java.oopsconcepat;

abstract class Ex4 {
	public Ex4() {
		System.out.println("this is the abstract class");
	}
}
class Test extends Ex4 {
	
	public Test() {
		super();
		System.out.println("This is the test class constructor");
	}
}
class Testclient {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Test s = new Test();
	}
}
