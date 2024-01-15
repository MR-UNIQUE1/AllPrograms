package corejava.datatypes;

import java.io.Console;

public class ReadLine {
	
	public static void main(String[] args) {
		String str ; char ch[];
		Console s = System.console();
		System.out.println("Enter your id");
		str = s.readLine();
		System.out.println("Enter your password ");
		ch = s.readPassword();
		String a = String.valueOf(ch);
		
		System.out.println("user name = "+str);
		System.out.println("password = "+a);
	}

}
