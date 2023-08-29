package advjava.arrays;

public class A {
	public static void main(String[] args) {
		int [] a ;
		a = new int[6];
		a [2]= 39;
		a[0]= 20 ;
		a[1]= 30 ;
		a[3]= 40 ;
		a[4]= 50;
		a[5 ]=60;
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
			
			int [] b = {1,2,3 , 4,5,6,7,8};
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[j]);
			}
		}
		 
	}
}
