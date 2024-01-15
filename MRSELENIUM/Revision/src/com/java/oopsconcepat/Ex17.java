package com.java.oopsconcepat;

interface Ex171 {
	public void a1();
	public void a2();
	public void s3();
	public void s4 ();
}
class testAdaptor implements Ex171{
	public void a1() {}
	public void a2() {}
	public void s3() {}
	public void s4 () {}
}
class tr extends testAdaptor {
	public void a4 () {
		System.out.println("This is the requiremented a2 class ");
	}
}
class Ex17 {
	public static void main(String[] args) {
		tr s = new tr();
		s.a4();
		s.a2();
	}
}
