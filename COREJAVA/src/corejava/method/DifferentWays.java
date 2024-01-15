package corejava.method;

import java.util.Scanner;

public class DifferentWays {
	
	static void add (int a , int b) {
		int res ;
		res = a+b;
		System.out.println(res);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		DifferentWays.add(30, 40);
		
		int a = 30,  b = 70;
		DifferentWays.add(a, b);
		
		Scanner s = new Scanner(System.in );
		System.out.println("Enter first number ");
		int num1 = s.nextInt();
		System.out.println("Enter second number ");
		int num2 = s.nextInt();
		DifferentWays.add(num1, num2);
		
		
		
	}

}
