package com.ashu.java;

public class C1 {
//jump statement  : 
	// Type 1: continue statement
	public static void main(String[] args) {

		int i;
		while (true) {
		for (i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.println("odd number is ...."+i); // i want to print 2,4,6,8,10
				break;
			
			
			//System.out.println(i); // i want to print 1,3,5,7,9
			
/* i want to print both 2,4,6,8,10 and 1,3,5,7,9 at a time in one console
 *  but an error arises. what do i do.	
 *  the editor only allows me one of the print function at once */
			

		}

	}

}
}
