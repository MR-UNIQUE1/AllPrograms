package wrapperclass;

public class WrapperO_Primitive {

	public static void main(String[] args) {
		Integer i = 1000;
		int s = i.intValue();
		System.out.println(s);
		
		Integer g = 4000;
		Integer h = 3000;
		String s1 = g.toString();
		String s2 = h.toString();
		System.out.println(g+h);
		System.out.println(s1+s2);
		System.out.println(g.toString());
		System.out.println(s1);
		
		Integer r = 3000;
		int d = r.intValue();
		System.out.println(d);

	}

}
