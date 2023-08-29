package advjava.part2;

public class Constructor {
	
	public void wish () {
		System.out.println("Sunil is a good boy ");
	}
//In this program if we not declaring any constructor, then compiler will generate the default constructor .
	public static void main(String[] args) {
		Constructor s = new Constructor();
		s.wish();

	}

}
