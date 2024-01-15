package com.java.stringmanuplation;

import java.util.Scanner;

public class String14 {

	public static void main(String[] args) {
		String county = "";
		String Cou= "";
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = s.nextLine();
		char[] c = word.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				county +=c[i];
			}else {
				Cou+=c[i];
			}
		}
		System.out.println("The prurals are "+ county);
		System.out.println("The consonants are"+ Cou);
		
	}

}
