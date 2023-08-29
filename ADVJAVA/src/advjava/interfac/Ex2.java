package advjava.interfac;

public interface Ex2 {
	void add (int num1 ,int num2 );
	void mul (int num1 ,int num2 );
}
abstract class dev1 implements Ex2 {
	public void add (int num1 , int num2) {
		System.out.println(num1 +num2 );
	}
}
class Dev2 extends dev1 {
	public void mul (int num1 , int num2) {
		System.out.println(num1 +num2);
	}
}
class Clident {
	public static void main(String[] args) {
		Dev2 s = new Dev2();
		s.add(3, 6);
		s.mul(6, 46);
	}
}
