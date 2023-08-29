package advjava.collections.list.vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ReadDataToVector {
	public static void main(String[] args) {
		Vector<Product> p = new Vector<Product>();
		p.add(new Product(111, "biskit", 10.0));
		p.add(new Product(222, "mixture", 50.0));
		p.add(new Product(333, "myagi", 5.0));
		
		Iterator<Product> t = p.iterator();
		while (t.hasNext()) {
			Product r = t.next();
			if (r.pid==(111)) {
				t.remove();
			}
		}
		
		ListIterator<Product> y = p.listIterator();
		y.add(new Product(444, "milk", 23.00));
		while (y.hasNext()) {
		Product e =	y.next();
		if (e.pname.equals("mixture")) {
			y.remove();
		}
		}
		
		
		for (Product pro : p) {
			System.out.println(pro.pid+" "+pro.pname+" "+pro.pcost);
		}
	
	}
}
