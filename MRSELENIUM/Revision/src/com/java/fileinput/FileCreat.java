package com.java.fileinput;

import java.io.File;
import java.io.IOException;

public class FileCreat {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		boolean b = f.createNewFile();
		if (b) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File is already created ");
		}
	}

}
