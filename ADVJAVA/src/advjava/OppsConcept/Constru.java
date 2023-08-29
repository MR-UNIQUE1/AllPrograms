package advjava.OppsConcept;

public class Constru {
	
	private int eid ;
	private String ename ;
	private double esal;
	public Constru(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public String toString() {
		return "Emplyee name is :-"+eid +"\nEmplyee name is :- "+ename+"\nEmployee sal is :-"+esal ;
	}
}
class Tfest {
	public static void main(String[] args) {
		Constru s = new Constru(111, "sunil", 1778373.88);
		System.out.println(s);
	}
}
