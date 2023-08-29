package advjava.collections.list.vector;

import java.util.Vector;

public class ThirdConstructor {
	public static void main(String[] args) {
		Vector<String >t = new Vector<String>(4,10);
		t.add("sunil");
		t.add("ranu");
		t.add("richal");
		t.add("mansigh");
		t.add("tubul");
		t.add("sunil");
		System.out.println(t.capacity());
	}
}
