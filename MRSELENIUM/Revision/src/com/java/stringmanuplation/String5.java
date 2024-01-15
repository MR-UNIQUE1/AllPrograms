package com.java.stringmanuplation;

public class String5 {
	public static void main(String[] args) {
		String str1 = "ratan";
		String str2 = "durga";
		String str3 = "ratan";
		System.out.println(str1.equals(str2));  				
		System.out.println(str1.equals(str3));				  
  		System.out.println(str2.equals(str3));			
		
		System.out.println("ratan".equals("RATAN"));					   
		System.out.println("ratan".equalsIgnoreCase("RATAN"));	   

		String s1 = "anu";
		String s2 = "durga";
		String s3 = "anu";
		System.out.println(s1.compareTo(s2)); 			
		System.out.println(s1.compareTo(s3));				
		System.out.println(s2.compareTo(s1));
		
		System.out.println("ratan".compareTo("ratna"));			 
		System.out.println("ratan".compareTo("RATAN"));			 
		System.out.println("ratan".compareToIgnoreCase("RATAN"));

		System.out.println("anu".compareTo("anuratan"));
		System.out.println("ratananu".compareTo("ratan"));
	}
}
