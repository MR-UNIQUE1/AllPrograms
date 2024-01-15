package com.java.cj.assignments;

import java.util.Scanner;

public class Assignment12 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter today day name");
		String name = scanner.next();
		switch (name) {
		case "mon":
		case "tue":
		case "wed":System.out.println("discount.......5%");
		break;
		
		case "thr":
		case "fri":System.out.println("discount ........4%");
		break;
		
		case "sat":
		case "sun":System.out.println("discount ...........3%");
        break;
		default:System.out.println("put the proper information");
			break;
		}
	}
}
