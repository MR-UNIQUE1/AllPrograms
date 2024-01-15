package wrapperclass;

public class VariableType {
	
	void m1(int...a) {
		System.out.println("m1 method ......"+a.length);
	}

	public static void main(String[] args) {
		VariableType h = new VariableType();
		h.m1();
		h.m1(10);
		h.m1(10,20,30);

	}

}
