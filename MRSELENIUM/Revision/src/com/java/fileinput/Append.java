package com.java.fileinput;

import java.io.FileReader;
import java.io.FileWriter;

public class Append {
	
	public static void main(String[] args) throws Exception {
		FileReader r = new FileReader("richal.txt");
		FileWriter w = new FileWriter("xyz.txt");
		int e;
		
		while((e =r.read())!=-1) {
			System.out.print((char)e);
			w.write(e);
		}
		w.append("sunil is a good boy ");
		w.append("\nhe mee");
		
		
		
		r.close();
		w.close();
		
		
	}

}
