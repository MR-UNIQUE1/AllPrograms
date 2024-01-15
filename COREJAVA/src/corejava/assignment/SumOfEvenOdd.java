package corejava.assignment;


public class SumOfEvenOdd {

	public static void main(String[] args) {
		 int sumall =0;
		 for (int i = 1; i <=10; i++) {
			sumall+=i;
		}
		 System.out.println(sumall);
		 int sum=0;
		 for (int i = 0; i <=10; i++) {
			if (i%2==0) {
				sum+=i;
			} 
	}
			System.out.println(sum);
			
	}

}
