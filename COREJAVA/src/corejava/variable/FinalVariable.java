package corejava.variable;

public class FinalVariable {
	
	final int a = 10;
	static int b =20 ;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		final int c = 30;
		FinalVariable f = new FinalVariable();
		int d = f.a+b;
		System.out.println(d);

	}

}
