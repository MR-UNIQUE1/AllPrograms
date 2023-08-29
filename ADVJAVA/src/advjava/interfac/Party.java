package advjava.interfac;

public interface Party {
	void eat ();
	default void Common () {
		System.out.println("Rice , dal , mix , salat ");
	}
	static void wish () {
		System.out.println("Hello Gyes welcome to the party ");
	}
}
class Veg implements Party {
	public void eat () {
		System.out.println("Dal , Sahi paneer ,Masrum ");
	}
}
class Non_veg implements Party {
	public void eat() {
		System.out.println("Chiken , fish , matton ");
	}
}
class TestClirnt {
	void ff (Party t ) {
		t.Common();
		t.eat();
	}
	public static void main(String[] args) {
		Party.wish();
		TestClirnt s = new TestClirnt();
		s.ff(new Non_veg());
		s.ff(new Veg());
	}
}