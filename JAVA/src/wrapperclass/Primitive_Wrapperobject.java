package wrapperclass;

public class Primitive_Wrapperobject {
	public static void main(String[] args) {
		
		String s = "40";
		Integer i = Integer.valueOf(s);
		System.out.println(i);
		
		String t = "ten";				//It get NumberformatExxception error
		Integer r = Integer.valueOf(t);
		System.out.println(r);
		
	}

}
