package com.java.cj.oopspolymorphism;

interface Class {
	void add();
}
class testi implements Class{
	public void add() {
		System.out.println("sunil good morning ");
	}
	public void disp() {
		System.out.println("mama is good girl");
	}
}
class Testcient {
	void info (Class y) {
		y.add();
	}
	public static void main(String[] args) {
		Testcient i = new Testcient();
		i.info(new testi());
		testi h=new testi();
		h.disp();
	}
}
