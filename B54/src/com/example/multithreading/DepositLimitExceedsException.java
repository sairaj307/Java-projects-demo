package com.example.multithreading;

public class DepositLimitExceedsException extends Exception {

	public DepositLimitExceedsException() {
		super("Daily limit of deposit is exceeded");
		
	}
	public DepositLimitExceedsException(String message) {
		super(message);
		
	}

	
}