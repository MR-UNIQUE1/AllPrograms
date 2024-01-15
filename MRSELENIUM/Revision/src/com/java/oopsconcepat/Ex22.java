package com.java.oopsconcepat;

class employee {
	int eid ;
	String ename ;
	double esal;
	public employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	
}
class store {
	public static void main(String[] args) {
		employee s = new employee(1, "sunil", 20299.9);
		employee d = new employee(2, "sanvi",39383.3);
	
		employee [] e = new employee [4];
		e[0]= s ;
		e[1]= d;
		
		for ( employee u : e) {
			if (u==null) {
				System.out.println(u);
			}else {
				System.out.println(u.eid+" "+u.ename +" "+u.esal);
			}
		}
	}
}
