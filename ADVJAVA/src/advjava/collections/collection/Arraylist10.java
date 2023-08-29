package advjava.collections.collection;

import java.util.List;

public class Arraylist10 {

	
	public static void main(String[] args) {
		List<String> names = List.of("ratan","anu","durga","sravya");
		System.out.println(names);
		
		System.out.println("******");
		
		List<String> empty = List.of();
		System.out.println(empty);
		
		System.out.println("******");
		
		Student s1 = new Student(111, "ratan");
		Student s2 = new Student(222, "anu");
		Student s3 = new Student(333, "sravya");
		List<Student> students = List.of(s1, s2, s3);
		for (Student s : students) {
			System.out.println(s.rollNo + " " + s.studentName);
		}
		
		System.out.println("******");
		
		List<Emp> emps = List.of(new Emp(111, "ratan"),new Emp(222, "anu"));
		Emp emp =  emps.get(0);
		System.out.println(emp.empId+" "+emp.empName);	
	}
	
}