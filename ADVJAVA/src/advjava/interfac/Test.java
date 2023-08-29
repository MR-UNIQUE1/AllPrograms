package advjava.interfac;

public class Test implements Cloneable {
	int a = 30 ;
	int b = 49 ;
	 public static void main(String[] args) throws Exception {
		Test t = new Test();
		System.out.println(t.a+" "+t.b);
		
		Test g =(Test)t.clone();
		System.err.println(g.a+" "+g.b);
		
		Test r = (Test)t.clone();
		System.out.println(r.a+ " "+r.b);
	}
}
