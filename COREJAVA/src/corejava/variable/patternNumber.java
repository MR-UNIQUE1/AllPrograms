package corejava.variable;
import java.util.Scanner;
@SuppressWarnings("resource")
public class patternNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number ");
		
		int num = s.nextInt();
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i +" ");
			} 
			System.out.println();
		}
	
	}

}
