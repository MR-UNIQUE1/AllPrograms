package advjava.collections.list.treeset;

import java.util.TreeSet;

public class Constructor3 {
	public static void main(String[] args) {
		TreeSet<String>l = new TreeSet<String>();
		l.add("sunil");
		l.add("ranu");
		TreeSet<String > h = new TreeSet<String>(l);
		h.add("sanvi");
		h.add("richal");
		System.out.println(h);
	}
}
