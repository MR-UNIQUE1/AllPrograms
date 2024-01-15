package com.java.cj.blocks;

public class BlockEx4 {
	static {
		System.out.println("demo class static blocck");
	}
	void wish() {
		System.out.println("good morning ");
	}
}
class Test111{
	public static void main(String[] args) {
		BlockEx4 u = new BlockEx4();
		u.wish();
	}
}
