package com.java.cj.constructor;

 class Emp {
	 int id;
	 String name;
	 double salary;
	 String com;
	 String location;
	public Emp(int id ,String name,double salary,String com,String location) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.com=com;
		this.location=location;
	}
	void status() {
		if (salary>=900000) {
			System.out.println("you are eligible for my daughter");
			System.out.println("your id..."+id+ "  "+"your name is...."+name+ "  "+"your salary is ....."+salary+ "  "+"your com is"+com+ "  "+"your location"+location);
		}
		else {
			System.out.println("you are not eligible for my daughter");
			System.out.println("your id..."+id+ "  "+"your name is...."+name+ "  "+"your salary is ....."+salary+ "  "+"your com is"+com+ "  "+"your location"+location);
		}
	}
	public static void main(String[] args) {
		Emp t = new Emp(1, "sunil", 37777648.99, "tcs", "hydrabad");
		t.status();
		
		Emp u = new Emp(2, "dkjj", 38338.44, "tcs", "hyd");
		u.status();
	}

}
