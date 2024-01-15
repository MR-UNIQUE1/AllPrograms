package com.java.cj.oopsabstraction;

abstract class Test23 {
	public Test23() {
		System.out.println("sunil is a ogoood boy");
	}
}
class Test21 extends Test23 {
	Test21(){
		super();
		System.out.println("sunil is a inteligent boy");
	}
}
class OppsABEx5{
	public static void main(String[] args) {
		new Test21();
		
	}
}
