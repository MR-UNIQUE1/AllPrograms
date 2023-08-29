package advjava.OppsConcept;

public interface Bikes {
	public void petrol ();
	public void ev ();
}
class Honda implements Bikes {
	public void petrol () {
		System.out.println("Honda bikes are running in petrol ");
	}
	public void ev () {
		System.out.println("Honda bikes are not running in ev ");
	}
}
class Tesla implements Bikes{
	public void petrol () {
		System.out.println("Tesla bikes are running in both petrol and electric ");
	}
	public void ev () {
		System.out.println("Tesla bikes are always prefers to running in electric ");
	}
}
class testtt {
	public void go (Bikes h ) {
		h.petrol();
		h.ev();
	}
	public static void main(String[] args) {
		testtt s = new testtt();
		s.go(new Honda ());
		s.go(new Tesla ());
	}
}
