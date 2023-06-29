package com.example.multithreading;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1 = new ChildThread(5, "First");
		ChildThread t2 = new ChildThread(10, "Second");
		System.out.println("Current thread"+ Thread.currentThread());
		t1.start();
		t2.start();
		Thread.currentThread().setName("Parent Thread");
		Thread.currentThread().setPriority(Thread. MIN_PRIORITY); // changing priority of the thread System.out.println("Current Thread: "+Thread.currentThread());// returns current thread
		try {
		t1.join(); // wait current thread until ti 15 dead
		t2.join(300);
		// wail current thread until 12 is dead or time period is over
		}catch (InterruptedException e) {
		System.err.println(e.getMessage());
		}
		System.out.println("- -End of Main- -----");
	}

}
