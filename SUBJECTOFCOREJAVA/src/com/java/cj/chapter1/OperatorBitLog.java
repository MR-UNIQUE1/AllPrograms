package com.java.cj.chapter1;

public class OperatorBitLog {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		if (10>7&20<30) {
			System.out.println("good morning sunil");
		}
		else {
			System.out.println("good morning mama");
		}
		
		if (10<20||10/0==0) {
			System.out.println("sunil is a  good boy");
		}
		else {
			System.out.println("mama is a good girl");
		}
		System.out.println(10&6);
		System.out.println("****************");
		if(true && true && true)
		{	System.out.println("Good morning");
		}
		else
		{	System.out.println("Good Night");		
		}
		System.out.println("*****************");
		if(false || false || true)
		{	System.out.println("Good morning");
		}
		else
		{	System.out.println("Good Night");		
		}
	}

}
