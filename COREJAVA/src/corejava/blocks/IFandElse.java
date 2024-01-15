package corejava.blocks;

import java.util.Scanner;

public class IFandElse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a username ");
			String un = s.nextLine();
			System.out.println("Enter pass");
			String pas = s.nextLine();
			if (un.equals("sunil")&&pas.equals("123")) {
				System.out.println("login success");
			} else if (un.equals("sunil")&&!pas.equals("123")){
				System.out.println("plz enter the currct pass");
			}else if (!un.equals("sunil")&&pas.equals("123")) {
				System.out.println("Enter the currect user name ");
			}
			else {
				System.out.println("plz enter the currect username and password ");
			}
		}
	}

}
