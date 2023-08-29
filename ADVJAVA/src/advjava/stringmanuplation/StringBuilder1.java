package advjava.stringmanuplation;

public class StringBuilder1 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("ratan");
		StringBuilder sb2 = new StringBuilder("ratan");
		System.out.println(sb1==sb2);				
		System.out.println(sb1.equals(sb2));	
	}
}
