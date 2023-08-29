package advjava.part2;

public class HoldValue {
		public static int wish () {
			System.out.println("We can hold and print the value ");
			return 10;
		}
	public static void main(String[] args) {
		int s = HoldValue.wish();
		System.out.println(s);
	}

}
