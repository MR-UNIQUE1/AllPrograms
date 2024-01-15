package com.java.cj.assignments;

import java.util.Scanner;

public class Assignment11 {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Now where are you , Enter the place name ");
		String name = scanner.next();
		if (name.equals("hyd")||name.equals("sec")) {
			System.out.println("visit Charminar .......... enjoy");
		} else if (name.equals("vij")||name.equals("bra")){
			System.out.println("Visit Durga temple .......... enjoy");
		}else if (name.equals("ampt")||name.equals("srn")) {
			System.out.println("visit ratan sir class and enjoy java");
		}else {
			System.out.println("plz put proper information");
		}
		
	}
}
