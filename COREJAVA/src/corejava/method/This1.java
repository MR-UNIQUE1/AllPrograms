package corejava.method;

public class This1 {
	int a = 20;
	int b = 20;
	
	int sum (int a ,int b) {
		System.out.println(this.a+this.b);
		return 10;
	}

	public static void main(String[] args) {
		This1 s = new This1();
		s.sum(30, 30);

	}

}
