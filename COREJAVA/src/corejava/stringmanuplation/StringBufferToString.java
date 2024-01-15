package corejava.stringmanuplation;

public class StringBufferToString {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("sunil");
		StringBuffer g = new StringBuffer("sunil");
		String s = a.toString();
		String d = g.toString();
		System.out.println(s.equals(d));
		
		System.out.println(a.equals(g));
	}

}
