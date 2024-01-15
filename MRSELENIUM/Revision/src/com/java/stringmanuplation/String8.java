package com.java.stringmanuplation;

public class String8 {
	public static void main(String[] args) {
		String s1 ="hi ratan sir";
		System.out.println(s1.replace('a','A'));	
		System.out.println(s1.replace("ratan","durga"));
		System.out.println(s1.replace("anu","ramu"));
		System.out.println(s1.replace(" ",""));
		
		System.out.println("********");

		String s2 = "hi ratan sir where is ANU";
		System.out.println(s2.contains("ratan"));
		System.out.println(s2.contains("anu"));
		
		System.out.println("********");
		
		System.out.println("ratan".isEmpty());	
		System.out.println("".isEmpty());
	}
}
