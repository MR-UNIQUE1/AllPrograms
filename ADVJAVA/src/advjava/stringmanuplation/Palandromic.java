package advjava.stringmanuplation;

import java.util.Scanner;

public class Palandromic {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		while (true) {
			String name;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a name ");
			name = s.nextLine();
			StringBuffer b = new StringBuffer(name);
			
			if (name.contentEquals(b.reverse())) {
				System.out.println("This is a palandromic word ");
			}
			else {
				System.out.println("THis is not a palandromic word ");
			}
		}

	}

}
