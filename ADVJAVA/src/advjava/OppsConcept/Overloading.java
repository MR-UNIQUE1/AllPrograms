package advjava.OppsConcept;

class Testt {
	void Test1 (int a) {
		System.out.println("Parent class 1- args constructor ");
	}
	void Test2 (int a, String d) {
		System.out.println("Parent class 2-args constructor ");
	}
}

public class Overloading extends Testt {
	void Test1 (int a ,int b) {
		System.out.println("This is 1- args Constructor ");
	}
	void Test2(int a , char d) {
		System.out.println("This is 2- args Constructor ");
	}
	public static void main(String[] args) {
		Overloading s = new Overloading();
		s.Test1(2,4);
		s.Test2(4, 't');
	}
}

