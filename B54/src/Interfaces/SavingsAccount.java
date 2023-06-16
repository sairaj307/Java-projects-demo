package Interfaces;
import java.util.Scanner;
public class SavingsAccount extends Person implements Bank{
	private int accNo;
	private float balance;

	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public SavingsAccount(String name, String city, int accNo, float balance) {
		// TODO Auto-generated constructor stub
		super(name,city);
		this.accNo = accNo;
		this.balance = balance;
		
	}

	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		if(amount>DEPOSIT_LIMIT){
			System.out.println("Daily limit exceeded....")
		}
		else{
			balance +=amount;
			System.out.println("Rs"+ amount+"deposited successfully....");
		}
		
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(amount <=balance -MINBAL){
			balance -= amount;
			System.out.println("Rs"+ amount+ "withdraw succussfully..");
			
		}else{
			System.out.println("Insufficient balance can't withdraw...");

		}
		
	}

	@Override
	public String toString() {
		return "SavingsAccount [accNo=" + accNo + ", balance=" + balance
				+ ", getAccNo()=" + getAccNo() + ", getBalance()="
				+ getBalance() + ", getName()=" + getName() + ", getCity()="
				+ getCity() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
