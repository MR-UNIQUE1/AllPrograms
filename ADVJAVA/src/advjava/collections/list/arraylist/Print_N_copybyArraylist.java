package advjava.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Print_N_copybyArraylist {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>(Collections.nCopies(10, "ratan"));
		System.out.println(s);
		
		 
	}
}
