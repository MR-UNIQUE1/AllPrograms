package com.java.collection.arraylist;

import java.util.ArrayList;

public class CollToArrays {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList s = new ArrayList();
		s.add("sunil");
		s.add(10);
		s.add("richal");
		
		Object [] o =s.toArray();
		for (Object object : o) {
			System.out.println(object);
		}
	}
}
