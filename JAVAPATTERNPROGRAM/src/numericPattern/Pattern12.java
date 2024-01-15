package numericPattern;

public class Pattern12 {

	public static void main(String[] args) {
		int a = 5 ;
		int b  ;
		
		for (int i = 1; i <=a; i++) {
			b=i;
			for (int j = 1; j <=a; j++) {
				System.out.printf("%3d ",b);
				b+=a;
			}
			System.out.println();
		}

	}

}
