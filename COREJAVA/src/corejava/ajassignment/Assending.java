package corejava.ajassignment;

import java.util.Scanner;

public class Assending {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int [] a = new int [5]; int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		for (int i = 0; i <5; i++) {
			a[i]=s.nextInt();
		} 
		for (int i = 0; i <5; i++) {
			for (int j =i+1; j <5; j++) {
				if (a[i]>a[j]) {
					temp =a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
		}
		System.out.println("assending number of the array is ...");
		for (int i = 0; i <5; i++) {
			System.out.println(a[i]+" ");
		}
		
	}

}







