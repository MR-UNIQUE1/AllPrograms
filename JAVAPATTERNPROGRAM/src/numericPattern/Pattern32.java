package numericPattern;

public class Pattern32 {

	public static void main(String[] args) {
		int n = 5;
		int x ;
		for (int i = 0; i <n; i++) {
			x=i;
			for (int j = 1; j <=n; j++) {
				x+=n;
				System.out.print((char)(x-n+65)+" ");
			}
			System.out.println();
		}
	}
}
/*
A F K P U 
B G L Q V 
C H M R W 
D I N S X 
E J O T Y 

 */