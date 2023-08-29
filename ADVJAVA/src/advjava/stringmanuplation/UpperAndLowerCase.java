package advjava.stringmanuplation;

import java.util.Scanner;

public class UpperAndLowerCase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sentence ");
		String g = s.nextLine();
		String []gg = g.split(" ");
		for (int i = 0; i < gg.length; i++) {
			if (gg[i]==gg[i]) {
				System.out.println(gg[i].toLowerCase() +"--------- "+gg[i].toUpperCase()+"----------- "+gg[i].length());
			}
		}

	}

}
