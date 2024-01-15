package corejava.stringmanuplation;

public class Split6 {

	public static void main(String[] args) {
		String name = "sunil";
		char [] j = name.toCharArray();
		for (char c : j) {
			if (c=='s'||c=='u'||c=='n'||c=='i'||c=='l') {
				System.out.println(c);
			}
		}

	}

}
