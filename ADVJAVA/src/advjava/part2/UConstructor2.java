package advjava.part2;

public class UConstructor2 {
	
	public UConstructor2() {
		System.out.println("Sunil is a good boy ");
	}
	public UConstructor2(int a ) {
		System.out.println("Sunil is a bad boy");
	}
	public UConstructor2(int a ,int b) {
		System.out.println("Focous on your study");
	}
	public static void main(String[] args) {
		UConstructor2 s = new UConstructor2();
		UConstructor2 u = new UConstructor2(4);
		UConstructor2 y = new UConstructor2(4,3);
		System.out.println(s.toString());
		System.out.println(u.hashCode());
		System.out.println(y.hashCode());
	}

}
