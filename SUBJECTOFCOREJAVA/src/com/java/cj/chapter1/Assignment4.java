package com.java.cj.chapter1;

import java.util.Scanner;

public class Assignment4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name ");
		String sname=s.nextLine();
		System.out.println("Enter your math,science,social marks ");
		double math=s.nextDouble();
		double science = s.nextDouble();
		double social = s.nextDouble();
		double total,average;
		total=math+science+social;
		average=total/3;
		if (average>50) {
			System.out.println("congratulation , you passed ");
			System.out.println("student name is ..........."+sname);
			System.out.println("student total marks .........."+total);
			System.out.println("student age ..........."+average);
		}else {
			System.out.println("sorry , you are fail");
			System.out.println("student name is ..........."+sname);
			System.out.println("student total marks .........."+total);
			System.out.println("student age ..........."+average);
		}
	}

}