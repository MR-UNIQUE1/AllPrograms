package advjava.part2;


public class Recurtion {
	public static void validate (int a ) {
		if (a>0) {
			System.out.println("The number is :---"+  a);
			validate(--a);
		}
		else {
			System.out.println("The number is negetive ");
		}
	}
	public static void main(String[] args) {
		Recurtion.validate(3);
	}
}
