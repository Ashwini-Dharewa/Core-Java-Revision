package com.capgemini.bank;

public class CurrentAccount extends BankAccount {
	
	double odLimit=150000;
	
	
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount)
	{
		if(amount>odLimit)
			System.out.println("Amount exceeds OD-LIMIT!!");
		else
			accountBalance-=amount;
	}
	
	public void deposit(double amount)
	{
		accountBalance+=amount;
	}
	
	

	

}
