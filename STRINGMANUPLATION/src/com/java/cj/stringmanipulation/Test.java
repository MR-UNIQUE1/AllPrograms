package com.java.cj.stringmanipulation;

public class Test {

	public static void main(String[] args) {
		String n1 = "sunil";
		System.out.println(n1);
		
		String n2= new String("sunil parida");
		System.out.println(n2);
		
		char [] ch = {'s','u','n','i','l'};
		String s = new String(ch);
		System.out.println(s);
		
		char [] ch1 = {'s','u','n','i','l'};
		String b = new String(ch1,2,2);
		System.out.println(b);
		
		
	}

}
