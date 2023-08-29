package advjava.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToCollection {
	public static void main(String[] args) {
		String [] r = {"Sunil", "richal","sohel"};
		ArrayList<String>s = new ArrayList<String>(Arrays.asList(r));
		s.add("rahul");
		s.add("Sri ram");
		System.out.println(s);
	}
}
