package corejava.assignment;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		int password = 1234;
		Scanner s = new Scanner(System.in);
	for (int i = 1; i <=4; i++) {
		
		System.out.println("enter your password ");
		int pass = s.nextInt();
		if (pass==password ) {
			System.out.println("congrat your login sucessuful");
			break;
			
		}else  {
			System.out.println("your password is incorrect plz try again");
		}
		
		if (i==4) {
			System.out.println("ta ta bye bye");
		}
	}

	s.close();
	}
	
}
