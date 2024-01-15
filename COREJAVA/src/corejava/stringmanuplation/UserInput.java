package corejava.stringmanuplation;

import java.util.Scanner;

public class UserInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the more than two number ");
		int [] ass = new int [5];
		
		for (int i = 0; i <5; i++) {
			System.out.println("enter value for arr["+i+"]-");
			ass[i]= s.nextInt();
		}
		

	}

}
