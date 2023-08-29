package advjava.part2;

public class Variable2 {
	int a = 10;
	static int b = 30;
	public static void main(String[] args) {
		int c = 40;
		Variable2 s = new Variable2() ;
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(Variable2.b);
		System.out.println(s.a);
	}
	
}
