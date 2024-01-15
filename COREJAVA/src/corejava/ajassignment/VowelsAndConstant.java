package corejava.ajassignment;

import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class VowelsAndConstant {

	public static void main(String[] args) {
		StringBuffer vowelss = new StringBuffer();
		StringBuffer consonents= new StringBuffer();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("enter the name");
		String store = s.nextLine();
		char [] ch = store.toCharArray();
		for (char c : ch) {
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowelss.append(c);
			}
			else {
				consonents.append(c);
			}
		}
		System.out.println("The vowels are ......."+vowelss);
		System.out.println("The consonents are ......."+consonents);
		}

	}

