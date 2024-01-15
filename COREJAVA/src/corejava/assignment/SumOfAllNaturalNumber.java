package corejava.assignment;
import java.util.Scanner;

public class SumOfAllNaturalNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int count=0 ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = s.nextInt();
		for (int i = 0; i <=num; i++) {
			count +=i;
		}
		System.out.println(count);
	}
}
