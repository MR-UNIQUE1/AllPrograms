package advjava.stringmanuplation;

public class GetByte {

	public static void main(String[] args) {
		String s = "Sunil";
		byte [] b = s.getBytes();
		for (byte c : b) {
			System.out.println(c);
		}

	}

}
