package numericPattern;

public class Pattern17 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.printf("%4d",2*(i+j)-3);
			}
			System.out.println();
		}

	}

}
/*
    1   3   5   7   9
   3   5   7   9  11
   5   7   9  11  13
   7   9  11  13  15
   9  11  13  15  17

 */