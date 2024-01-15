package generalProgram;

import java.util.Scanner;

public class Swap {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = s.nextInt();
		System.out.println("Enter second number ");
		int y = s.nextInt();
		System.out.println(x);
		System.out.println(y);
		temp = x;
		x=y;
		y=temp;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
