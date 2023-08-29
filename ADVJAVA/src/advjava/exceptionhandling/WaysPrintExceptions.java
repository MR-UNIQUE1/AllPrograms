package advjava.exceptionhandling;

import java.util.Scanner;

public class WaysPrintExceptions {
	@SuppressWarnings("resource")
	void m1 () {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = s.nextInt();
		try {
			System.out.println(10/num);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("plz enter another number ");
		}
	}
	void m2 () {
		m1();
	}
	void m3 () {
		m2();
	}

	public static void main(String[] args) {
		WaysPrintExceptions s = new WaysPrintExceptions();
		
		s.m3();

	}

}
