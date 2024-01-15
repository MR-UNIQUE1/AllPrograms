package com.java.cj.blocks;

public class BlockEx1 {
	 BlockEx1() {
		 this(9);
		System.out.println("0-arg constructor ");
	}
	BlockEx1(int a){
		this("sunil",9,"mama");
		System.out.println("1-arg constructor");
	}
	{
		System.out.println("I am the instance block");
	}
	BlockEx1(String a , int c ,String b){
		System.out.println("3-arg constructor");
	}
	static {
		System.out.println("I am the static block");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BlockEx1 j = new BlockEx1();
	}
}
