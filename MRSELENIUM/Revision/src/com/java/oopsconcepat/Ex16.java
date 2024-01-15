package com.java.oopsconcepat;

 class overrided {
	public static void mrg () {
		System.out.println("red girl");
	}
	public static void property() {
		System.out.println("gold , car , money, bike , land ..........");
	}
}
class tests extends overrided{
	public static void mrg () {
		System.out.println("white girl ");
	}
}
class testh {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		tests tes = new tests();
		tes.mrg();
		tes.property();
	}
}

