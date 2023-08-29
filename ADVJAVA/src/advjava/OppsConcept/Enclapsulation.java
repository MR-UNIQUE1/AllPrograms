package advjava.OppsConcept;
public class Enclapsulation {	
	private int eId;
	private String eName;
	private int eSal;
	public void seteid (int eId) {
		this.eId= eId;
	}
	public void setename(String eName) {
		this.eName= eName;
	}
	public void setesal (int eSal) {
		this.eSal= eSal;
	}
	public int geteid() {
		return eId;
	}
	public String getename () {
		return eName;
	}
	public int getesal () {
		return eSal;
	}
}
class TestCliets {
	public static void main(String[] args) {
		Enclapsulation s = new Enclapsulation();
		s.seteid(111);
		s.setename("sunil");
		s.setesal(83837333);
		
		System.out.println("The id = "+s.geteid());
		System.out.println("The name is = "+s.getename());
		System.out.println("The salary is ="+s.getesal());
		
	}
}


















