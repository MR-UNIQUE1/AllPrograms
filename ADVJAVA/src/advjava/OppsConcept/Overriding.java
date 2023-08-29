package advjava.OppsConcept;

class Te2st {
	void Go (int a ) {
		System.out.println("Go with trains With vishakha ");
	}
	void Go1(String go ) {
		System.out.println("Go with planes with AirIndia");
	}
}

public class Overriding extends Te2st{
	void Go (int a ) {
		System.out.println("Go with trains with konark express");
	}
	public static void main(String[] args) {
		Overriding s = new  Overriding();
		s.Go(4);
		s.Go1("sunil");
	}
}
