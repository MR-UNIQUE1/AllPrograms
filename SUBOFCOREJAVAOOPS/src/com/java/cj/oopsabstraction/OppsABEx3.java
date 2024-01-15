package com.java.cj.oopsabstraction;

abstract class Test78 {
	abstract void add(String name, String id);
	abstract void mul(int a , int b);
}
abstract class dev1 extends Test78{
	public void add(String name, String id) {
		System.out.println("your id is ....."+id);
		System.out.println("your name is ........."+name);	
	}
}
class Dev2 extends dev1 {
	public void mul(int a , int b ) {
		System.out.println(a+b);
	}
}
class OppsABEx3{
	public static void main(String[] args) {
		Test78 i = new Dev2();
		i.add("sunil", "8934iou83r");
		i.mul(8, 10);
	}
}
