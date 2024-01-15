package com.java.cj.oopspolymorphism;

class Lion {
	
}
class Rat extends Lion{
	
}
class Parentt{
	Lion mrg() {
		System.out.println("black lion");
		return new Lion();
	}
}
class Childd2 extends Parentt{
	Rat mrg() {
		System.out.println("white lion");
		return new Rat();	
	}
	public static void main(String[] args) {
		Childd2 i = new Childd2();
		Rat u = i.mrg();
		System.out.println(u);
	}
}