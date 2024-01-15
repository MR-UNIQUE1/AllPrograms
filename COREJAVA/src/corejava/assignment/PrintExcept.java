package corejava.assignment;

public class PrintExcept {

	public static void main(String[] args) {
		int [] data = {10,20,30,40,50,60};
		for (int i = 0; i < data.length; i++) {
			if (data[i]==30||data[i]==60) {
				continue;
			} 
			System.out.println(data[i]);
		}
		
		for (int i : data) {
			if (i==30||i==60) {
				continue ;
			}
			System.out.println(i);
		}

	}

}
