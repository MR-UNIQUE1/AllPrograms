package advjava.lamdaexpression;

public interface Withlamda {
	void disp ();
}
class TestClient {
	public static void main(String[] args) {
		WithoutLamda wl =  () -> System.out.println("This the the implementation classes with lamda ");
		wl.disp();
	}
}
