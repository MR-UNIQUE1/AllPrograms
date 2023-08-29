package advjava.wrapperclass;

public class PrimitiveToObject {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		//This is the deprecated method in java 
		Integer g = new Integer(100);
		Integer g1 = new Integer(200);
		System.out.println(g+g1);
		
		Integer s = Integer.valueOf(100);
		Integer s1 = Integer .valueOf(200);
		System.out.println(s+s1);
		
		Integer f = 10;
		Integer f1=20;
		System.out.println(f+f1);
		
	}

}
