package com.java.lamda;

public interface LamdaEx3{
	public void wish ();
}
class tyes {
	public static void main(String[] args) {
		LamdaEx3 rr = () -> {System.out.println("Ratan sir is great ");System.out.println("this is too good");};
		rr.wish();
		
		LamdaEx3 tt = () -> {System.out.println("Sunil is a student of the ratan sir");};
		tt.wish();
	}
}