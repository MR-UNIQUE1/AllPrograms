package advjava.lamdaexpression;

public interface ReturnType {
	String  login (String username );
}

class Test {
	public static void main(String[] args) {
		ReturnType rt =   (username )  -> {return "good morning " + username;};
		String s =rt.login("Sunil");
		System.out.println(s);
		
		ReturnType r1t =   (username )  ->  "good morning " + username;
		String s1 =r1t.login("Sunil");
		System.out.println(s1);
	}
}
