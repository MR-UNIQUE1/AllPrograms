package advjava.stringmanuplation;

public class ToCharArray {

	public static void main(String[] args) {
		String  s= "Sunil is a good";
		char [] j = s.toCharArray();
		for (int i = 0; i < j.length; i++) {
			System.out.println(j[i]);
		}
	}

}
