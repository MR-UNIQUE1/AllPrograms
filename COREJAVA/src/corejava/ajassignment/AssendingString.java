package corejava.ajassignment;

import java.util.Scanner;

public class AssendingString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String temp;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter how many names you are enter ");
		int n = s.nextInt();
		String names [] = new String [n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		for (int i = 0; i <n; i++) {
			names [i]= sc.nextLine();
		}
		
		for (int i = 0; i <n; i++) {
			for (int j =i+1; j <n; j++) {
				if (names[i].compareTo(names[j])>0) {
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		for (int i = 0; i <n; i++) {
			System.out.print(names[i]+" ");
		}

	}

}
