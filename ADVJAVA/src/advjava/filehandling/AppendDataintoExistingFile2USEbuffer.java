package advjava.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendDataintoExistingFile2USEbuffer {
	
	public static void add (String file,String content) throws IOException {
		String path = System.getProperty("user.dir")+"\\"+file;
		System.out.println("Data is storing in this path "+path);
		
		FileWriter writ = new FileWriter(file,true);
		BufferedWriter yy= new BufferedWriter(writ);
		yy.newLine();
		yy.write(content);
		yy.close();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the file name ");
		String file = s.nextLine();
		
		System.out.println("Enter the content");
		String content = s.nextLine();
		
		add(file,content);

	}

}
