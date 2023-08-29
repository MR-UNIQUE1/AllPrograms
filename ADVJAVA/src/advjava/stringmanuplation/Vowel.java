package advjava.stringmanuplation;

import java.util.Scanner;

public class Vowel {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String vowel ="";
		String Consonant = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name ");
		String g = s.next();
		char [] ch = g.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='a' || ch[i]=='e'||ch[i]=='i' || ch[i]=='o'||ch[i]=='u') {
				vowel+=ch[i];
			} else {
				Consonant+=ch[i];
			}
		}
		System.out.println("The vowel word is "+ vowel);
		System.out.println("The consonant word is "+Consonant);
	}

}
