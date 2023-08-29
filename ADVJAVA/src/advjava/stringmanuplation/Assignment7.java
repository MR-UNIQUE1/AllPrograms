package advjava.stringmanuplation;

import java.util.Scanner;

public class Assignment7 {

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
				if(!vowels.toString().contains(String.valueOf(ch)))
						vowels.append(ch);
			} else {
				if(!consonents.toString().contains(String.valueOf(ch)))
				consonents.append(ch);
			}
		}
		System.out.println("Volwel are.."+vowels+" Consonents are..."+consonents);

	}

}
