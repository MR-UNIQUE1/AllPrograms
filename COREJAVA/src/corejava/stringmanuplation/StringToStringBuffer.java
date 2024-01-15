package corejava.stringmanuplation;

public class StringToStringBuffer {

	public static void main(String[] args) {
		String s = "sunil";
		String d = "sunil";
		StringBuffer a = new StringBuffer(s);
		StringBuffer g = new StringBuffer(d);
		System.out.println(a.equals(g));
		
		System.out.println(s.equals(d));

	}

}
