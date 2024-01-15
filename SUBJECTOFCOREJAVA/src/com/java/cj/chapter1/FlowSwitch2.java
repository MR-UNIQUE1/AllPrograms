package com.java.cj.chapter1;

public class FlowSwitch2 {

	public static void main(String[] args) {
		int a=10;
		switch (a) {
		case 10:System.out.println("sunil");
			break;
		default:System.out.println("mama");
			break;
		}
		
		final int b=20;
		switch (b+10) {
		case 10*4-20:System.out.println("mama bhak");
			break;
		case b+10: System.out.println("sunil is a good boy");
			break;
		default:System.out.println("sunil dkfjdsjfdkl");
			break;
		}
	}
}
