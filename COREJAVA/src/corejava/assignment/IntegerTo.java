package corejava.assignment;

import java.util.Scanner;

public class IntegerTo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num= s.nextInt ();
		System.out.println("integer to binary ....."+Integer.toBinaryString(num));
		System.out.println("integer to octal ....."+ Integer.toOctalString(num));
		System.out.println("Integer to hexdesimal ....."+Integer.toHexString(num));

	}

}
