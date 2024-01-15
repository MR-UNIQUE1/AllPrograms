package com.java.cj.oopspolymorphism;
@SuppressWarnings("unused")
class Test90{
	public Test90(int a) {
		System.out.println("int argument constructor");
	}
	public Test90 (int a ,int b){
		System.out.println("2-argument constructor");
	}
	public Test90() {
		System.out.println("o-argument constructor");
	}

	public static void main(String[] args) {
		Test90 r = new Test90();
		Test90 e = new Test90(8);
		Test90 w = new Test90(64, 493);
	}
}

