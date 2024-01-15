package corejava.stringmanuplation;

public class ToCharArray {

	public static void main(String[] args) {
		int count =0;
		String name = "sunilllll";
		char [] chars = name.toCharArray();
		for (char c : chars) {
			if (c=='l') {
				count++;
			}	
		}
		System.out.println(count);
	}

}
