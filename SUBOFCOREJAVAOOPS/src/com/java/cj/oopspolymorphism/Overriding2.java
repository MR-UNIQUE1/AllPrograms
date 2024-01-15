package com.java.cj.oopspolymorphism;

class Parent {
	void add(){
		System.out.println("sunil is a good boy");
	}
}
class Child extends Parent{
	void add(){
		System.out.println("maam");
			}
public static void main(String []args){
Child c = new Child ();
c.add();
	}
}