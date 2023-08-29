package advjava.collections.collection;

import java.util.ArrayList;

public class Arraylist8 {

	public static void main(String[] args) {
		Emp e1 = new Emp(111,"ratan");
		Emp e2 = new Emp(222,"Sravya");
		Emp e3 = new Emp(333,"aruna");
		Emp e4 = new Emp(444,"anu"); 
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(e1);
		a1.add(e2);
		
		ArrayList<Emp> a2 = new ArrayList<Emp>(a1);
		a2.add(e3);
		a2.add(e4);
		
		System.out.println(a2.contains(e1));				
		System.out.println(a2.containsAll(a1));		
		
		a2.remove(e1);
		
		System.out.println(a2.contains(e1));		
		System.out.println(a2.containsAll(a1));	
	}

}
