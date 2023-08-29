package advjava.stringmanuplation;

import java.util.Scanner;

public class Assignment6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = scanner.next();
		char[] chars = name.toCharArray();
		StringBuffer vowels = new StringBuffer();
		StringBuffer consonents = new StringBuffer();
		for (char ch : chars) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels.append(ch);
			} else {
				consonents.append(ch);
			}
		}
		System.out.println("Volwel are.."+vowels+" Consonents are..."+consonents);
	}

}
