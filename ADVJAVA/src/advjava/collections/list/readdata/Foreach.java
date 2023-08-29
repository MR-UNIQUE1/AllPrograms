package advjava.collections.list.readdata;

import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args) {
		ArrayList<String > s = new ArrayList<String >();
		s.add("Sunil ");
		s.add("ranu");
		s.add("richal");
		s.add("mansign");
		System.out.println(s);
		// using foreach loop we can read the data from collection
		for (String se : s) {
			System.out.println(se);
		}
	}

}
