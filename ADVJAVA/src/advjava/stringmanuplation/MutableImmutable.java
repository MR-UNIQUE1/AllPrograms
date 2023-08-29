package advjava.stringmanuplation;

public class MutableImmutable {
	public static void main(String[] args) {
		String str = "ratan";
		String s =str.concat("Soft");
		System.out.println(s);
		
		StringBuffer g = new StringBuffer("sunil");
		g.append("parida");
		System.out.println(g);
	}
}
