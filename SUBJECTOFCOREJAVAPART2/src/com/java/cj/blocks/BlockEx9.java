package com.java.cj.blocks;

class Test3
{   public static final void change(int x)		//static method
	{  x = 10;
	}
	public static void main(String[] args)
	{   int x = 9898;
		Test3.change(x);
		System.out.println(x);
	}
}