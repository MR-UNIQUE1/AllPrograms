package corejava.stringmanuplation;

public class StringToByteArray {

	public static void main(String[] args) {
		String s = new String("ABCD") ;
		byte [] g = s.getBytes();
		for (byte b : g) {
			System.out.println(b);
		}
		
		
	}

}
