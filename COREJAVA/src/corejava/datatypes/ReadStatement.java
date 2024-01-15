package corejava.datatypes;
import java.io.DataInputStream;

public class ReadStatement {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DataInputStream in = new DataInputStream(System.in);
		int intnumber = 0;
		float floatnumber= 0.0f;
				try {
			System.out.println("Enter a integer number ");
			intnumber = Integer.parseInt(in.readLine());
			System.out.println("Enter a float nimber ");
			floatnumber= Float.valueOf(in.readLine()).floatValue();
		} catch (Exception e) {
			System.out.println("Input Error "+ e);
			e.printStackTrace();
		}
				System.out.println("Integer number is ........"+ intnumber);
				System.out.println("Float number is ........"+ floatnumber);
	}

}
