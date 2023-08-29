package advjava.interfac;

public interface Ex3 {
	void m1 ();
	void m4 ();
}
interface Ex4 {
	void m1 ();
	void m2 ();
}
interface Ex5 extends Ex3 , Ex4{
	void m4 ();
}
class Gest implements Ex5  {
	@Override
	public void m1() {
		System.out.println("This is the m1 override method");	
	}
	@Override
	public void m4() {
		System.out.println("This is the m4 override method ");
	}	
	public void m2 () {
		System.out.println("This is the m2 override method ");
	}
}
class rai {
	public static void main(String[] args) {
		Gest s = new Gest();
		s.m1();
		s.m2();
		s.m4();
	}
}
