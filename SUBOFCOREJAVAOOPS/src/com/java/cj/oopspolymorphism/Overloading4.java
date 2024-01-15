package com.java.cj.oopspolymorphism;
class Overloading4 {
	public void add(int a) {
		System.out.println("this is the parent class add method ");
	}
}
class Sunil extends Overloading4{
	public void add(int a , int b) {
		System.out.println("this is the child class add method ");
	}
	public static void main(String[] args) {
		Sunil y = new Sunil();
		y.add(8, 9);
		y.add (7);
	}
}
