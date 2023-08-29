package advjava.interfac;

public interface tueyinn {
	static void pass () {
		System.out.println("This the static method ");
	}
	
  public static void main(String[] args) {
	System.out.println("sunil is a good boy");
}
}
class TestCllient implements tueyinn {
	public void pass () {
		System.out.println("This is the TestClient Static method ");
	}
	public static void main(String[] args) {
		TestCllient s = new TestCllient();
		s.pass();
	}
}
