package general.utility.programs;

import java.util.Scanner;

public class Prime_Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int count =0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num= s.nextInt();
		for (int i = 1; i <=num; i++) {
			if (num%i==0) {
				count++;
			}
			
		}
		if (count==2) {
			System.out.println("This ("+num+") is prime number");
		} else {
			System.out.println(num+":-This is not a prime number ");
		}
	}

}
