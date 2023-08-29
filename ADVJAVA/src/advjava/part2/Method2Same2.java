package advjava.part2;

public class Method2Same2 {
	int num1 =300,num2 = 700;
	void add (int num1 , int num2 ) {
		Method2Same2 s = new Method2Same2();
		System.out.println(s.num1+s.num2);
		System.out.println(this.num1+this.num2);
	}
	public static void main(String[] args) {
		Method2Same2 s = new Method2Same2();
		s.add(200, 200);
	}

}
