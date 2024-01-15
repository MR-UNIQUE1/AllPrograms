package com.java.interfaces;

interface Bank{
	int limit = 40000;
	public void roi();
}
class AxisBank implements Bank{
	public void roi() {
		System.out.println("The limit of the withdral in axis per day is "+limit );
	}
}
class statebank implements Bank {
	public void roi () {
		System.out.println("The limit of the withdral in statbank is "+limit);
	}
}
public class Testc {
	
	public void withdral (Bank b) {
		b.roi();
	}

	public static void main(String[] args) {
		Testc s = new Testc();
		s.withdral(new AxisBank());
		s.withdral(new statebank());
		

	}

}
