package com.java.cj.oppsinheritance;

//this is the single inheritance

public class OppsInEx4 {
	void add() {
		System.out.println("hii sunil this is the parent class add method");
	}
}
class OppsInEx41 extends OppsInEx4{
	void mul() {
		System.out.println("hii mama this is the child class mul method");
	}
	public static void main(String[] args) {
		OppsInEx41 i = new OppsInEx41();
		i.add();
		i.mul();
	}
}
