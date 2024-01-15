package com.java.part2;

public class Example10 {
	{
		System.out.println("This is the instance block");	}
	
	
	static {
		System.out.println("This is the Static block");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Example10 s = new  Example10();
		
	}

}
