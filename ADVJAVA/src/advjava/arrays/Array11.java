package advjava.arrays;

public class Array11 {

	public static void main(String[] args) {
		Array1 g = new Array1(111, "sunil",34545.5);
		Array1 h = new Array1(222, "Papua ", 3454354.4);
		
		Array1 [] u = new Array1[2];
		u[0]=g;
		u[1]=h;
		for (Array1 o : u) {
			System.out.println(o.emp+" "+o.Ename+" "+o.esal);
		}
	}

}
