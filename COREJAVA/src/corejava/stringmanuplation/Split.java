package corejava.stringmanuplation;

public class Split {

	public static void main(String[] args) {
		String sentence = "Sunil is a good boy ";
		String [] words = sentence.split(" ");
		for (String string : words) {
			System.out.println(string);
		}

	}

}
