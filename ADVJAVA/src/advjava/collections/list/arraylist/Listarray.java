package advjava.collections.list.arraylist;

import java.util.List;

public class Listarray {
	public static void main(String[] args) {
		List<String > k = List.of("sunil","Ranu","roni","rockey");
		System.out.println(k);
		
		Student s = new Student(333, "raju");
		Student s1 = new Student(444, "deba");
		Student s2  = new Student(555, "haria");
		
		List<Student> g = List.of(s,s1,s2);
		for (Student student : g) {
			System.out.println(student.sname+" "+student.sid);
		}
		
		List<Student> g1 = List.of(new Student(333, "raju"),new Student(444, "deba"),new Student(555, "haria"));
		Student sr = g1.get(1);
		System.out.println(sr.sname+"  "+ sr.sid);
		
	}
}
