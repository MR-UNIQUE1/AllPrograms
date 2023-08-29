package testng;

import java.util.Scanner;

import org.testng.annotations.Test;

public class WordPresentOrNot {
  @SuppressWarnings("resource")
@Test
  public void f() {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter some names with ','");
	  String si = s.nextLine();
	  String [] r = si.split(",");
	  for (int i = 0; i < r.length; i++) {
		if (r[i].equals("sunil")) {
			System.out.println(r[i]);
		} 
	}
  }
}
