package advjava.collections.collection;

import java.util.ArrayList;

public class Arraylist1 {

		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static void main(String[] args) {
			
			ArrayList y = new ArrayList();
			y.add("Sunil");
			y.add("10");
			y.add(20);
			y.add(10.88);
			System.out.println(y);
			System.out.println("This is the array ......with normal version ");
			ArrayList<Object> s = new ArrayList<Object>();
			s.add(44);
			
			Object s1 = s.get(0);
			System.out.println(s1);
		}
	}

