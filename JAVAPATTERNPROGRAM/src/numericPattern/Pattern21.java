package numericPattern;

public class Pattern21 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j <=n; j++) {
				System.out.printf("%2d ",(i*j)%2);
			}
			System.out.println();
		}
	}
}
/*
 0  1  0  1  0  1 
 0  0  0  0  0  0 
 0  1  0  1  0  1 
 0  0  0  0  0  0 
 0  1  0  1  0  1 

 */