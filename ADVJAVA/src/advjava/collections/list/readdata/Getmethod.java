package advjava.collections.list.readdata;

import java.util.ArrayList;

public class Getmethod {
	public static void main(String[] args) {
		ArrayList<String > s = new ArrayList<String >();
		s.add("Sunil ");
		s.add("ranu");
		s.add("richal");
		s.add("mansign");
		
		String  h=s.get(0);
		String h1 =s.get(1);
		String h2 =s.get(2);
		String h3=s.get(3);
		System.out.println(h);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		}
}
