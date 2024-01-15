package com.java.lamda;

@FunctionalInterface
interface Service {
	String login(String username ,String password);
}

public class LamdaEx4 {
	public static void main(String[] args) {
		Service s = (username,password)-> 
		{return username.equalsIgnoreCase("ratan")&&password.equalsIgnoreCase("Ratan@dd")?"loginsucess":"login failed";}; 
		String rr = s.login("ratan", "ratan@dd");
		System.out.println("login status is "+ rr);
	}
}