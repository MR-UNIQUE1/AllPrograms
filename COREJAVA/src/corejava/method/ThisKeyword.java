package corejava.method;

public class ThisKeyword {
	
	int num1=20;
	int num2=30;
	
	void add (int num1,int num2) {
		System.out.println(this.num1+this.num2);
		
	}

	public static void main(String[] args) {
		ThisKeyword t = new ThisKeyword();
		t.add(3, 5);

	}

}
