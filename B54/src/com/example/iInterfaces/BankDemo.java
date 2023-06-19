package com.example.iInterfaces;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount sa = new SavingsAccount("Pavani", "Pune", 101, 45000);
		System.out.println(sa);
		
		sa.deposit(12000);
		System.out.println(sa);
		
		sa.withdraw(5000);
		System.out.println(sa);
		
		sa.withdraw(70000);
		System.out.println(sa);

		sa.deposit(120000);
		System.out.println(sa);

		

	}

}
