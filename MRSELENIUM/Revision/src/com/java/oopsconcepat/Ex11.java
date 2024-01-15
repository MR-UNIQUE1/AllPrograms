package com.java.oopsconcepat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("enter the division value");
		try {
		int num = s.nextInt();
		System.out.println(10/num);
		System.out.println("ratan".charAt(10));	
		}catch(ArithmeticException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException |InputMismatchException e){
			e.printStackTrace();
		}
		System.out.println("rest of the application executed ");
	}
}
