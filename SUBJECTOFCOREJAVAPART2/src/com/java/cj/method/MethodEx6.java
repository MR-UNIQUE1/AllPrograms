package com.java.cj.method;

public class MethodEx6 {
	void add(int a,int b)
	{	System.out.println(a+b);
	}
	void mul(int i,int j)
	{	System.out.println(i*j);
	}
	public static void main(String[] args) 
	{	MethodEx6 t = new MethodEx6();
		t.add(10,20);
		t.mul(4,100);
	}
}
