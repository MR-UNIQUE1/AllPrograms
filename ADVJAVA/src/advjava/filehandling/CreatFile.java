package advjava.filehandling;

import java.io.File;
import java.io.IOException;

public class CreatFile {
	public static void main(String[] args) throws IOException {
		File f = new File("sunil.txt");
		System.out.println(f.exists());
		
		boolean b =f.createNewFile();
		if (b) {
			System.out.println("file is created succefully ..."+f.getPath());
		} else {
			System.out.println("file is already exist ");
		}
		System.out.println(f.exists());
		
		
		File g = new File("ranu");
		boolean t =g.mkdir();
		
		// to remove the directory the directory should be empty.
	
		if (t) {
			System.out.println("Directory created succeffully");
		} else {
			System.out.println("Directory already exist ");
		}
	}
}
