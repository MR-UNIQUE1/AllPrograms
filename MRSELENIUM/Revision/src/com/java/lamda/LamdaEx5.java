package com.java.lamda;
interface ii{
	String ser (String us, String pa);
}

public class LamdaEx5 {
	public static void main(String[] args) {
		ii t = (us,pa) -> {return us.equalsIgnoreCase("s")&&pa.equalsIgnoreCase("s@s")? "sucess":"faiiled";};
		String kk = t.ser("s", "s@s");
		System.out.println("Login Success"+ kk);
		System.out.println("********************");
		@SuppressWarnings("unused")
		ii t1 = (us,pa) -> {return us.equalsIgnoreCase("s")&&pa.equalsIgnoreCase("s@s")? "sucess":"faiiled";};
		String kk1 = t.ser("s", "s@t");
		System.out.println("Login Success"+ kk1);
		
	}
}