package com.example.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous class");
			}
		};
		Runnable r2 = () -> {
			System.out.println("Lambda Expression");
		};
		Thread t1 = new Thread(r1);
		t1.start();
		new Thread(r2).start();
	}

}
