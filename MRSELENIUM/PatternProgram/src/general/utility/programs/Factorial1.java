package general.utility.programs;

import java.util.Scanner;

public class Factorial1 {
	
	public static int facto(int n) {
		if (n!=0) {
			return n*facto(n-1);
		}
		else {
			return 1;
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number and find the factorial of this number ");
		int num = s.nextInt();
		int result=Factorial1.facto(num);
		System.out.println("The factorial of the number "+num +" :- "+result);
	}

}
