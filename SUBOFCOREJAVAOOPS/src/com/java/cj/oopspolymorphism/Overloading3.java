package com.java.cj.oopspolymorphism;

public class Overloading3 {
	void add(int id ,char grade) {
		System.out.println(id+grade);
	}
	void add(char grade,int id) {
		System.out.println(id+grade);
	}
	public static void main(String[] args) {
		Overloading3 u = new Overloading3();
		u.add('a', 80);
		u.add(80, 'b');
	}
}
