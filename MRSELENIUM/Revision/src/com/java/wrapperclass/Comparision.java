package com.java.wrapperclass;

public class Comparision {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Integer i1 = new Integer(10);
		@SuppressWarnings("removal")
		Integer i2 = new Integer(10);
		System.out.println(i1.equals(i2));
		
		Integer x1 = Integer.valueOf(200);
		Integer x2 = Integer.valueOf(200);
		System.out.println(x1.equals(x2));

		Integer x = 300;
		Integer y = 300;
		System.out.println(x.equals(y));

	}

}
