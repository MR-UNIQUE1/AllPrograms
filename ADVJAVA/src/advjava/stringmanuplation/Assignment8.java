package advjava.stringmanuplation;

import java.util.Scanner;

public class Assignment8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int count =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three / two digit number ");
		String num = s.next();
		char [] ch = num.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count +=(ch[i]-'0');
		}
		System.out.println(count);
		
	}
}
