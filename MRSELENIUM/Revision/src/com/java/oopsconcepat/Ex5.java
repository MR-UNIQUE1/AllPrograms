package com.java.oopsconcepat;

public class Ex5 {
	public void m1(int a ) {
		System.out.println("This is the parent method"+a);
	}
}
class Testys extends Ex5{
	public void m1(int a, int b) {
		System.out.println("This is the child method "+(a+b));
	}
}
class Testc{
	public static void main(String[] args) {
		Ex5 s = new Testys();
		s.m1(3);
	}
}
