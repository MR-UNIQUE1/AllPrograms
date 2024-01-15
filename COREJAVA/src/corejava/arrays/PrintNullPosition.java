package corejava.arrays;

public class PrintNullPosition {

	public static void main(String[] args) {
		String [] s = new String [10];
		s[0]= "ratan";
		s[5]= "mama";
		s[7]= "sanvi";
		for (int i = 0; i < s.length; i++) {
			if (s[i]==null) {
				System.out.println(i);
			}
		}
		

	}

}
