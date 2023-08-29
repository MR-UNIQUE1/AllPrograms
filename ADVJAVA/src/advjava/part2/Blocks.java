package advjava.part2;

public class Blocks {
	public Blocks() {
		System.out.println("0- argument constructor ");
	}
	public Blocks(int a ) {
		System.out.println("1- arguments constructor ");
	}
	{
		System.out.println("instance blocks ");
	}
	static {
		System.out.println("Static blocks ");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Blocks s = new Blocks();
		Blocks d = new Blocks(5);
	}
}
