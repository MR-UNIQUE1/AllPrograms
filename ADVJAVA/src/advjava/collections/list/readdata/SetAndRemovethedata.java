package advjava.collections.list.readdata;

import java.util.ArrayList;
import java.util.ListIterator;

public class SetAndRemovethedata {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("sunil");
		s.add("ranu");
		s.add("sanvi");
		
		ListIterator<String>t = s.listIterator();
		t.add("richal");
		
		while (t.hasNext()) {
			String r = t.next();
			if (r.equals("sunil")) {
				t.set("tarun");
			}
			if (r.equals("ranu")) {
				t.remove();
			}
		}
		System.out.println(s);
	}
}
