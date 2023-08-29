package advjava.lamdaexpression;

interface Message {
	void disp (int a , int b );
}
public class LamdaWarguments {

	public static void main(String[] args) {
		Message  m =  (a ,b )  ->System.out.println("Addition of two is "+(a+b));
		m.disp(10, 20);

	}

}
