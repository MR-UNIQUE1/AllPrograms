package corejava.arrays;

public class Student2 {
	public static void main(String[] args) {
		Student [] s = new Student[5];
		s[0]=new Student(11, "sunil", 89.44);
		s[1]= new Student(22, "mama", 98.44);
		
		for (Student r : s) {
			if (r==null) {
				System.out.println(r);
			} else {
				System.out.println(r.sid+" "+r.sname+" "+r.marks);

			}
		}
	}

}
