package advjava.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendContaint {
	


	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File t = new File("sunil.txt");
		t.createNewFile();
		Scanner s = new  Scanner(System.in);
		
		System.out.println("Enter the containt ");
		String containt = s.nextLine();
		
		FileWriter w = new FileWriter("sunil.txt",true);
		w.write(containt);
		System.out.println("Successufylly");
		w.close();
	}

}
