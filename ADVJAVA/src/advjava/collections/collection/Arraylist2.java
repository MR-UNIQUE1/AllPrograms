package advjava.collections.collection;

import java.util.ArrayList;

public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp(111, "Ratan"));
		emps.add(new Emp(222, "Ganesh"));
		emps.add(new Emp(333, "Anu"));
		for(Emp emp : emps)
		{	System.out.println(emp.empId+" "+emp.empName);
		}
		
		System.out.println("****Printing the Collection Generic version : get() method***");
		Emp emp = emps.get(2);
		System.out.println(emp.empId+" "+emp.empName);
	}

}
