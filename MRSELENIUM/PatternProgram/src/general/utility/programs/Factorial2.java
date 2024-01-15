package general.utility.programs;

import java.util.Scanner;

public class Factorial2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int factd = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number and find the factorial");
		int fact= s.nextInt();
		for (int i = 1; i <=fact; i++) {
			factd *=i;
		}
		System.out.println("Factorial of the number "+fact +" is : =  "+factd);
	}

}
