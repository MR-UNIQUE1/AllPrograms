package com.java.stringmanuplation;

import java.util.StringTokenizer;

public class String12 {
	public static void main(String[] args) {
		 StringTokenizer st = new StringTokenizer("this is a test");
		 while (st.hasMoreTokens()) {
			 System.out.println(st.nextToken());
		 }


		 System.out.println("**********");
		 
		 //Here we are using userdefined splitting character. 
		 StringTokenizer st1 = new StringTokenizer("this, is a, test",",");
		 while (st1.hasMoreTokens()) {
			 System.out.println(st1.nextToken());
	}
	}}
