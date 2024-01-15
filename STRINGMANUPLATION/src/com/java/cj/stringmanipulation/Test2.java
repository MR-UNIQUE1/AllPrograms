package com.java.cj.stringmanipulation;

public class Test2 {

	public static void main(String[] args) {
		
	String name = "broken";
	String reverse ="";
	for (int i = name.length()-1; i >= 0; i--) {
		reverse = reverse+name.charAt(i) ;
	}
	System.out.println("reverse of a name is  :-"+reverse);
		
	}

}
