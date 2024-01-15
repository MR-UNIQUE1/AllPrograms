package com.java.stringmanuplation;

public class String9 {
	public static void main(String[] args) {
		String s1 = "Hi ratan sir how are you";
		String[] words = s1.split(" ");
		for (String word : words)
		{	System.out.println(word);
		}
		
		System.out.println("******");

		String s2 = "Hi, anu madam, how, are, you";
		String[] ns = s2.split(",",4);
		for(String n : ns)
		{	System.out.println(n);			
		}
		
		System.out.println("********");

		int[] numbers = {10,20,30,40};
		System.out.println(numbers.length);
		System.out.println("ratan".length());
	}
}
