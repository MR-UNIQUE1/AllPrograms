package com.java.collection.arraylist;

import java.util.ArrayList;

public class Arraylist1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		int[] a = {1,2,3,5,6,7,8,};
		for (int i : a) {
			System.out.println(i);
		}
		
		ArrayList s = new ArrayList();
		s.add(new Employee(11, "sunil", 15678.8));
		s.add(new Student(12, "Ranu", 88.5));
		System.out.println(s);
		
		for (Object o : s) {
			if (o instanceof Employee) {
				Employee w =(Employee) o;
				System.out.println(w.eid+" "+w.ename+" "+w.esal);
			}
			if (o instanceof Student) {
				Student t = (Student)o;
				System.out.println(t.sid +" "+t.sname+" "+t.smarks);
			}
		}
		
		ArrayList<Student > tt= new ArrayList<Student>();
		tt.add(new Student(111, "sunnu", 93.3));
		tt.add(new Student(222, "ranu", 98.4));
		for (Student stu : tt) {
			System.out.println(stu.sid + " "+ stu.sname +" "+ stu.smarks);
		}
		System.out.println("this is the get method ");
		Student re = tt.get(1);
		System.out.println(re.sid +" "+ re.sname +" "+ re.smarks);
		}

}
