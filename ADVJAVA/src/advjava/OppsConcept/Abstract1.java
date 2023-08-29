package advjava.OppsConcept;

abstract class Abstract1 {
	
	abstract void add ();
	
	abstract void mul ();

}
 class Test extends Abstract1 {

	@Override
	void add() {
		System.out.println("sunil is a good boy ");
		
	}

	@Override
	void mul() {
		System.out.println("sunil is a bad boy ");
		
	}
	
}
 class TestClient extends Test {
	 public static void main(String[] args) {
		Abstract1 c = new TestClient();
		c.add();
		c.mul();
	}
 }
