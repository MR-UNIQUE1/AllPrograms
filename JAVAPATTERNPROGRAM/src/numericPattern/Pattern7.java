package numericPattern;

public class Pattern7 {

	public static void main(String[] args) {
		int a = 5;
		int b = 1;
		
		for (int i = 1; i <=a; i++) {
			for (int j = 1; j <=a; j++) {
				System.out.printf("%4d ",b);
				b+=2;
			}
			System.out.println();
		}

	}

}
