package com.java.cj.oopspolymorphism;

class Test 
{	public static void main(String[] args)
	{	Test t1 = new Test();
		Test t2 = t1; 
		Test t3 = t2; 
		System.out.println(t1.hashCode()+" "+t2.hashCode()+" "+t3.hashCode());
	}
}
