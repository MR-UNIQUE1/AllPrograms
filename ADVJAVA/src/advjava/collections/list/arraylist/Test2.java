package advjava.collections.list.arraylist;

import java.util.ArrayList;

public class Test2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList obs = new ArrayList();
		obs.add(new Employee(111, "Sunil"));
		obs.add(new Student(222, "Ranu"));
		obs.add(null);
		//System.out.println(obs);
		
		for (Object ob : obs) {
			if (ob instanceof Employee) {
				Employee e = (Employee)ob;
				System.out.println(e.eid+ " "+ e.ename);
			}
			if (ob instanceof Student) {
				Student s = (Student)ob;
				System.out.println(s.sid+" "+s.sname);
			}
			if (ob == null) {
				System.out.println(ob);
			}
			
		}
		System.out.println("********************");
		
		Employee e = (Employee)obs.get(0);
		System.out.println(e.ename+" "+e.eid);
		
	}
}
