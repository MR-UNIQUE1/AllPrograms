package com.java.cj.method;

public class MethodEx15 {
	int num=10;
	int disp(int num) {
		return this.num;	
	}
	public static void main(String[] args) {
		MethodEx15 r = new MethodEx15();
		int y=r.disp(89);
		System.out.println(y);
		
		
	}
}
	

