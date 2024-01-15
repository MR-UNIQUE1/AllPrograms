package corejava.arrays;

public class PrintArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,};
		System.out.println(a[1]);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int all : a) {	
			System.out.println();
		}

	}

}
