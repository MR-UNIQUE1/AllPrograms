package com.java.oopsconcepat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in );
		System.out.println("Enter the division value ");
		try {
			int d = s.nextInt();
			System.out.println(10/d);
			System.out.println("sunil".charAt(9));
		} catch (ArithmeticException e) {
			System.out.println(10/2);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("the array contains highest length is "+ "sunil".length());
		}
		catch (InputMismatchException e) {
			System.out.println("Plz enter only number ");
		}
		System.out.println("Rest of the application normal termination");
	}
}
