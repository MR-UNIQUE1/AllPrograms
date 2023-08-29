package advjava.collections.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist7 {

	public static void main(String[] args) {
		String [] s = {"sunil","ranu","sanvi"};
		ArrayList<String>l = new ArrayList<String>(Arrays.asList(s));
		System.out.println(l);
		l.add("richal");
		System.out.println(l);
		
		System.out.println("*******************");
		
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("ratan");
		a1.add("anu");
		a1.add("sravya");
		String [] u = new String[a1.size()];
		a1.toArray(u);
		for (String string : u) {
			System.out.println(string);
		}
	}

}
