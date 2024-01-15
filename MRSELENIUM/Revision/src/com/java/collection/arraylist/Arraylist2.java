package com.java.collection.arraylist;

import java.util.ArrayList;

public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("ratan");
		a1.add("anu");
		ArrayList<String> a2 = new ArrayList<String>(a1);
		a2.add("rani");
		a2.add("usman");
		System.out.println(a2);
		ArrayList<String> a3 = new ArrayList<String >();
		a3.addAll(a1);
		a3.addAll(a2);
		a3.add("sunil");
		a3.add("Ranu");
		System.out.println(a3);
		System.out.println("The size of the array is = "+a3.size());
		System.out.println("**********************");
		/*a3.remove("ratan");
		for (String string : a3) {
			String[] e =string.split(",");								//this code is not correct 
			if (e.equals("ratan")) {
				System.out.println( );
			}else {
				System.out.println(string);
			}
		}*/
	
		a3.set(1, "richal");
		System.out.println(a3);
		a3.clear();
		System.out.println("All the data is delated ? :-"+ a3.isEmpty());
	}
}
