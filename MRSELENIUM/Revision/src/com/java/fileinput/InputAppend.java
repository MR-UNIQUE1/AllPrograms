package com.java.fileinput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputAppend {
	public static void addcontent (String filename , String content) throws IOException {
		String path=System.getProperty("user.dir")+"\\"+ filename ;
		System.out.println("Information storing path"+path);
		
		FileWriter w = new FileWriter(filename,true );
		w.write(content);
		System.out.println("Data will be stored");
		w.close();
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner( System.in );
		System.out.println("Enter the file name ");
		String filename = s.nextLine();
		System.out.println("Enter the content ");
		String content = s.nextLine();
		addcontent(filename ,  content );
	}

}
