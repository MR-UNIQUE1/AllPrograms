package corejava.assignment;

import java.util.Scanner;

public class NestedLoop {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = s.nextInt();
		if (num>0) {
			if (num%2==0) {
				System.out.println("The number is positive and even ");
			} else {
				System.out.println("The number is positive and odd");
			}
		}else if (num<0) {
			if (num%2==0) {
				System.out.println("The number is negetive and even ");
			} else {
				System.out.println("The number is negetive and odd");
			}
		}
		else {
			System.out.println("The number is zero");
		}
	}

}
