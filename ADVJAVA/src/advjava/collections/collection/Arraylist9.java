package advjava.collections.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist9 {
	public static void m1(ArrayList<String> names)
	{	for (String name : names)
		{	System.out.println(name);
		}
	}
	public static void m2(List<String> names)
	{	for (String name : names)
		{	System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> arraylistobjs = new ArrayList<String>();
		arraylistobjs.add("ratan");
		arraylistobjs.add("anu");
		
		LinkedList<String> linkedlistobjs = new LinkedList<String>();
		linkedlistobjs.add("aaa");
		linkedlistobjs.add("bbb");
		
		Arraylist9.m1(arraylistobjs);			//	Valid 
		//Arraylist9.m1(linkedlistobjs);		//  Invalid 
		
		Arraylist9.m2(arraylistobjs);			//  Valid 
		Arraylist9.m2(linkedlistobjs);		//  Valid 
	}
}