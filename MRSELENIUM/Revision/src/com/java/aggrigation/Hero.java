package com.java.aggrigation;

public class Hero{
	public String name ;
	public int age;
	public double height ;
	public Addr adress;
	public Movies movi;
	public Hero(String name, int age, double height, Addr adress, Movies movi) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.adress = adress;
		this.movi = movi;
	}
	public void info() {
		System.out.println("Hero name is "+ name);
		System.out.println("Hero age is "+ age);
		System.out.println("hero height "+height);
		System.out.println("Hero adress is "+adress.hno + ","+ adress.StreetName+","+adress.city+","+adress.state);
		System.out.println("Hero's films are in bollywood"+ movi.bolly+"\nHero's films in hollywood is "+movi.holly);
	}
	public static void main(String[] args) {
		Addr a = new Addr(111, "29th street", "Banglore", "karnataka");
		Movies mm = new Movies("Sunil", 55, 96);
		Hero h = new  Hero("Sunil", 21, 6.0, a, mm);
		h.info();
	}
}
