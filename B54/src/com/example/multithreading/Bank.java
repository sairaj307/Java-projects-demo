package com.example.multithreading;

public interface Bank {

	static final float MINBAL = 5000;
	static final float DEPOSIT_LIMIT = 25000;
	void deposit(int amt) throws DepositLimitExceedsException;
	void withdraw(int amt) throws InsufficientBalanceException;
	
}