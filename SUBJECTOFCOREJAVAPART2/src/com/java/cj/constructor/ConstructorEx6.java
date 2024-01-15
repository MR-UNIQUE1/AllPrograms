package com.java.cj.constructor;

 class Empl {
	int id;
	String name;
	double salary;
	public static final String com="tcs";
	public static final String location="Hydrabad";
	public Empl(int id, String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	void satus() {
		if (salary>100000) {
			System.out.println("congratulation");
			System.out.println(id + "  "+name + "  "+salary + "  "+com + "  "+location);
		} else {
			System.out.println("sorry");
			System.out.println(id + "  "+name + "  "+salary + "  "+com + "  "+location);
		}
	}
	public static void main(String[] args) {
		Empl o =new Empl(1, "sunil", 8697979789.0);
		o.satus();
	}
}
