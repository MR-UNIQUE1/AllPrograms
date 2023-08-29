package advjava.OppsConcept;

abstract class AbstractConstructor {
	public AbstractConstructor() {
		System.out.println("Abstract class constructor ");
	}
}
class Tests extends AbstractConstructor {
	public Tests() {
		super();
		System.out.println("We call the above abstract class constructor ");
	}
}
class TestClitnt extends Tests {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 Tests s = new Tests();
	}
}