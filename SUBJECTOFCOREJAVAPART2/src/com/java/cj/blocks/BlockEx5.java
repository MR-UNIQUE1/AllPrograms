package com.java.cj.blocks;

class Demo
{	static
	{	System.out.println("Demo class static block");
	}
	void wish()
	{	System.out.println("Good morning");
	}
}
class Test2
{	@SuppressWarnings({ "rawtypes", "deprecation" })
public static void main(String[] args)throws Exception
	{	Class c = Class.forName("Demo");
		Demo d = (Demo)c.newInstance();
		d.wish();
	}
}
