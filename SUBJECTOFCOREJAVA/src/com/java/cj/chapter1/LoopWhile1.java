package com.java.cj.chapter1;

import java.util.Scanner;

public class LoopWhile1 {

	public static void main(String[] args) {
		
		int a=22;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("enter your guss value");
			int val=s.nextInt();
			if (val==a) {
				System.out.println("congratulation , you can guss correct value");
				break;
			}else if (val>a) {
				System.out.println("you can enter more than guss value");
			}else {
				System.out.println("you can guss lessthan guss value");
			}
		}
	}

}
