package advjava.collections.list.readdata;

import java.util.ArrayList;

public class ReadingDataUsingReferance {
	public static void main(String[] args) {
		ArrayList<String >l = new ArrayList<String >();
		l.add("sunil");
		l.add("Ranu");
		l.add("sanvi");
		l.add("richal");
		
		l.forEach(System.out::println);
		
		ArrayList<Integer >t = new ArrayList<Integer >();
		t.add(44);
		t.add(33);
		t.add(22);
		t.add(11);
		
		t.forEach(System.out::println);

	}
}
