package advjava.part2;

public class Constructor4 {
	int eid;
	String ename;
	double esal;
	public static final String company ="TATA";
	public static final String location = "Banglore";

	public Constructor4(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		
	}
	public void wish () {
		if (esal>15000) {
			System.out.println("Hii "+ename);
			System.out.println("you are very good emplyee");
			System.out.println("your eid -: "+eid + "your salary :- "+esal+"and your company :-"+ company);
		}
		else {
			System.out.println("Hii "+ename);
			System.out.println("you are good emplyee");
			System.out.println("your eid -: "+eid + "your salary :- "+esal+"and your company is :-"+ company);
		}
	}
	public static void main(String[] args) {
		Constructor4 s = new Constructor4(1111, "Sunil", 30999);
		s.wish();

	}

}
