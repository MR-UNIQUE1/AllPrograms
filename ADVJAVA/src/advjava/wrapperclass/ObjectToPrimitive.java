package advjava.wrapperclass;

public class ObjectToPrimitive {

	public static void main(String[] args) {
		Integer s = Integer.valueOf(100);
		int num = s.intValue();
		double num1 = s.doubleValue();
		float num2 = s.floatValue();
		System.out.println(num+num2+num1);
		
		Integer d = Integer.valueOf(100);
		Double d1 = Double.valueOf(300.9);
		String s1 = d.toString();
		String s2 = d1.toString();
		System.out.println(s1+s2);
		
		Integer t = Integer.valueOf(10);
		int v1 = t;
		double v2 = t;
		float v3 = t;
		System.out.println(v1+v2+v3);
	}

}
