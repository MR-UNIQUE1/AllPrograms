package com.java.cj.oppsinheritance;

public class OppsInEx6 {
	void add() {
		System.out.println("parent ");
	}
}
class OppsInEx61 extends OppsInEx6{
	void disp() {
		System.out.println("parent -1");
	}
}
class OppInEx62 extends OppsInEx6{
	void wish(){
		System.out.println("parent 2");
	}
	public static void main(String[] args) {
		OppInEx62 u =new  OppInEx62();
		u.wish();
		u.add();
		OppsInEx61 i = new  OppsInEx61();
		i.add();
		i.disp();
		System.out.println(i.hashCode());
		
	}
}
