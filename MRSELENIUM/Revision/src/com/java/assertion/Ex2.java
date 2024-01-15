package com.java.assertion;

public class Ex2 {
	 static boolean info(String name)
		{  if (name.equals("ratan"))
		   {	return true;
		   }
		   else
		   {	return false;
		   }
		}
	   public static void main(String[] args)
	   {  
		   assert Ex2.info(args[0]):"The name is not Good check once.....";
		   System.out.println("The name is working good...."+args[0]);
}
}
