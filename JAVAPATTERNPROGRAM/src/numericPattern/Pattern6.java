package numericPattern;

public class Pattern6 {

	public static void main(String[] args) {
		for (int i = 0; i <=25; i+=5) {
			for (int j=i+1; j <=i+5; j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

}
