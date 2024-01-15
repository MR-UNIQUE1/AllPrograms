package corejava.datatypes;

import java.util.Scanner;

public class ReadStatement1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner( System.in);
			System.out.println("enter a integer number ");
			int integernum = s.nextInt();
			System.out.println("Enter a float number ");
			float floatnum = s.nextFloat();
			
			System.out.println("The Integer Number is ........"+integernum);
			System.out.println("The Floating Number is ........."+floatnum);
		} catch (Exception e) {
			System.out.println("Input Error"+e);
		}
		
		
		
	}

}
