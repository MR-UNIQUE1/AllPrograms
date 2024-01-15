package com.java.stringmanuplation;

import java.util.Random;

public class String13 {
	public static void main(String[] args) {
		  Random random = new Random(); 
			System.out.println(random.nextInt(10)); 
			System.out.println(random.nextInt()); 
			System.out.println(random.nextLong());   
			System.out.println(random.nextFloat()); 
			System.out.println(random.nextDouble()); 
			System.out.println(random.nextBoolean()); 		
			System.out.println(random.nextGaussian());
			
			System.out.println("***********");

			byte[] bytes = new byte[5]; 
			random.nextBytes(bytes); 		
			for (byte b : bytes)
			{	System.out.println(b);
			}
	}
}
