package advjava.multithreading;

public class MyThread extends Thread {
	public void run() {
		for(int  i = 0 ; i < 5 ; i++) {
			System.out.println("This is the user define thread .....");
		}
	}
}
class ThreadDemo {
	public static void main (String [] args ) {
		MyThread  t = new MyThread ();
		t.start();
		for(int i =0 ; i <5 ;i++) {
			System.out.println("This is the main thread");
		}
	}
}