package advjava.collections.list.vector;

import java.util.Vector;

public class FirstConstructor {
	public static void main(String[] args) {
		Vector<String > t = new Vector<String>();
		t.add("sunil");
		t.add("ranu");
		t.add("richal");
		System.out.println(t.capacity());
		System.out.println(t);
	}
}
