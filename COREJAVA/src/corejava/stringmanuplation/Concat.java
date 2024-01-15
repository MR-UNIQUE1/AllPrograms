package corejava.stringmanuplation;

public class Concat {

	public static void main(String[] args) {
		String a1 = "sunil";
		String a2 = "mama";
		String a3 = "golu";
		
		System.out.println(a1.concat(a2).concat(a3));
		System.out.println(a1+a2+a3);
		
		StringBuffer s = new StringBuffer("ranu");
		s.append("moti");
		System.out.println(s);
		
		String y = "rama";
		String g = y.concat("haari");
		System.out.println(g);
		
		System.out.println(y);
		System.out.println(y.toString());

	}

}
