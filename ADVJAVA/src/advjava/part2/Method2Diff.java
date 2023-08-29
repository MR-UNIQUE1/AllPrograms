package advjava.part2;

public class Method2Diff {
	int num = 10 ,  num1 = 20 ;
	void add (int val1 , int val2) {
		System.out.println(val1+val2);
		System.out.println(num +num1);
	}
	
	public static void main(String[] args) {
		Method2Diff s = new Method2Diff();
		s.add(2, 88);
	}

}
