package generalProgram;

import java.util.Scanner;

public class largestAmstrongNo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n,max;
		int a [];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number are u put");
		n = s.nextInt();
		System.out.println("Enter the number ");
		a = new int[n];
		for (int i = 0; i <n; i++) {
			a[i]=s.nextInt();
		}
	
	max = maximun(a,n);
	System.out.println("The largest number is"+max);
	}
	static int maximun(int a[],int n) {
		int m=0;
		for (int i = 0; i <n; i++) {
			if (a[i]>m) {
				m=a[i];
			}
		}
		return m;
	}

}
