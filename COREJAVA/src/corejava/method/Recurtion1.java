package corejava.method;

import java.util.Scanner;

public class Recurtion1 {
	static void pinValidate (String pin) {
		if (pin.length()==6) {
			System.out.println("your pin register sucessufully");
		} else {
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			System.out.println("You enter worng pin , so again enter pin ");
			String newpin = s.next();
			pinValidate(newpin);
		}
	}
	public static void main(String[] args) {
		pinValidate("3837389");
	}

}
