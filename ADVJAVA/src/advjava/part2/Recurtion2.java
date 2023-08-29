package advjava.part2;

import java.util.Scanner;

public class Recurtion2 {
	
	@SuppressWarnings("resource")
	static void piin(String newpin2) {
		if (newpin2.length()==6&&newpin2.equals("752106")) {
			System.out.println("your pin is correct \n congratulation");
		} else {
			Scanner s = new Scanner( System.in);
			System.out.println("your pin is incorrect plz re-enter");
			String newpin = s.next();
			piin(newpin);
		}
	}	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Recurtion2 s = new  Recurtion2();
		s.piin("44");
	}

}
