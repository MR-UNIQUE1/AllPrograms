package advjava.lamdaexpression;

interface Attack {
	void wish ();
}
public class MultipleSOPstatement {

	public static void main(String[] args) {
		Attack ak = () -> {System.out.println("This is first sop statement ");System.out.println("This is the second sop statement ");};
		ak.wish();

	}

}
