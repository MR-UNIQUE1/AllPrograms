package general.utility.programs;

import java.util.Scanner;

public class Even_Odd_number {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number (0-n). To know this number is odd / even");
		int num = s.nextInt();
		if (num%2==0) {
			System.out.println("This number is even");
		} else if(!((num%2)==0)) {
			System.out.println("This number is odd");
		}else {
			System.out.println("This number is zero");
		}
	}

}
