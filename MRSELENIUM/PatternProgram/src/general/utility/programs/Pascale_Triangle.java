package general.utility.programs;

import java.util.Scanner;

public class Pascale_Triangle {
	
	public static int fact (int num) {
		int f =1 , i = 1;
		while (i<=num) {
			f*=i;
			i++;
		}
		return f;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the line of number");
		int line = s.nextInt();
		int i,j;
		for(i=0 ; i<line ; i++) {
			for ( j = 0; j<line-i-1  ; j++) {
				System.out.print(" ");
			}
			for ( j = 0; j <=i; j++) {
				System.out.print(" "+fact(i)/(fact(j)*fact(i-j)));
			}
			System.out.println("");
		}
	}

}
