package advjava.stringmanuplation;

public class Ex1 {

	public static void main(String[] args) {
		String s = "Sunil ";
		System.out.println(s);
		
		System.out.println("*****************");
		
		String s1 = new String("Sunil");
		System.out.println(s1);
		
		System.out.println("*****************");	
		char [] ch = {'s','u','n','i','l'};
		String str = new String(ch);
		System.out.println(str);
		
		System.out.println("******************");
		String s3 = "Sunil";
		char [] ch1 = s3.toCharArray();
		for (char c : ch1) {
			System.out.println(c);
		}
		System.out.println("********************");
		
		byte [] b = {65,66,67,68,69,70};
		String s4 = new String(b);
		System.out.println(s4);
		
		byte [] c = {65,66,67,68,69,70};
		String s5 = new String(c,2,2);
		System.out.println(s5);
	}
}