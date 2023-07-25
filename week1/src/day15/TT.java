package day15;

public class TT {
	public static void main(String[] args) {
		mThread t1 = new mThread();
		Runnable r = new mThread2();
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
}

class mThread extends Thread{

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}

class mThread2 implements Runnable{

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("#");
		}
		System.out.println();
	}
	
}