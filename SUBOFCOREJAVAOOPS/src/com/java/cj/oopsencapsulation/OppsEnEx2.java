package com.java.cj.oopsencapsulation;

public class OppsEnEx2 {
	private int eid;
	private String ename;
	private double esal;
	public OppsEnEx2(int eid ,String ename, double esal) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	public String toString() {
		return "Emp id...."+eid+"Emp name...."+ename+"Emp salary...."+esal;
	}
	
}
class TestClient7{
	public static void main(String[] args) {
		OppsEnEx2 r = new OppsEnEx2(839892, "sunil parida", 86768878.9776);
		System.out.println(r);
	}
}
