package advjava.collections.list.hassetandlinkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hassets {

	public static void main(String[] args) {
		HashSet<String > k = new HashSet<String>();
		k.add("sunil");
		k.add("ranu");
		k.add("richal");
		k.add("sanvi");
		k.add("sunil");
		k.add("ranu");
		System.out.println(k);
		LinkedHashSet<String> i = new LinkedHashSet<String>();
		i.add("sunil");
		i.add("ranu");
		i.add("richal");
		i.add("sanvi");
		i.add("sunil");
		i.add("ranu");
		System.out.println(i);
	}

}
