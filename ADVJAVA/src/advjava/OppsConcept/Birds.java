package advjava.OppsConcept;

public interface Birds {
	void fly();
	void swim();
}
class parrot implements Birds{
	public void fly () {
		System.out.println("parrot can fly ");
	}
	public void swim () {
		System.out.println("parrot can't swim ");
	}
}
class penguine implements Birds {
	public void fly () {
		System.out.println("penguine can't fly ");
	}
	public void swim () {
		System.out.println("penguine can swim ");
	}
}
class TestClien {
	void choose (Birds d ) {
		d.fly();
		d.swim();
	}
	public static void main(String[] args) {
		TestClien u = new  TestClien();
		u.choose(new parrot());
		u.choose(new penguine ());
	}
}
