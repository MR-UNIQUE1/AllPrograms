package general.utility.programs;

import java.util.Scanner;

public class Largest_Among_number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number are you enter");
		int num= s.nextInt();
		int[] a = new int[num];
		
		System.out.println("Enter the number ");
		for (int i = 0; i <num; i++) {
			System.out.println("Enter element"+(i+1));
			a[i]= s.nextInt();
		}
		int max=a[0];
		for (int i = 0; i <a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("The maximum number is "+max);
	}

}