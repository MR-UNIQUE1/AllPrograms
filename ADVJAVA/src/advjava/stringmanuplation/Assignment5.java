package advjava.stringmanuplation;

public class Assignment5 {
	public static void main(String[] args) {
		int count =0;
		String s = "rkeejireejjijirrejjkjdffdd";
		char [] f = s.toCharArray();
		for (int i = 0; i < f.length; i++) {
			if (f[i]==f[i+1]) {
				System.out.println(f[i]+""+f[i+1]);
				i++;
				count ++;
			}
		}
		System.out.println(count);
	}
}
