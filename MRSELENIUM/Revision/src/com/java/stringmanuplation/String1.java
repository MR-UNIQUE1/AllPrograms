package com.java.stringmanuplation;

public class String1 {
	public static void main(String[] args) {
		String s = "madam";
		StringBuffer b = new StringBuffer(s);
		 StringBuffer d =b.reverse();
		 System.out.println(d);
		if (d.equals(b)) {
			System.out.println("This is the palandromic word ");
		}else {
			System.out.println("This is not palandromic word");
		}
	}
}
