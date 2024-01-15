package com.java.cj.stringmanipulation;

public class Test3 {

	public static void main(String[] args) {
		
		int [] a = new int [10];			//0 0 0 0 0
		a [0] = 10 ;
		a [3]= 30 ;
		for (int i : a) {
			System.out.println(i);
		}
		
		String [] s = new String[3];		//null null null
		s[1] = "sunil";
		for (String string : s) {
			System.out.println(string);
		}
	}

}
