package advjava.stringmanuplation;

import java.util.Scanner;

public class Assignment3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a hii ratan sir in different format ");
		String sen = s.nextLine();
		String[] word = sen.split(" ");
		for (String ee : word) {
			if (ee.equalsIgnoreCase("ratan")) {
				System.out.println("Ratan is present in this sentence ");
			}
			
		}
	}
}
