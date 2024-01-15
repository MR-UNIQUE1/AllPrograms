package numericPattern;

public class Pattern1201 {

	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			for (int j=i+1; j <=25; j+=5) {
				System.out.printf("%3d ",j);
			}
			System.out.println();
		}
	}

}
