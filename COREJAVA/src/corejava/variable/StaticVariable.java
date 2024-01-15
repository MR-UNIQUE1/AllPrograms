package corejava.variable;

public class StaticVariable {
	int num1 = 100;
	int num2 = 400;
	
	void sum () {
		System.out.println(num1+num2);
	}
	static void div () {
		StaticVariable d = new StaticVariable();
		System.out.println(d.num2-d.num1);
	}

	public static void main(String[] args) {
		StaticVariable j =new StaticVariable();
		System.out.println(j.num1*j.num2);
		
		div();
		j.sum();
	}

}
