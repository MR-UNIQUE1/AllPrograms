package numericPattern;

public class Pattern31 {

	public static void main(String[] args) {
		int n = 5 ;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print((char)(i+j+65)+" ");
			}
			System.out.println();
		}
	}
}
/*
A B C D E 
B C D E F 
C D E F G 
D E F G H 
E F G H I 
*/