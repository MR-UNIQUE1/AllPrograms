package advjava.OppsConcept;

public class ToStringMethod {

	public static void main(String[] args) {
		ToStringMethod s = new ToStringMethod();
		System.out.println(s.toString());
		System.out.println(s.getClass().getName()+'@'+Integer.toHexString(s.hashCode()));

	}

}
