package advjava.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TeansfersImageData {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		FileInputStream i =new FileInputStream("abc.jpg");
		FileOutputStream o = new FileOutputStream("new.jpg");
		//step-2
		int c;
		while (((c=i.read())!=-1)) {
			System.out.println(c);
			o.write(c);
			
		}
		
		System.out.println("operation are completed ");
		
		try {
			if (i!=null) {
				i.close();
			if (o!=null) {
				i.close(); 
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
