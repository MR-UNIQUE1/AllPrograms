package generalProgram;

import java.util.Scanner;

public class EvenAndOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while(1>0) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a integer ");
		int integder= s.nextInt();
		
		if (integder%2==0) {
			System.out.println("The number is even ");
			
		} else {
			System.out.println("The number is odd ");
		}
	}
	}

}
