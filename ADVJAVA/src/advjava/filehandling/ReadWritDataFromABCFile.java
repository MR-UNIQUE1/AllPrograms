package advjava.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWritDataFromABCFile {
	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("ABC.txt");
		FileWriter w = new FileWriter("PQR.txt");
		int c ;
		while((c=r.read())!=-1) {
			w.write(c);
			System.out.print((char)c);
		}
		
		r.close();
		w.close();
		
	}
}