package advjava.stringmanuplation;

import java.util.Scanner;

public class Palandromic2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	while (true) {
		String count = "" ;
		String word ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word ");
		word = s.nextLine();
		char [] r = word.toCharArray();
		for (int i = r.length-1; i >=0; i--) {
			count += r[i] ;
		}
		System.out.println(count);
		if (count.equals(word)) {
			System.out.println("This is the palandromic word");
		}
		else {
			System.out.println("This is not a palandromic number ");
		}
	}
	}

}
/*
@SuppressWarnings("resource")
public static void main(String[] args) {
while (true) {
	String count = null ;
	String word ;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a word ");
	word = s.nextLine();
	char [] r = word.toCharArray();
	for (int i = r.length-1; i >=0; i--) {
		count += r[i];
	}
	if (count.substring(4).equals(word)) {
		System.out.println("This is the palandromic word");
	}
	else {
		System.out.println("This is not a palandromic number ");
	}
}
}*/

