package com.java.cj.oopspolymorphism;

public class TypeCasting3 {
	public void add(int a ) {
		System.out.println("int argument method");
	}
	public void add (float b) {
		System.out.println("float argument method ");
	}

	public static void main(String[] args) {
		TypeCasting3 e = new TypeCasting3();
		e.add(74.4f);
		e.add(477);
		e.add('a');

	}

}
