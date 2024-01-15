package com.java.lamda;

public interface LamdaEx2 {
	public void greet ();
}

class Tree{
	public static void main(String[] args) {
		LamdaEx2 lam = ()->System.out.println("this is the lamda expression");
		lam.greet();
	}
}
