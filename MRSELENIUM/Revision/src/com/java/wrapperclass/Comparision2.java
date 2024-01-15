package com.java.wrapperclass;

public class Comparision2 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1==i2);		
		
		Integer x1 = new Integer(1000);
		Integer x2 = new Integer(1000);
		System.out.println(x1==x2);		
		
		System.out.println("**********");
		
		Integer i = Integer.valueOf(100);
		Integer j = Integer.valueOf(100);
		System.out.println(i==j);

		Integer a = Integer.valueOf(1000);
		Integer b = Integer.valueOf(1000);
		System.out.println(a == b);
	}

}
