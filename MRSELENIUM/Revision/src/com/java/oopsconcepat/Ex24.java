package com.java.oopsconcepat;

public class Ex24 {
	public static void main(String[] args) {
		int count =0;
		
		int [ ] r = {2,3,4,5,6};
		for (int i = 0; i <r.length; i++) {
			count +=r[i];
		}
		System.out.println(count);
		
		int max=r[0]; int min = r[0];
		for (int i = 0; i < r.length; i++) {
			if (max<r[i]) {
				max = r[i];
			} else if(min >r[i]){
				min = r[i];
			}
		}
		System.out.println("max value is "+ max);
		System.out.println("min value is "+ min);
	}
	}
