package corejava.exceptionhandling;

public class FinalBlock {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("sunil this is the catch block");
		}
		finally {
			System.out.println("sunil this is the final block");
		}

	}

}
