package com.example.multithreading;

public class AccountThread extends Thread{
	private Account acc;
	private int amt;
	
	public AccountThread(Account acc, int amt) {
		this.acc = acc;
		this.amt = amt;
		start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			acc.withdraw(amt);
		}catch(InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}
		
	}
	

}
