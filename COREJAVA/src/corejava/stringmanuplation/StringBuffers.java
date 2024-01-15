package corejava.stringmanuplation;

public class StringBuffers {

	public static void main(String[] args) {
		String s = "sunil";
		StringBuffer b = new StringBuffer(s);
		System.out.println(b.reverse());
		System.out.println(b.deleteCharAt(3));

		StringBuffer g = new StringBuffer("Sunil is a good boy");
		System.out.println(g.reverse());
		System.out.println(g.append("and he is good in java"));
		
		StringBuffer m= new  StringBuffer("sulll");
		System.out.println(m.replace(0, 5, "sunil"));
		
		System.out.println(m.insert(0, "Thank you ,"));
	}

}
