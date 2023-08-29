package advjava.map.hasmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HasmapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> objs = new LinkedHashMap<Integer,String>();
		objs.put(111, "ratan");
		objs.put(22, "anu");
		objs.put(333, "naresh");
		objs.put(44, "sravya");
		System.out.println(objs);
		
		System.out.println("****printing All the keys*****");
		Set<Integer> keys = objs.keySet();
		System.out.println(keys);
		
		System.out.println("*****Printing All the values****");
		Collection<String> values = objs.values();
		System.out.println(values);
		
		System.out.println("*****Printing All the Entries****");
		for(Entry<Integer, String> entry : objs.entrySet())
		{	System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println("*****Printing All the Entries Using forEach() method****");
		objs.forEach((key,value)->System.out.println("Key="+key+" Value="+value));
	}
}