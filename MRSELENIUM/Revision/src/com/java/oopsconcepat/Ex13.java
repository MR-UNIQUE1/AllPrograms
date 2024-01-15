package com.java.oopsconcepat;

public class Ex13 {
	@SuppressWarnings("finally")
	static int m1()
	{	try
		{	return 10;
		}
		catch(Exception e)
		{	return 20;
		}
		finally
		{	return 30;
		}
	}
	public static void main(String[] args)
	{	int a = Ex13.m1();
		System.out.println("Return value....."+a);
	}
}
