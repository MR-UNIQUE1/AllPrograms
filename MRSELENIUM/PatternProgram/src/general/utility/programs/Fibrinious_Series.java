package general.utility.programs;

import java.util.Scanner;

public class Fibrinious_Series {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int first_No=0 ,second_no=1, result,count=0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = s.nextInt();
		while (true) {
			result= first_No+second_no;
			 count++;
			if (result>=num) {
				break;
			}
			first_No= second_no;
			second_no=result;
			System.out.println("The series is No-"+count+" :-:"+result);
		}
	}

}
