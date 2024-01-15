package corejava.method;

public class MethodCalling {
	
	void s () {
		System.out.println("sunil");
		p();
	}
	void p() {
		System.out.println("parida");
		//s();		[Stack overflow error]
	}

	public static void main(String[] args) {
		MethodCalling y = new MethodCalling();
		y.s();
	}

}
