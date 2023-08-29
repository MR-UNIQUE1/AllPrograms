package advjava.collections.list.arraylist;

import java.util.ArrayList;

public class CollectionToArray {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("ratan");
		a1.add("anu");
		a1.add("sravya");

		String[]s=new String[a1.size()];
		a1.toArray(s);
		for(String ss:s){
			System.out.println(ss);
		}
		
	}
}
