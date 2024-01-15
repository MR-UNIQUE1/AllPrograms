package com.java.fileinput;

import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharEx {

	public static void main(String[] args) throws IOException 	{	
	CharArrayWriter charArrayWriter = new CharArrayWriter();

	FileReader reader = new FileReader("abc.txt");
	int c;
	while((c=reader.read()) != -1)
	{	charArrayWriter.write(c);
	}
	
	charArrayWriter.append('d');
	
	char[] ch = charArrayWriter.toCharArray();
	for(char singlechar : ch)
	{	System.out.println(singlechar);
	}
	
	String data = charArrayWriter.toString();
	System.out.println(data);
	
	FileWriter writer1 = new FileWriter("a.txt");
	FileWriter writer2 = new FileWriter("b.txt");
	FileWriter writer3 = new FileWriter("c.txt");
	charArrayWriter.writeTo(writer1);
	charArrayWriter.writeTo(writer2);
	charArrayWriter.writeTo(writer3);
	
	writer1.close();
	writer2.close();
	writer3.close();
	reader.close();
	charArrayWriter.close();
	System.out.println("Operations are completed....");
}
}
