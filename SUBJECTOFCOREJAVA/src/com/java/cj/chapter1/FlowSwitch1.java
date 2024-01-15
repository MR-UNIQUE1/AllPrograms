package com.java.cj.chapter1;

import java.util.Scanner;

public class FlowSwitch1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("if you are a employee then plz put your day(like mon,tues,sun,wednes,fri,sut,thurs)");
		String day= s.nextLine();
		switch (day) {
		case "mon":
		case "tues":
		case "wednes":System.out.println("focous on your office work, office work will be important");
			break;
		case "thur":
		case "fri":System.out.println("70% office work will be finish so you can take small break in the middle of the work");
			break;
		case "sat":
		case "sun":System.out.println("100% work will be finish so you can rest these two days");
			break;
		default: System.out.println("plz enter given instruction");
			break;
		}
	}
}
