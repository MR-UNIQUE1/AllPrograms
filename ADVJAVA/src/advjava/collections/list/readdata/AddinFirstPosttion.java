package advjava.collections.list.readdata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AddinFirstPosttion {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<String >l = new ArrayList<String>();
		l.add("ratan");
		l.add("Anu");
		l.add("sunil");
		
		ListIterator<String>r = l.listIterator();
		r.add("ranu");
		System.out.println(l);
		
		Iterator<String > j = l.iterator();
		l.add("sunil");
		System.out.println(l);
		
	}
}
