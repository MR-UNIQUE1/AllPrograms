package numericPattern;

public class Pattern19 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j <5; j++) {
				System.out.printf("%3d ",(i+j)%2);
			}
			System.out.println();
		}

	}

}
/*
  1   0   1   0   1 
  0   1   0   1   0 
  1   0   1   0   1 
  0   1   0   1   0 
  1   0   1   0   1 

 */