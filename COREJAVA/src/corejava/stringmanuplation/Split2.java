package corejava.stringmanuplation;

public class Split2 {

	public static void main(String[] args) {
		String s = "My,name,is,sunil,parida";
		String [] words = s.split(",");
		for (String string : words) {
			System.out.println(string);
		}

	}

}
