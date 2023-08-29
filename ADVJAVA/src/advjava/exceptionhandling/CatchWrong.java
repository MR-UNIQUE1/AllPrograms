package advjava.exceptionhandling;

public class CatchWrong {
	public static void main(String[] args) {
		try {
			System.out.println("My name is sunil");
		} catch (NullPointerException e) {

			System.out.println(10/0);
		}
		System.out.println("rest of the application");
	}
}
