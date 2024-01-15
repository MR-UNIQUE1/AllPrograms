package com.java.oopsconcepat;

public class Ex1 {
	public static void main(String[] args) {
		Ex1 s = new Ex1() ;
		Ex1 r = new Ex1() ;
		System.out.println(r.hashCode());
		System.out.println(s.hashCode());
		System.out.println(Integer.toHexString(r.hashCode()));
	}
}
