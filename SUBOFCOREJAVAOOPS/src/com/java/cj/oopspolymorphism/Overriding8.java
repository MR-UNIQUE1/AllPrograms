package com.java.cj.oopspolymorphism;

interface Team{
	void online();
	void ofline();
}
class poor implements Team{
	public void online() {
		System.out.println("poor can't pay online ");
	}
	public void ofline () {
		System.out.println("poor can pay ofline");
	}
}
class Rich implements Team{
	public void online() {
		System.out.println("rich can pay online ");
	}
	public void ofline () {
		System.out.println("rich can't pay ofline some time pay in ofline");
	}
}
class testlient {
	void info(Team u ) {
		u.ofline();
		u.online();
	}
	public static void main(String[] args) {
		testlient  r = new testlient() ;
		r.info(new Rich());
	}
}