package corejava.arrays;

public class Arrays11 {

	public static void main(String[] args) {
		Array1 a = new Array1(11, "sunil",50000);
		Array1 t = new Array1(222, "mama", 60000);
		
		Array1 [] y = new Array1[2];
		y[0]= a;
		y[1]= t;
		for (Array1 e : y) {
			System.out.println(e.eid+" "+e.ename+" "+e.esal);
		}	
	}
}
