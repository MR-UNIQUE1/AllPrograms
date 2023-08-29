package advjava.arrays;
class Animal {
}
class dog extends Animal {	
}
class puppy extends dog {	
}
public class TestClient {
	public static void main(String[] args) {
		Animal a = new Animal();
		dog g = new dog();
		puppy s= new puppy();
	
		Animal [] t= new Animal[3];
		t[0]= a;
		t[1]= g ;
		t[2]= s;
		for (Animal e : t) {
			System.out.println(e.getClass().getName());
		}

	}

}
