package com.java.oopsconcepat;

public class Ex12 {
	public static void main(String[] args) 
	{	try
		{	System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{	System.out.println("ratan".charAt(15));
		}
		finally
		{	System.out.println("Finally block Logics...");
		}
	}
}
