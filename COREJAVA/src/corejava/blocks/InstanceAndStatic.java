package corejava.blocks;

public class InstanceAndStatic {
	
	{
		System.out.println("my name is instance block ");
	}
	static {
		System.out.println("my name is static block");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InstanceAndStatic g = new InstanceAndStatic();

	}

}
