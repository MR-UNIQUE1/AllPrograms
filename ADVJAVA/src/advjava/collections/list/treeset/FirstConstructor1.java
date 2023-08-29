package advjava.collections.list.treeset;

import java.util.TreeSet;

public class FirstConstructor1 {

	public static void main(String[] args) {
		TreeSet<String >k = new TreeSet<String >();
		k.add("sunil");
		k.add("ranu");
		k.add("richal");
		k.add("sanvi");
		k.add("sunil");
		k.add("ranu");
		System.out.println(k);
		
		TreeSet<String >k1 = new TreeSet<String >((s1,s2 )-> -s1.compareTo(s2));
		k1.add("sunil");
		k1.add("ranu");
		k1.add("richal");
		k1.add("sanvi");
		k1.add("sunil");
		k1.add("ranu");
		System.out.println(k1);
	}

}
