package general.utility.programs;

import java.util.Scanner;

public class Palandromic {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word to check this is palandromic or not ");
		String word = s.nextLine();
		StringBuffer b = new StringBuffer(word);
		if (word.contentEquals(b.reverse())) {
			System.out.println("This is a palandromic word");
		}else {
			System.out.println("This is not a palandromic word");
		}
	}

}