package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToColl {
	public static void main(String[] args) {
		String[ ] names = {"sunil", "ranu"," richal","rajni"};
		List<String > name= new ArrayList<String>(Arrays.asList(names));
		System.out.println(name);
	}
}
