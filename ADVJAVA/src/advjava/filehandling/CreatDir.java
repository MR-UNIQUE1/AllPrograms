package advjava.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatDir {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		File f = new File("ranu");
		boolean b = f.mkdir();
		
		File t = new File("ranu" , "sunil.txt");
		boolean file = t.createNewFile();
		if (file) {
			System.out.println("The directory is created "+t.getPath());
		} else {
			System.out.println("The directory is already exist ");
		}
		
		FileWriter write  = new FileWriter(t,true);
		write.write("Rani is good girl");
		System.out.println("Successufyllly add the data ");
		write.close();
		
	}
}
