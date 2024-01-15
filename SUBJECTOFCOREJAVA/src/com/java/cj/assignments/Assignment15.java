package com.java.cj.assignments;

import java.util.Scanner;

class AA {
	void add() {
		System.out.println("sunnil is a good boy");
	}
}
class BB extends AA {
	public void add() {
		System.out.println("mama is a good boy");
	}
}
class CC {
	public static void main(String[] args) {
		BB g = new BB() ;
		g.add();
		
	}
}