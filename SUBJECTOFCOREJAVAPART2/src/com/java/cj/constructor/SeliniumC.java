package com.java.cj.constructor;

public class SeliniumC {
	int sno;
	String sname;
	static final String cname="Durgasoft";
	public SeliniumC(int sno, String sname) {
		this.sname=sname;
		this.sno= sno;
	}
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		SeliniumC s1 = new SeliniumC( 4747, "sunil ");
		SeliniumC s2 = new SeliniumC( 9339, "mahesh sir");
		System.out.println(s1.sname);
		System.out.println(s1.sno);
		System.out.println(s1.cname);
		System.out.println(s2.sname);
		System.out.println(s2.sno);
		System.out.println(s2.cname);
		

	}

}
