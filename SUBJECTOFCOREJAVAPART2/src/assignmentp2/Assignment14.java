package assignmentp2;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name");
		String name = s.nextLine();
		System.out.println("enter your science mark");
		double science = s.nextDouble();
		System.out.println("enter your social mark");
		double social= s.nextDouble();
		System.out.println("enter your math mark");
		double math = s.nextDouble();
		
		double totalMark;
		totalMark=science+social+math;
		
		double avg;
		avg=totalMark/3;
		
		char grade ;
		
		if (avg<=100 && avg>=70) {
			grade='a';
		} else if (avg<=69&&avg>=60) {
			grade='b';
		}else if (avg<=59&&avg>=50) {
			grade='c';
		} else {
			grade='d';
		}
		System.out.println("your name is ....."+name);
		System.out.println("your tatalmark is........"+totalMark);
		System.out.println("your avg is ...."+avg);
		System.out.println("your grade is ......."+grade);
	}

}
