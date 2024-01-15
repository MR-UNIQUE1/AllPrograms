package corejava.assignment;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your name ");
			String names = s.next();
			System.out.println("Enter your student roll no.");
			int rollno= s.nextInt();
			System.out.println("Enter your marks ");
			double marks = s.nextDouble();
			
			System.out.println("Student name ....."+names+"/n "+"roll no ...."+rollno+" /n"+"marks ....."+marks);
			System.out.println("are you put other student details .....(yes/no)");
			String option = s.next();
			if (option.equalsIgnoreCase("no")) {
				break;
			}
		}
		s.close();
		

	}

}
