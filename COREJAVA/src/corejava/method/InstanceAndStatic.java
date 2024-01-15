package corejava.method;

public class InstanceAndStatic {
	
	void add (int a , int b) {
		System.out.println(a+b);
	}
	static int sum (int num1,int num2) {
		System.out.println(num1+num2);
		return 10;
	}
	public static void main(String[] args) {
		sum(20, 30);
		InstanceAndStatic h = new  InstanceAndStatic();
		h.add(40, 50);
	}
	

}
