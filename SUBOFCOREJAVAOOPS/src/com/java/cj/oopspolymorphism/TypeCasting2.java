package com.java.cj.oopspolymorphism;

public class TypeCasting2 {
	static void v1(int num1, long num2) {
		System.out.println("int long argument methods"+num1+num2);
	}
	static void v1 (float num) {
		System.out.println("float argument method "+num);
	}
	public static void main(String[] args) {
		TypeCasting2.v1(100, 200);
		TypeCasting2.v1(10, 10);
		TypeCasting2.v1('a', 'b');
		TypeCasting2.v1((byte)5, (short)6);
		
		TypeCasting2.v1(478.45849f);
		TypeCasting2.v1(10);
		TypeCasting2.v1('u');
		TypeCasting2.v1((byte)123);

	}

}
