package advjava.OppsConcept;

class Animal {
}
class Dog {
}
class Pappy{
}
public class InstanceOf {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog g = new Dog();
		Pappy p = new Pappy();
		System.out.println(a instanceof Object);
		System.out.println(g instanceof Object);
		System.out.println(p instanceof Object);
		System.out.println("***************");
		System.out.println(a instanceof Animal);
		System.out.println(g instanceof Dog);
		System.out.println(p instanceof Pappy);
		System.out.println("***************");
	}

}
