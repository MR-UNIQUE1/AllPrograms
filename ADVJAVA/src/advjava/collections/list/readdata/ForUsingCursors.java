package advjava.collections.list.readdata;

import java.util.ArrayList;
import java.util.Iterator;

public class ForUsingCursors {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<String > s = new ArrayList<String >();
		s.add("Sunil ");
		s.add("ranu");
		s.add("richal");
		s.add("mansign");
		
		// i am using generic version of the iterator
		Iterator r = s.iterator();
		
		while (r.hasNext()) {
			String e =(String) r.next();
			System.out.println(e);
		}
		
		//Generic type of the iterator
		Iterator<String> t = s.iterator();
		while (t.hasNext()) {
			 String w =t.next();
			 System.out.println(w);
		}
	}

}
