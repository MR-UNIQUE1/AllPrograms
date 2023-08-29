package advjava.part2;

public class Constructor3 {
	public Constructor3(){
		this(10.5,8);
		System.out.println("Banglore is very cool city");
	}
	public Constructor3(int a ) {
		
		System.out.println("Previously we are stay in hydrabad ");
	}
	public Constructor3(double d ,int r) {
		this(5);
		System.out.println("My netive place are odisha ");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Constructor3 s =new Constructor3();

	}

}
