package com.java.cj.oppsinheritance;

public class OppsInEx3 {
	public static void main(String[] args) {
		OppsInEx3 ju = new OppsInEx3();
		System.out.println(ju.getClass().getName()+"@"+Integer.toHexString(ju.hashCode()));
		//Output->package.OppsInEx3@5a07e868
		System.out.println(ju);
		System.out.println(ju.toString());
	}

}
