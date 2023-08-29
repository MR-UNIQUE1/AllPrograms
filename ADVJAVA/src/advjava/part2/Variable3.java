package advjava.part2;

public class Variable3 {
	int a , b, c ;
	int i = 20 , j , k ;
	
	static int p = 10 , q = 30 , r ;
	static int x = 60, y = 77 , z = 99;
	public static void main(String[] args) {
		Variable3  v = new Variable3();
		System.out.println(v.a+"***"+v.b+"***"+v.c);
		System.out.println(v.i+"###"+v.j+"###"+v.k);
		
		System.out.println(Variable3.p+"\\\\"+q+"\\\\"+r);
		System.out.println(x+"--"+y+"--"+z);
	}

}
