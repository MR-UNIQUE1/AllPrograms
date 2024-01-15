package numericPattern;

public class Pattern33 {

	public static void main(String[] args) {
		int n = 5;
		int x;
		for (int i = 1; i <=n; i++) {
			x=n-i;
			for (int j = 1; j <=n; j++) {
				
				System.out.print((char)(x+65)+" ");
				x=x+n;
			}
			System.out.println();
		}
	}
}
/*
E J O T Y 
D I N S X 
C H M R W 
B G L Q V 
A F K P U 
 */