package advjava.part2;

public class PassintArguments {
	int a = 39;
	int b = 33;
	public void add () {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		PassintArguments s = new PassintArguments();
		s.add();
	}

}
