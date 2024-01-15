package com.java.cj.constructor;

public class ConstructorEx4 {
	public ConstructorEx4() {
		this(34);
		System.out.println("happy new year whole world");
		
	}
	ConstructorEx4 (int a ){
		this("sunil","mama",8);
		System.out.println("happy new year sunil");
	}
	ConstructorEx4 (String name,String sname,int a) {
		this(8,77.0);
		System.out.println("happy new year mama");
	}
	ConstructorEx4(int a ,double b){
		System.out.println("happy new year all my family members");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorEx4 r =new ConstructorEx4();
	}
}
