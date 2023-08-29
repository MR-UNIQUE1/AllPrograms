package advjava.OppsConcept;

public interface Message {
	void wish ();
}
class Ratan implements Message{
	public void wish  () {
		System.out.println("Hii ratan sir good morning ");
	}
	public void disp () {
		System.out.println("This is the direct method of ratan ");
	}
}
class Testte {
	public static void main(String[] args) {
		Message s = new Ratan();
		s.wish();
		
		Ratan g = (Ratan)s;
		g.disp();
	}
}
