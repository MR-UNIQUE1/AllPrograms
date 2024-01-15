package generalProgram;

import java.util.Scanner;

public class PrimeNo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = s.nextInt();
		for (int i = 1; i <=n; i++) {
			if (n%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("This is a prime number");
		} else {
			System.out.println("This is not a prime number");
		}

	}

}
