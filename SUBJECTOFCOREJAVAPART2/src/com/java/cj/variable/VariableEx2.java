package com.java.cj.variable;

public class VariableEx2 {
	int a=40;
	int b=60;
	

	public static void main(String[] args) {
		VariableEx2 j= new VariableEx2();
		System.out.println("Static area......."+(j.a+j.b));
		new VariableEx2().add();
	}
	void add() {
		System.out.println("instance area......."+(a+b));
	}

}
