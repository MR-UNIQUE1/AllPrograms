package com.java.collection.arraylist;

import java.util.ArrayList;

public class GenericCollToArray {
	public static void main(String[] args) {
		ArrayList <String>s = new ArrayList<String>();
		s.add("sunikl");
		s.add("ranu");
		s.add("richal");
		
		String [] arr = new String[s.size()];
		s.toArray(arr);
		
		for (String sss : arr) {
			System.out.println(sss);
		}
	}
}
