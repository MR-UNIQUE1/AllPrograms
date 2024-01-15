package com.java.cj.variable;

public class VariableEx7 {
		int i,j,k;
		int a=10,b,c;
		
		static int l=20,m=30,n;
		static int x=1,y=2,z=3;
	public static void main(String[] args) {
		VariableEx7 y= new VariableEx7();
		System.out.println(y.i+y.j+y.k);
		System.out.println(y.a+y.b+y.c);
		
		System.out.println(VariableEx7.l+"<=>"+VariableEx7.m+"<=>"+VariableEx7.n);
		System.out.println(VariableEx7.x+"<**********>"+VariableEx7.y+"<*********>"+VariableEx7.z);
	}

}
