package com.java.cj.chapter1;

public class LoopForEach {

	public static void main(String[] args) {
		int []a = {10,20,33,4,44,55,66,77,88,99};
		System.out.println(a[0]);
		System.out.println(a.length);
		System.out.println("*****************");
		for (int i : a) {
			if (a.length==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("**********");
		for (int x : a)
		{	System.out.println(x);
		}

		System.out.println("******");

		String[] names = {"ratan","anu","sravya"};
		for (String name : names)
		{	System.out.println(name);
		}
	}

}
