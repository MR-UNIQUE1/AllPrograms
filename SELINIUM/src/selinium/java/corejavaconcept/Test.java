package selinium.java.corejavaconcept;

public class Test {
	public static void Info (Person g) {
		g.drinkEat();
		g.work();
	}
	public static void main(String[] args) {
		Info(new SoftwareEnginer());
		Info(new AmeerpetStudent());
	}
}
