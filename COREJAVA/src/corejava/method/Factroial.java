package corejava.method;

import java.util.Scanner;

public class Factroial {
  static int factorial (int n) {
	  if (n>0) {
		return n*factorial(n-1);
	} else {
		return 1 ;
	}
  }
  public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number and see the factorial of this number");
	int num = s.nextInt();
	int result = Factroial.factorial(num);
	System.out.println("Factorial of this number is ........"+result );
}
}
