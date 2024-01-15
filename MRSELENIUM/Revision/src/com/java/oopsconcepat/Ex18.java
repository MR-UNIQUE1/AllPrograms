package com.java.oopsconcepat;

enum Week 
{	MON,TUE,WED;   
}
public class Ex18
{	public static void main(String[] args)
	{	Week w1 = Week.MON;
		Week w2 = Week.TUE;
		Week w3 = Week.WED;
		System.out.println(w1+" "+w2+" "+w3);

		Week[] w = Week.values();
		for (Week ww : w)
		{	System.out.println(ww+" "+ww.ordinal());
		}
	}
}