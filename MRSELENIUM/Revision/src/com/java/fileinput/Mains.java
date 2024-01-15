package com.java.fileinput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Mains {
	public static void main(String[] args) throws IOException {
		
		FileWriter r = new FileWriter("richal.txt",true);
		BufferedWriter e = new BufferedWriter(r);
		e.write("my name dd is mr unique");	
		e.newLine();
		System.out.println("Sucessfilly added the data ");
		e.close();
		
		
		}
}