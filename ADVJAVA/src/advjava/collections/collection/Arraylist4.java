package advjava.collections.collection;

import java.util.ArrayList;

public class Arraylist4 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("durga");
		al.add("ratan");
		al.add(10);
		al.add(null);		
		System.out.println(al);			 				
		System.out.println(al.size());	 
		
		al.add(3, "anu");					
		System.out.println(al);					
		
		al.remove(2);  						
		al.remove("ratan");					 
		System.out.println(al);   						
		
		al.set(1, "rani");						
		System.out.println(al); 
		
		System.out.println(al.isEmpty());	 
		al.clear();										
		System.out.println(al.isEmpty());
	}
}