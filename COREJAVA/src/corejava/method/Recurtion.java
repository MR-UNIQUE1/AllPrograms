package corejava.method;

public class Recurtion {
	static void sunil (int num) {
		if (num>0) {
			System.out.println("your number is ....."+num );
			sunil(--num);
		} else {
			System.out.println("your number is negetive ");
		}
	}
	public static void main(String[] args) {
		sunil(5000);
	}
}