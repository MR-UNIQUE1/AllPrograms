package general.utility.programs;

import java.util.Scanner;

public class EvenOddPositive_ve {

	public static void main(String[] args) {
		while (true) {
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number ");
			int num = s.nextInt();
			if (num>0) {
				if (num%2==0) {
					System.out.println("This number is positive and even ");
				}
				else {
					System.out.println("This number is positive and odd");
				}
			} else if(num<0){
				if (num%2==0) {
					System.out.println("This number is negative and even");
				}else {
					System.out.println("This number is negative and odd");
				}
			}
			else {
				System.out.println("This number is '0'(Zero)");
			}
		}
	}

}
