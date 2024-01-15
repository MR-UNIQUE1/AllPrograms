package com.java.lamda;
interface LamdaEx1 {
	public void greet ();
}

class Teses implements LamdaEx1{
	public void greet () {
		System.out.println("this is the implemented class");
	}
}
class ter {
	public static void main(String[] args) {
		Teses s = new Teses();
		s.greet();
	}
}
