package com.java.cj.chapter1;

public class FlowIfElses {
	public static void main(String[] args) {
		String str, reverse = "";
		str = "madam";
		System.out.println("No.of characters in str:" + str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		if (str.equals(reverse))
			System.out.println(str + " is a palindrome");
		else
	System.out.println(str + " is not a palindrome");
	}
}

