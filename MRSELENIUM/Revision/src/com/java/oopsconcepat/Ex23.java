package com.java.oopsconcepat;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number are you want to put ");
		int n = s.nextInt();
		System.out.println("PUt the 5 number ");
		int num = s.nextInt();
		int [] s1 = new int [n];
		s1[0]= num;
		s1[1]=num;
		s1[2]=num;										// Wrong program
		for (int i : s1) {
			System.out.println(i);
		}
	}
}
