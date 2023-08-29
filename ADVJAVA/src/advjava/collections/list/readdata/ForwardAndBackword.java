package advjava.collections.list.readdata;

import java.util.ArrayList;
import java.util.ListIterator;

public class ForwardAndBackword {
	public static void main(String[] args) {
		ArrayList<String > t = new ArrayList<String>();
		t.add("sunil");
		t.add("ranu");
		t.add("sanvi");
		t.add("richal");
		
		ListIterator<String >g = t.listIterator();
		while (g.hasNext()) {
			String r = g.next();
			System.out.println(r);
		}
		while (g.hasPrevious()) {
			String e = g.previous();
			System.out.println(e);
		}
	}
}
