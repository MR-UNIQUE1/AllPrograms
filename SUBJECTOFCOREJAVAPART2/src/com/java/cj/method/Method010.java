package com.java.cj.method;

public class Method010 {
	double calculateBill (String pName,double cost,int quantity) {
		double bill;
		bill=cost*quantity;
		return bill;
	}
	static String courierService(String name,String item, String location) {
		if (location.equals("hyd")) {
			return "hy374e9ej";
		} else if (location.equals("odisha")) {
			return "od848484od4";
		}else {
			return "oth448494";
		}
		
	}
	
}
class Testclient{
	public static void main(String[] args) {
		Method010 o= new Method010();
		double f =o.calculateBill("sunil",30.00,4);
		System.out.println(f);
		
		String u=Method010.courierService("sunil", "biriyani", "odisha");
		System.out.println(u);
	}
	
}
