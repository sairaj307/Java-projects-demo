package com.example.multithreading;

public class SynchronisationDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(101, "sai", 50000);
		System.out.println(a1);
		
		AccountThread t[] = new AccountThread [10];
		for (int i = 0; i < 10; i++) {
		t[i] = new AccountThread (a1, 1000 *(i + 1));
		}
		try { for (int i=0; i<10; i++) { 
			t[i].join(); } 
		} catch (InterruptedException e) {
			System.err.println(e.getMessage()); // waits main thread till execution of all child thread finish
		}
		System.out.println("--------------------------------");
		System.out.println(a1);

	}

}
