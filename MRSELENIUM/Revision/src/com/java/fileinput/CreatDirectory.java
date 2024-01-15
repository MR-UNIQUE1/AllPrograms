package com.java.fileinput;

import java.io.File;
import java.io.IOException;

public class CreatDirectory {
	public static void main(String[] args) throws IOException {
		File s= new File("Sunil");
		s.mkdir();
		File f = new File(s,"abc.txt");
		f.createNewFile();
		System.out.println(f.getAbsolutePath());
		
		//f.delete();
		//s.delete();
	}
}
