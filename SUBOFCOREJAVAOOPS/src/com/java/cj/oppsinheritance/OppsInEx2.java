package com.java.cj.oppsinheritance;

public class OppsInEx2 {
	public static void main(String[] args) {
		OppsInEx2 u = new OppsInEx2();
		System.out.println(u.hashCode());
		System.out.println("**************");
		System.out.println(Integer.toHexString(u.hashCode()));
		System.out.println(Integer.toBinaryString(u.hashCode()));
		System.out.println(Integer.toOctalString(u.hashCode()));
		System.out.println(Integer.toString(u.hashCode()));
		System.out.println(u);
		System.out.println("***************8");
		System.out.println(u.getClass());
		System.out.println(u.getClass().getName());
	}
}
