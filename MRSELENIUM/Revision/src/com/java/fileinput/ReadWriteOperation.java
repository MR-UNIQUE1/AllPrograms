package com.java.fileinput;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteOperation {

	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			reader = new FileReader("abc.txt");
			writer= new FileWriter("xyz.txt");
			int r;
			while(( r =reader.read())!=-1){
				System.out.println((char)r);
				writer.write(r);
			}
			
		}catch(Exception s ){
			s.printStackTrace();
		} 
		finally {
			try {
				if (reader!=null) {
					reader.close();
				}
				if (writer!=null) {
					writer.close();
				}
			} catch (Exception e) {
				
			}
		}
		System.out.println("Resources are realeased sucessufylly");
	}

}
