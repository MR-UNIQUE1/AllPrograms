package com.java.collection.arraylist;

import java.util.ArrayList;

public class Arraylist4 {
	public static void main(String[] args) {
		ArrayList<String > s= new ArrayList<String >();
		s.add("sunil");
		s.add("raja");
		s.add("rupesh");
		s.add("teja");
		s.add("arun");
		ArrayList<String > j = new ArrayList<String>(s);
		j.add("ranu");
		j.add("richal");
		j.add("sima");
		j.add("di");
		j.add("pageli");
		System.out.println(j.containsAll(s));
		j.removeAll(s);
		j.retainAll(s);
		System.out.println(j);
	}
}
