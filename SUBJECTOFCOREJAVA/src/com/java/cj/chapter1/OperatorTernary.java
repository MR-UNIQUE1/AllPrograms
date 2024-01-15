package com.java.cj.chapter1;
public class OperatorTernary {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		if (10>20)
		{	System.out.println("ratan");
		}
		else
		{	System.out.println("anu");
		}
		int a=(10>20)?10:99;
		System.out.println(a);
		
		String sunil=(100<20&&20>10)?"sunil":"mama";
		System.out.println(sunil);
		
		int res1 = 10<20 & 30>40 ? 10*10 : 20+20 ;
		System.out.println(res1);
		
		int c=10,b=20;
		int x = 10>20 | 30>40 ? c : b;
		System.out.println(x);
		
		char g='s';
		int ac=39;
		int as=true ||false?g:ac;
		System.out.println(as);
		
		char g1='s';
		int ac1=39;
		int as1=true && false?g1:ac1;
		System.out.println(as1);
		
		char g3='s';
		int ac3=39;
		int as3=true & false?g3:ac3;
		System.out.println(as3);
		
		char g4='s';
		Object as4=true ||false?g4:10/0==0;
		System.out.println(as4);
		
		char g2='s';
		Object as2=true |false?g2:10/0==0;
		System.out.println(as2);
		
		byte b1 = 10;
		byte b2 = 20;
		int b3;
		b3 = b1 + b2;
		System.out.println(b3);
		
		float f = 10.5f;
		double d = 20.3;
		double res;
		res = f+d;
		System.out.println(res);
		
	}
}























