package com.java.cj.chapter1;

import java.util.*;
import java.util.Scanner;

public class OperatorElseIf {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter you age ");
			int age = s.nextInt();
			if (age<=17&&age>=0) {
				System.out.println("now you are child not adult so do think about your study");
			}
			else if (age>=18&&age<=32) {
				System.out.println("you think about your future and continue your study , in the middle of the time you got merriade");
			}
			else if (age<=59&&age>=33) {
				System.out.println("think about your future and your children future ");
			}
			else if  (age<=60&&age>=100){
				System.out.println("you recieve your pension and enjoy ");
			}
			else if (age <=101&&age>=120){
				System.out.println("you have no work plz rest on bed");
			}
			else {
				System.out.println("you are the ghost plz don't disturb anyone");
			}
	 
		} catch (InputMismatchException h) {
			System.out.println(" plz put your age not except the age");
		}
		
	}

}
