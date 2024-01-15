package com.java.cj.oopsencapsulation;

public class OppsEnEx1 {
	private int eid;
	private String ename;
	private double esal;
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	public void setEname(String ename) {
		this .ename=ename;
	}
	public void setEsal(double esal) {
		this .esal=esal;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public double getEsal() {
		return esal;
	}
}
class Testclient9{
	public static void main(String[] args) {
		OppsEnEx1 y =new OppsEnEx1();
		y.setEid(837484);
		System.out.println(y.getEid()+" "+y.getEname()+" "+y.getEsal());
		y.setEname("sunil parida");
		System.out.println();
		System.out.println(y.getEid()+" "+y.getEname()+" "+y.getEsal());
		y.setEsal(9374875.85);
		System.out.println(y.getEid()+" "+y.getEname()+" "+y.getEsal());
		y.setEname("Swagatika behera");
		System.out.println(y.getEid()+" "+y.getEname()+" "+y.getEsal());
	}
}
