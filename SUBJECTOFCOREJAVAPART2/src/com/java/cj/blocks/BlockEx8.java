package com.java.cj.blocks;

class Test
{   int x;
    Test(int i) 
	{ x = i; 
	}
    Test()
	{ x = 0; 
	}
}  
class Main
{  
	public static void main(String[] args)
    {   Test t = new Test(5);
      
        System.out.println(t.x);
    }
}