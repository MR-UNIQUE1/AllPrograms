package numericPattern;

public class Pattern25 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.printf("%2d ",(j%2));
			}
			System.out.println();
		}
	}
}
/*
 1  0  1  0  1 
 1  0  1  0  1 
 1  0  1  0  1 
 1  0  1  0  1 
 1  0  1  0  1 

 */