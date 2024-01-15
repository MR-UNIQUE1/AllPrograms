package com.java.cj.blocks;

public class BlockEx10 {
	void disp() {
		System.out.println("sunil is a good boy , ratan sir is great");
	}
}

class Sunil{
	BlockEx10 u = null;
	void m1() {
		u=new BlockEx10();
		u.disp();
	}
	void m2() {
		u.disp();
	}
	void m3() {
		u.disp();
	}
	public static void main(String[] args) {
		Sunil l = new Sunil();
		l.m1();
		l.m2();
		l.m3();
	}
}