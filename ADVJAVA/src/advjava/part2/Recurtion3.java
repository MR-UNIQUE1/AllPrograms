package advjava.part2;

import java.util.Scanner;

public class Recurtion3 {
	public static void validae (int a ) {
		if (a>0) {
			System.out.println("This is the method recurtion ");
			System.out.println("The number are "+a);
			validae(--a);
		}
		else {
			System.out.println("The number is negetive ");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = s.nextInt();
		validae(num);
		

	}

}
