package com.java.cj.assignments;

import java.util.Scanner;

public class Assignment14 {
	public static void main(String[] args) {
		String name = "sunil, mama , ranu , sanvi , kandha ";
		String [] gg= name.split(",");
		for (String string : gg) {
			System.out.println(string);
		}
	}
}
