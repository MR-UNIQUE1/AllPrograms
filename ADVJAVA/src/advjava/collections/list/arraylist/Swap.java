package advjava.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
	public static void main(String[] args) {
		ArrayList<String > s = new ArrayList<String>();
		s.add("Sunil");
		s.add("Ranu");
		s.add("sanvi");
		s.add("Richal");
		
		System.out.println(s);
		System.out.println("This is the before swap ");
		
		Collections.swap(s, 0, 3);
		System.out.println(s);
		System.out.println("This is the after swap ");
	}
}
