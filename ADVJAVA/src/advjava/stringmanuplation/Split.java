package advjava.stringmanuplation;

public class Split {

	public static void main(String[] args) {
		String s = "banglore is a very cool city ";
		String [] d = s.split(" ");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}

}
