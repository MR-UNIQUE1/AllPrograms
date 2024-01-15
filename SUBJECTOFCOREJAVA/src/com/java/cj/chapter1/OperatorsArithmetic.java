package com.java.cj.chapter1;

public class OperatorsArithmetic {
	public static void main(String[] args) {
		int a= 60 ;
		int b= 30;
		System.out.println(a+b);		//90
		System.out.println(a-b);		//30
		System.out.println(a*b);		//1800
		System.out.println(a/b);		//2
		System.out.println(a%b);		//0
		
		System.out.println("****************");
		
		String name = "sunil";
		int num= 1000;
		System.out.println(name+num);	//sunil1000
		System.out.println("****************");
		
		System.out.println(10+20);					//30
		System.out.println("ratan"+"anu");			//ratananu
		
		System.out.println(10+"anu");				//10anu
		System.out.println("anu"+10.5);				//anu10.5

		System.out.println(10+20+"ratan"+"anu");	//30ratananu
		System.out.println("ratan"+"anu"+10+20);	//ratananu1020

		System.out.println("ratan"+10+20+"anu");	//ratan1020anu
		System.out.println(10+20+"ratan"+5+5);		//30ratan55
		System.out.println(10+"ratan"+(20+5)+("durga"+3+3));		//10ratan25durga33
		System.out.println(10+"ratan"+3*10/2+"durga");				//10ratan15durga
	}

}
