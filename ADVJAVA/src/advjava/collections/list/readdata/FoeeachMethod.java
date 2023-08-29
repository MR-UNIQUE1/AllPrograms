package advjava.collections.list.readdata;

import java.util.ArrayList;

public class FoeeachMethod {

	public static void main(String[] args) {
		ArrayList<String > s = new ArrayList<String >();
		s.add("Sunil ");
		s.add("ranu");
		s.add("richal");
		s.add("mansign");
		
		// using lamda expression
		s.forEach(( String str )-> System.out.println(str) );
		
		// using method referance 
		s.forEach(System.out::println);

	}

}
