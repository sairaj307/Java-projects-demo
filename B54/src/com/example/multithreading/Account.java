package com.example.multithreading;

public class Account implements Bank {
	private int accNo;
	private String name;
	private float balance;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String name, float balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	/*
	 * @Override public void deposit(int amount) {
	 * 
	 * }
	 * 
	 * @Override public void withdraw(int amount) {
	 * 
	 * }
	 */

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public synchronized void deposit(int amt) throws DepositLimitExceedsException {
		if (amt > 25000)
			throw new DepositLimitExceedsException("Daily limit exceeds...");
		else {
			balance += amt;
			System.out.println("Amount Deposited...." + amt);
		}

	}
@Override
	public synchronized void withdraw(int amt) throws InsufficientBalanceException {

		if (balance - amt < MINBAL)
			throw new InsufficientBalanceException();
		else {
			balance = balance - amt;
			System.out.println("after withdrwing Rs." + amt + " current Balance : Rs." + balance);
		}
	}

	
}