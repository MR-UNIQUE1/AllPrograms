package generalProgram;

import java.util.Scanner;

public class Swap2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number ");
		int x = s.nextInt();
		int y = s.nextInt();
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap the value of the x and y are changed \n then the value of the x and y is");
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
