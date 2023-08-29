package advjava.part2;

public class MultipleMethod {
	void add () {
		MultipleMethod.mul();
		System.out.println("my name is sunil parida ");
	}
	static void mul () {
		MultipleMethod.div();
		System.out.println("what is your name ");
	}
	static void div () {
		System.out.println("how many numbers are there ");
	}

	public static void main(String[] args) {
		MultipleMethod s = new MultipleMethod();
		s.add();

	}

}
