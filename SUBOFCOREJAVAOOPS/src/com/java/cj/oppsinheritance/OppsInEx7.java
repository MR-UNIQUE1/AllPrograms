package com.java.cj.oppsinheritance;

public class OppsInEx7 {
}
class Sunil extends OppsInEx7{
	
}
class Mama extends Sunil{
	
}
class Test{
	public static void main(String[] args) {
		OppsInEx7 a= new OppsInEx7();
		Sunil b = new Sunil();
		Mama c = new Mama();
		System.out.println(a instanceof Object);	//true
		System.out.println(a instanceof OppsInEx7);	//true
		System.out.println(a instanceof Sunil);		//false
		System.out.println(a instanceof Mama);		//false
		System.out.println(b instanceof Object);	//true
		System.out.println(b instanceof OppsInEx7);	//true
		System.out.println(b instanceof Sunil);		//true
		System.out.println(b instanceof Mama);		//false
		System.out.println(c instanceof Object);	//true
		System.out.println(c instanceof OppsInEx7);	//true
		System.out.println(c instanceof Sunil);		//true
		System.out.println(c instanceof Mama);		//true
	
		
	}
}