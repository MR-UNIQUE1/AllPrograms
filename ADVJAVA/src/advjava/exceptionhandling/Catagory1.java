package advjava.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Catagory1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner( System.in);
		System.out.println("Enter the dividion value ");
		int num = s.nextInt();
		try {
			System.out.println(10/num);
			System.out.println("ratan".charAt(10));	 
		} catch (ArithmeticException e) {
			System.out.println(10/2);
		}
		catch (InputMismatchException e) {
			System.out.println("Plz enter valid input ");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Sunil");
		}
		System.out.println("rest of the application");
	}
	

}
