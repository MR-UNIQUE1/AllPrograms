package general.utility.programs;

import java.util.Scanner;

public class Swap_Two_number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int fno= s.nextInt();
		System.out.println("Enter second number ");
		int sno = s.nextInt();
		System.out.println("Before swap first no ="+fno +"and second number "+sno );
		temp = fno;
		fno = sno;
		sno = temp;
		System.out.println("Afer swap first no ="+fno +"and second number "+sno );
	}

}