package advjava.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WithoutOverride {

	
	public static void main(String[] args) throws IOException {
		FileWriter s = new FileWriter("Suu.txt",true);
		BufferedWriter r = new BufferedWriter(s);
		r.write("Welcom sunil");
		r.newLine();
		System.out.println("succesufully added the data ");
		r.close();
	}

}
