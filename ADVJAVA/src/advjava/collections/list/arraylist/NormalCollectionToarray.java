package advjava.collections.list.arraylist;

import java.util.ArrayList;

public class NormalCollectionToarray {
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		ArrayList data = new ArrayList ();
		data.add(10);
		data.add("ratan");
		data.add(10.5);
		Object b =data.toArray();
		for (Object object : data) {
			System.out.println(object);
		}
		
	}
}
