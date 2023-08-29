package advjava.OppsConcept;

public class INEx {
	
	public void Test () {
		System.out.println("Method test ");
	}
	public void Test1 () {
		System.out.println("methos test11212");
	}

}
class INEx1 extends INEx {
	public void Test3() {
		System.out.println("Third method ");
	}
	public void Test4 () {
		System.out.println("4th method ");
	}
}
class INx3 extends INEx1 {
	public void Test5 () {
		System.out.println("This is the 5 th method ");
	}
	public void Test6 () {
		System.out.println("This is the 6th method ");
	}
	public static void main(String[] args) {
		INEx x = new INEx();
		x.Test();
		x.Test1();
		INEx1 o = new INEx1();
		o.Test();
		o.Test1();
		o.Test3();
		o.Test4();
		INx3 s = new INx3();
		s.Test();
		s.Test1();
		s.Test3();
		s.Test4();
		s.Test5();
		s.Test6();
	}
}
