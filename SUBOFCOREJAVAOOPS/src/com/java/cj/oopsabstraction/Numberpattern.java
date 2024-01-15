package com.youtubeshorts;

import java.util.Scanner;

public class Numberpattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number");
		int a = s.nextInt();
		for (int i = 1; i<=a; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.println(j+ " ");
			}
			System.out.println(i+" ");
		}

	}

}
