package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist3 {
	public static void main(String[] args) {
		ArrayList<String > t = new ArrayList<String >();
		for (int i = 0; i <10; i++) {
			t.add("ratan");
		}
		System.out.println(t);
		
		System.out.println("*********************");
		ArrayList<String > s = new ArrayList<String >(Collections.nCopies(10, "sunil"));
		s.add("rany");
		s.add("raja");
		System.out.println(s);
		
		Collections.swap(s, 10, 1);
		System.out.println(s);
	}
}
