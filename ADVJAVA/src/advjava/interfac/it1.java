package advjava.interfac;

public interface it1 {
	void m1 ();
	interface it2 {
		void m2 ();
	}
}
class Testti implements it1, it1.it2{
	public void m1 () {
		System.out.println("This is the m1 method ");
	}
	public void m2 () {
		System.out.println("This is the m2 method ");
	}
}
abstract class ram  {
	abstract void m1 ();
	interface ram1 {
		abstract void m2 ();
	}
}
class Tesss extends ram implements ram. ram1 {
	public void m1() {
		System.out.println("This is the abstract class method ");
	}
	public void m2 () {
		System.out.println("This is the interface ram1 method ");
	}
}

class itt1 {
	interface r1 {
		void rr ();
	}
}
class G implements itt1.r1{
	public void rr () {
		System.out.println("This is the interface method ");
	}
}


























