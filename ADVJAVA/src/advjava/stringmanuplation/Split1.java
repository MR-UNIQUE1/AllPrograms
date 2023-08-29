package advjava.stringmanuplation;

public class Split1 {

	public static void main(String[] args) {
		String s = "banglore is very good city ";
		String[] g = s.split(" ",3);
		for (String t : g) {
			System.out.println(t);
		}
	}

}
