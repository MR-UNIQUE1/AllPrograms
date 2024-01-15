package com.java.stringmanuplation;

public class String4 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		//identity(object) comparison
		System.out.println(str1==str2);     
		System.out.println(str1==str3);	 
		System.out.println(str2==str3);	  
		
		System.out.println("**************");
		
		// Data comparison
		System.out.println(str1.equals(str2)); 
		System.out.println(str1.equals(str3));  
		System.out.println(str2.equals(str3)); 
	}
}
