package advjava.collections.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist6 {

	public static void main(String[] args) {
		ArrayList<String > a1= new ArrayList<String>();
		a1.add("ratan");
		a1.add("anu");
		a1.add("durga");
		a1.add("sravya");
		System.out.println("before swap"+a1);
		Collections.swap(a1, 1, 3);
		System.out.println("After swap"+a1);
	}

}
