package corejava.stringmanuplation;

public class Duplicates {

	public static void main(String[] args) {
		String a = "sunil is a good boy and sunil is a bad boy sunl mdldsjj sunil";
		String [] s = a.split(" ");
		for (String strings : s) {
			if (strings.equalsIgnoreCase("sunil")) {
				continue;
			}
			System.out.print(strings+" ");
		}

	}

}
