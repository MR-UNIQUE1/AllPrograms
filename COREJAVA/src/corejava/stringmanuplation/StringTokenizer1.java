package corejava.stringmanuplation;

import java.util.*;

public class StringTokenizer1 {

	public static void main(String[] args) {
		StringTokenizer r = new StringTokenizer("Sunil is a good boy");
		while (r.hasMoreTokens()) {
			System.out.println(r.nextToken());
		}
		
		 StringTokenizer st1 = new StringTokenizer("this, is a, test",",");
		 while (st1.hasMoreTokens()) {
			 System.out.println(st1.nextToken());
		 }
	}

}
