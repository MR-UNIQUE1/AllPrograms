package com.java.part2;

public class Example8 {
	
	int eid;
	String ename ;
	String elastname ;
	
	public Example8(int eid, String ename, String elastname) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.elastname = elastname;
	}
	public void sal() {
		if (eid>1999) {
			System.out.println(eid +" "+ ename +" "+ elastname);
		} else {
			System.out.println("Your eid is very low");
		}
	}
	public static void main(String[] args) {
		Example8 s = new Example8(134332, "Sunil", "parida");
		s.sal();

	}

	
}
