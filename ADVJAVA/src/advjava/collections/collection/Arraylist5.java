package advjava.collections.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist5 {

	public static void main(String[] args) {
		ArrayList<String > h =new ArrayList<String>(Collections.nCopies(20, "Ratan"));
		System.out.println(h);
	}

}
