package com.tnsif.client;

import java.util.Scanner;

import com.tnsif.service.BankTransaction;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			// Checking Balance
			BankTransaction trans1 = new BankTransaction();
			boolean valid;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the sender account number ");
			int srcAccNo=sc.nextInt();
			 valid=trans1.validateAccount(srcAccNo);
			if(valid) {
			System.out.println("Account no"+srcAccNo+"  is valid");}
			System.out.println("Enter the receiver account number ");
			int recAccNo=sc.nextInt();
			valid=trans1.validateAccount(recAccNo);
			if(valid) {
				System.out.println("Account no"+recAccNo+"  is valid");}
			float balance;
			
			balance = trans1.getBal(srcAccNo);
			if (balance != -1)
				System.out.println(balance);
			balance = trans1.getBal(recAccNo);
			if (balance != -1)
				System.out.println(balance);

			
			// Transferring Fund
			trans1.transferAmount(srcAccNo, recAccNo, 25000);

			//Checking Balance
			System.out.println(trans1.getBal(srcAccNo));
			System.out.println(trans1.getBal(recAccNo));

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
