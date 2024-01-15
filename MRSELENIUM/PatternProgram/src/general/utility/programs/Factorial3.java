package general.utility.programs;

public class Factorial3 {
	
	public static int fact(int num) {
		int f= 1 , i= 1;
		while (i<=num) {
			f*=i;
			i++;
		}
		return f;
	}

	public static void main(String[] args) {
		System.out.println(fact(3));

	}

}
