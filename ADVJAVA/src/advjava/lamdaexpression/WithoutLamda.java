package advjava.lamdaexpression;

public interface WithoutLamda {
	void disp();
}
class Tet implements WithoutLamda{
	public void disp() {
		System.out.println("This is the implementation classes without lamda ");
	}
}
class Testslitnt{
	public static void main(String[] args) {
		Tet t = new Tet();
		t.disp();
	}
}
