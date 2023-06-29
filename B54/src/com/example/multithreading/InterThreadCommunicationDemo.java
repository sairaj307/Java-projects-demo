package com.example.multithreading;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q obj = new Q();
		Producer p = new Producer(obj);
		Consumer c = new Consumer(obj);
		
		try {
			p.join();
			c.join();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
