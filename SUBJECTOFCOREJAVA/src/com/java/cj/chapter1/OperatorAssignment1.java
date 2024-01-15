package com.java.cj.chapter1;

public class OperatorAssignment1 {

	public static void main(String[] args) {
		   int a = 10, b = 20, c = 20, d;
		        if ((a > b) && (b == c)) 
				{   d = a + b + c;
		            System.out.println("The sum is: " + d);
		        }
		        else
				{	d = a * b * c;
		            System.out.println("The mul is: " + d);
			}
		        int e=10,f=20,g=15;
		        
				if((e>g) || (++f>g)){
		            System.out.println("hi ratan sir");
		        }
				System.out.println("The value of f.."+f);
				
				int a1 = 10, b1 = 1;
				System.out.println(!(a1 < b1));
		        System.out.println(!(a1 > b1));
		        
		        int a2=1,b2=2;
				int c2 = a2-b2; 
			
				b2 = b2 & b2^2 & b2^4;
				c2 = c2 & c2^2 & c2^4;
				
				System.out.println(a2);		//1
				System.out.println(b2);		//4
				System.out.println(c2);		//-7
				
	    }
	}

