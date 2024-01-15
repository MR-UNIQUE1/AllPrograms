package corejava.ajassignment;

import java.util.Scanner;

public class LargestNumberInTheArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int [] a = new int[5] ;int max ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		for (int i = 0; i <5; i++) {
			a[i]= s.nextInt();
		}
		max=a[0];
		for (int i = 1; i <5; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("The greater number in the array is ......."+max);
				
	}

}
