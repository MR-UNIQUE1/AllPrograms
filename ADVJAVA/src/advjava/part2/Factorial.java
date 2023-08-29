package advjava.part2;

import java.util.Scanner;

public class Factorial {
	public static int xyz (int a ) {
		if (a>0) {
			return a*xyz(--a);
		} else {
			return 1;
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number and saw the factorial of this number");
		int num = s.nextInt();
		int result = Factorial.xyz(num);
		System.out.println("The factorial of this number "+num + "is :-    "+result);
	}
}