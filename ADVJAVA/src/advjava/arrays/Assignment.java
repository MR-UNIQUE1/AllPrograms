package advjava.arrays;

public class Assignment {

	public static void main(String[] args) {
		int count =0;
		
		int[] s = new int[5];
		s[0]=17;
		s[1]=2;
		s[2]=3;
		s[3]=4;
		s[4]=5;
		int min =s[0], max = s[0];
		for (int i = 0; i < 5; i++) {
			count +=s[i];
		}
		System.out.println(count);
		for (int i = 0; i < s.length; i++) {
			if (max<s[i]) {
				max = s[i];
			}
			if (s[i]<min) {
				min = s[i];
			}
		}
		
		System.out.println("max is "+max);
		System.out.println("min is "+min );

	}

}
