package com.java.cj.blocks;

public class BlockEx2 {
	final int a ;
	static final int b ;
	
	{
		a=2000;
	}
	static {
		b=1000;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.println(new BlockEx2().a);
		System.out.println(new BlockEx2().b);
		
	}
}
