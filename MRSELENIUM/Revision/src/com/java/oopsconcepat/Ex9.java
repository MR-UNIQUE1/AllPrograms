package com.java.oopsconcepat;

public class Ex9 {
	public static void main(String[] args) 
	{	try{	
		System.out.println("durga");
		System.out.println("ratan");			
		System.out.println(10/0);	
		}
		catch(ArithmeticException e)
		{  System.out.println(10/2);
		}
		System.out.println("rest of the app");
	}
}
