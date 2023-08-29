package advjava.wrapperclass;

public class StringToPrimitive {

	public static void main(String[] args) {
		String s = "1000";
		int f = Integer.parseInt(s);
		double f1 = Double.parseDouble(s);
		System.out.println(f+f1);
	}

}
