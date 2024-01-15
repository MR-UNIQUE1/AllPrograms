package corejava.arrays;

class Animal  {
}
class Dog extends Animal {
	
}
class puppy extends Dog {
	
}
public class ParentArray {
	
	public static void main(String[] args) {
		Animal u = new Animal();
		Dog v = new  Dog();
		puppy w= new puppy();
		
		Animal [] t = new Animal[3];
		t[0]= u;
		t[1]=v;
		t[2]=w;
		for (Animal animal : t) {
			System.out.println(animal);
		}

	}
}
