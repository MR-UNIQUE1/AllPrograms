package com.java.cj.oopspolymorphism;

public class Overloading7{
	public void add(int a , int b) {
		System.out.println(a+"  "+b);
	}
	public void add(int a ,String b) {
		System.out.println(a+  " "+b);
	}
	public void add(int a ,int b , int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Overloading7 i = new Overloading7();
		i.add(8, 9);
		i.add(939, "Swagatika");
		i.add(88, 434, 78);
	}
}
