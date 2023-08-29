package advjava.collections.list.vector;

import java.util.Vector;

public class FourThconstructor {
	public static void main(String[] args) {
		Vector<String >t = new Vector<String>();
		t.add("sunl");
		t.add("rau");
		Vector<String>k = new Vector<String>(t);
		k.add("rahul");
		System.out.println(t);
		System.out.println(k);
	}
}
