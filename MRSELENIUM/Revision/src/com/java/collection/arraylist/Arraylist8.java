package com.java.collection.arraylist;

import java.util.List;

public class Arraylist8 {
	public static void main(String[] args) {
		List<Integer>  s = List.of(29,23,243,35,54,7);
		System.out.println(s);
		
		List<String> t = List.of();
		System.out.println(t);
		
		Student t1 = new Student(11, "sunil", 283.7);
		
		List<Student > u = List.of(t1);
		for (Student rr : u) {
			System.out.println(rr.sid +" "+ rr.sname+" "+rr.smarks);
		}
	}
}
