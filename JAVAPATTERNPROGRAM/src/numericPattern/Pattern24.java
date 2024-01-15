package numericPattern;

public class Pattern24 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j <=4; j++) {
				System.out.printf("%2d ",(j%2));
			}
			System.out.println();
		}
	}
}
/*
0  1  0  1  0 
0  1  0  1  0 
0  1  0  1  0 
0  1  0  1  0 
0  1  0  1  0 
*/