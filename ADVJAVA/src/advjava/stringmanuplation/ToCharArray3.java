package advjava.stringmanuplation;

public class ToCharArray3 {

	public static void main(String[] args) {
		int count =0;
		String s ="Sunisksdjautataia ";
		char [] j = s.toCharArray();
		for (char c : j) {
			if (c=='a') {
				count ++ ;
			}
		}
		System.out.println(count);
	}

}
