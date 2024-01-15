package com.java.stringmanuplation;

public class String7 {
	public static void main(String[] args) {
		String s1 = "ratandurga";
		System.out.println(s1.indexOf('t'));
		System.out.println(s1.indexOf('x')); 

		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf('z'));
		
		System.out.println("********");
		
		String s2 = "hi ratan sir how are you";
		System.out.println(s2.startsWith("hi")); 
		System.out.println(s2.startsWith("r"));

		System.out.println(s2.endsWith("you")); 
		System.out.println(s2.endsWith("how")); 
		
		System.out.println("********");

		String s3 = "hi RATAN Sir MANGO is good";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
	}
}
