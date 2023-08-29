package advjava.collections.list.arraylist;

import java.util.ArrayList;

//We can use the genetic to the collection  

 public class Test3 {	
	 public static void main(String[] args) {
		ArrayList<Employee > e = new ArrayList<Employee>();
		e.add(new Employee(111, "sunil"));
		e.add(new Employee(111, "ranu"));
		ArrayList<Student > t = new ArrayList<Student>();
		t.add(new Student(123, "sanvi"));
		t.add(new Student(456, "richal"));
		
		for (Employee ee : e) {
			System.out.println(ee.ename+" "+ee.eid);
		}
		for (Student st : t) {
			System.out.println(st.sname +" "+st.sid);
		}
		
		Employee s= e.get(1);
		System.out.println(s.ename +" " +s.eid);
	}
 }