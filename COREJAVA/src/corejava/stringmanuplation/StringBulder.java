package corejava.stringmanuplation;

public class StringBulder {
	
	public static void main(String[] args) {
		StringBuilder h = new StringBuilder("Sunil");
		h.append("MR.");
		System.out.println(h);
		System.out.println(h.delete(5, 8));
		System.out.println(h.insert(0, "MR."));
		
	}

}
