package com.java.part2;

class Test    {
    int x;
   Test(int i)	{
	 x = i; 
  }
Test()
{ x = 0; 
}
}  
class Main
{   public static void change(Test t)
{   t = new Test();
    t.x = 10;
}
public static void main(String[] args)
{   Test t = new Test(5);
    Main.change(t);
    System.out.println(t.x);
}
}