package numericPattern;

public class Pattern9 {

	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.printf("%2d ",(j*i));
			}
			System.out.println();
		}

	}

}