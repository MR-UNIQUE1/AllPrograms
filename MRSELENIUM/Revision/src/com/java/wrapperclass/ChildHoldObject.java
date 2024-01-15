package com.java.wrapperclass;

public class ChildHoldObject {
	void disp(Number n)
	{	if (n==null)
		{	System.out.println(n);
		}
		else
		{	System.out.println("This is Number data..."+n.getClass().getName());
		}
	}
	public static void main(String[] args) 
	{	ChildHoldObject t = new ChildHoldObject();
		t.disp(10);
		t.disp(10.4f);
		t.disp(null);
}
}
