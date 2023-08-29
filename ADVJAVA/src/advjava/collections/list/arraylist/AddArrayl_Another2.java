package advjava.collections.list.arraylist;

import java.util.ArrayList;

public class AddArrayl_Another2 {

	public static void main(String[] args) {
		 ArrayList<String > s = new ArrayList<String>();
		 s.add("Sunil");
		 s.add("ratan");
		 s.add("ranu");
		 System.out.println(s.size());
		 
		 ArrayList<String > t = new ArrayList<String >();
		 t.add("Richal");
		 t.add("Mansing");
		 System.out.println(t);
		 System.out.println(t.size());
		 
		 ArrayList< String > h = new ArrayList<String>();
		 h.addAll(s);
		 h.addAll(t);
		 //h.addAll(1, s);
		 System.out.println(h);
	}

}
