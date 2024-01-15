package com.java.cj.oopspolymorphism;

class Dog {
	
}
class Puppy extends Dog{
	
}
class Parente {
	Dog mrg() {
		System.out.println("black girl");
		return new Dog();
		
	}
}
class Childe extends Parente{
	Puppy mrg() {
		System.out.println("white mo girl ");
		return new Puppy();
	}
	public static void main(String[] args) {
		Childe d = new Childe();
		Puppy u = d.mrg();
		System.out.println(u);
	}
}