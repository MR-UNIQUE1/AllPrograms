package advjava.interfac;

public interface Bank {
	int limit = 40000;
	void widral (); 
}
class AxisBank implements Bank {
	public void widral () {
		System.out.println("Axis bank has daily limit of withdral "+ limit );
	}
}
class SbiBank implements Bank {
	public void widral () {
		System.out.println("SBI bank has daily limit of witdral "+ limit );
	}
}
 class TestVlient {
	 void info (Bank s ) {
		 s.widral();
	 }
	 public static void main(String[] args) {
		TestVlient t = new TestVlient() ;
		t.info(new AxisBank());
		t.info(new SbiBank());
	}
 }