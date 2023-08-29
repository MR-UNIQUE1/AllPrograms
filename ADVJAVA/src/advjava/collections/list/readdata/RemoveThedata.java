package advjava.collections.list.readdata;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveThedata {
	public static void main(String[] args) {
		ArrayList<String>l = new  ArrayList<String>();
		l.add("sunil");
		l.add("ranu");
		l.add("richal");
		l.add("sanvi");
		
		Iterator<String> t =l.iterator();
		while (t.hasNext()) {
			String r =t.next();
			if (r.equals("ranu")) {
				t.remove();
			
			}
		}
		System.out.println(l);
	}
}
