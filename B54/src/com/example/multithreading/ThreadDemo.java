package com.example.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1 = new ChildThread(5, "first");
		ChildThread t2 = new ChildThread(10, "second");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("----------End of Main-------------");
	}

}
