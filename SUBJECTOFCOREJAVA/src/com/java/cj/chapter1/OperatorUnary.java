package com.java.cj.chapter1;

public class OperatorUnary {

	public static void main(String[] args) {
		int r=4;
		System.out.println(r++);	//4
		System.out.println(--r);	//4
		System.out.println(++r);	//5	
		System.out.println(r--);	//5
		int a=10;
		System.out.println(a++ + ++a );  	//22
		System.out.println(++a - a++);   	//0
		System.out.println(a-- + --a );  	//26
		System.out.println(--a - a--);   	//0
		System.out.println("****************");
		int ba=10;
		System.out.println(ba++ + ++ba + --ba + ba--); 
		System.out.println(++ba - ba++ - ba-- - --ba);	
		
		
	}

}
