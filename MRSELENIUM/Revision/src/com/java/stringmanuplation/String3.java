package com.java.stringmanuplation;

class Test 
{	public Test(String string) {
	}
	public static void main(String[] args) 
	{	//Object class equals() executed : Reference Comparision 
		Test t1 = new Test("ratan");
		Test t2 = new Test("ratan");
		System.out.println(t1.equals(t2));  
		
		//String class Overriding equals() : Data Comparision 
		String str1 = "anu";	
		String str2 = "anu";
		System.out.println(str1.equals(str2));  
		
		String s1 = new String("sravya");
		String s2 = new String("sravya");
		System.out.println(s1.equals(s2));		
	
		//StringBuffer there is no equals() method So it uses Object class equals() reference-comp
		StringBuffer sb1 = new StringBuffer("durga");
		StringBuffer sb2 = new StringBuffer("durga");		
		System.out.println(sb1.equals(sb2)); 	 
	}
}

