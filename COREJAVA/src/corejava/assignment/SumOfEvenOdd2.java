package corejava.assignment;

public class SumOfEvenOdd2 {

	public static void main(String[] args) {
		
		int all=0,odd=0,even=0 ;
		for (int i = 0; i <=10; i++) {
			all+=i;
			if (i%2==0) {
				even+=i;
			} else {
				odd+=i;
			}
		}
		System.out.println("sum of all number is "+all);
		System.out.println("sum of even number is "+even );
		System.out.println("sum of odd number is "+odd);
		
	}

}
