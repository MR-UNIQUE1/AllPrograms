package advjava.aggregation;

public class Student {
	int sid ;
	String sname ;
	String SchoolName ;
	Parent ppr ;
	Marks mrk ;
	Address s ;
	public Student(int sid, String sname, String schoolName, Parent ppr, Marks mrk, Address s) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.SchoolName = schoolName;
		this.ppr = ppr;
		this.mrk = mrk;
		this.s = s;
	}
	void Status () {
		
		int total = mrk.m1+mrk.m2+mrk.m3;
		if (total >200) {
			System.out.println("Hii "+sname +" you are pass");
			System.out.println("yours parents name is "+ppr.mname+""+ppr.fname);
			System.out.println("your marks is  "+mrk.m1 +" "+mrk.m2+" "+mrk.m3);
			System.out.println("Total mark is "+ total+" out of 300");
			System.out.println("Your id is "+ sid);
			System.out.println("your school is "+ SchoolName);
			System.out.println("Your adress is "+s.dno +" "+s.street+" "+s.pincode+" "+s.state+" "+s.country);
			
		}
		else {
			System.out.println("Hii "+sname +" you are fail");
			System.out.println("yours parents name is "+ppr.mname+""+ppr.fname);
			System.out.println("your marks is  "+mrk.m1 +" "+mrk.m2+" "+mrk.m3);
			System.out.println("Total mark is "+ total+" out of 300");
			System.out.println("Your id is "+ sid);
			System.out.println("your school is "+ SchoolName);
			System.out.println("Your adress is "+s.dno +" "+s.street+" "+s.pincode+" "+s.state+" "+s.country);
			
		}
	}
	public static void main(String[] args) {
		Student s = new Student(11, "Sunil", "BHS", new Parent("Rabindra parida ", "Sabita parida"), new Marks(78, 88, 79), new Address(1231, 752106, "Andhoti", "Odisha", "India"));
		s.Status();
	}
	
}
