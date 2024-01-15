package com.java.cj.oopsabstraction;

abstract class Test87 {
	abstract void great();
	
}
class GreetingImpl extends Test87{
	public void great() {
		System.out.println("sunil is a  good good boy");
	}
}
class OppsABEx2 {
	public static void main(String[] args) {
		Test87 o = new GreetingImpl();
		o.great();
		
	}
}