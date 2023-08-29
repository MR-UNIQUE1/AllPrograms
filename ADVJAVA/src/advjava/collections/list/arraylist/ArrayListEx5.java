package advjava.collections.list.arraylist;

import java.util.ArrayList;
public class ArrayListEx5 {
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> al = new ArrayList<Comparable>();
		al.add(10);
		al.add(10.5);
		al.add("durga");
		al.add("ratan");
		al.add(10);
		al.add(null);		
		System.out.println(al);		
		System.out.println(al.size());		//6
		
		al.add("Sunil");
		al.add(2,"ranu");
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(3);
		al.remove("ratan");
		System.out.println(al);
		
		al.set(2, "sanvi ");
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al);
	
	
	}
}