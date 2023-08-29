package testng;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palandromic {
  @SuppressWarnings("resource")
@Test
  public void f() {
	  String count ="";
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter a word ");
	  String word = s.nextLine();
	  char [] j = word.toCharArray();
	  for (int i = j.length-1; i>=0; i--) {
		count += j[i];
	}
	  if (count .equals(word)) {
		System.out.println("This is the palandromic  word");
	}
	  else {
		System.out.println("This is not a palandromic word ");
	}
  }
}
