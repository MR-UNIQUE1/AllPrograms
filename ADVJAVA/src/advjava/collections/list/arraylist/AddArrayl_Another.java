package advjava.collections.list.arraylist;

import java.util.ArrayList;

public class AddArrayl_Another {

	public static void main(String[] args) {
		 ArrayList<String > s = new ArrayList<String>();
		 s.add("Sunil");
		 s.add("ratan");
		 s.add("ranu");
		 System.out.println(s.size());
		 
		 ArrayList<String > t = new ArrayList<String >(s);
		 t.add("Richal");
		 t.add("Mansing");
		 System.out.println(t);
		 System.out.println(t.size());
		 
	}

}
