package corejava.assignment;

public class Index {

	public static void main(String[] args) {
		String [] names = {"sunil","mama","sanvi","ranu","sonu"}; 
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String s : names) {
			System.out.println(s);
		}

	}

}
