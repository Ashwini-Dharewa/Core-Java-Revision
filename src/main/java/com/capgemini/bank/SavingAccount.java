package com.capgemini.bank;

public class SavingAccount extends BankAccount {

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amount)
	{
		accountBalance-=amount;
	}
	
	public void deposit(double amount)
	{
		accountBalance+=amount;
	}

	/*@Override
	public String toString() {
		return "SavingAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
*/
	
	
	

}
