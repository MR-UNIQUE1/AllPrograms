package advjava.part2;

public class Blocks2 {
	public Blocks2() {
		this(8);
		System.out.println("o-args constructor ");
	}
	public Blocks2(int a ) {
	System.out.println("1 argument constructor ");
	}
	{
		System.out.println("This is the instance blocks ");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Blocks2 s= new Blocks2();
	}
}
