package com.java.wrapperclass;

public class ChildHoldObject2 {
	public void disp (Double a ) {
		System.out.println(a.getClass().getName());
	}
	public static void main(String[] args) {
	
		ChildHoldObject2 s = new ChildHoldObject2();
		s.disp(4.4);
}
}
