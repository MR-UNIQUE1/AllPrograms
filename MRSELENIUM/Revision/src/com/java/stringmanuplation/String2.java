package com.java.stringmanuplation;

public class String2 {
	public static void main(String[] args) {
		String str1 = "ratan";
		String str2 = "durga";
		String str3 = "ratan";
		System.out.println(str1==str2);  
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		
		System.out.println("*****");

		String s1 = new String("ratan");
		String s2 = new String("durga");
		String s3 = new String("ratan");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
	}
}
