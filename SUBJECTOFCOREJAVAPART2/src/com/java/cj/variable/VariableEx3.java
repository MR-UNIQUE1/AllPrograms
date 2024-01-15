package com.java.cj.variable;

public class VariableEx3 {
	static int num1=20;
	static int num2=30;
	

	public static void main(String[] args) {
		System.out.println(VariableEx3.num1+VariableEx3.num2);
		VariableEx3.mul();
		VariableEx3 j= new VariableEx3();
		j.div();

	}
	static void mul() {
		System.out.println(VariableEx3.num1*VariableEx3.num2);
	}
	void div () {
		System.out.println(VariableEx3.num2/VariableEx3.num1);
	}

}
