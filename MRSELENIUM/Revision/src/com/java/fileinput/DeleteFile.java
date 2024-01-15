package com.java.fileinput;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
	public static void main(String[] args) throws IOException {
		File s = new File("abc.txt");
		boolean r =s.createNewFile();
		if (r) {
			System.out.println("Created sucessufully ");
		}
		else {
			System.out.println("File already exesi");
		}
		//s.delete();
		
	}
}
