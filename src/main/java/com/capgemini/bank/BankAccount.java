package com.capgemini.bank;


/** this comment is for documentation
 * 
 * @author adharewa
 *@
 */
public abstract class BankAccount {
	
	int accountNo;
	String accountHolderName;
	double  accountBalance;
	static int autoAccountNoGen;
	
	//Init block
	
	{
		accountNo=++autoAccountNoGen;
	}
	
	public BankAccount() {		
		accountHolderName="Unknown";
		accountBalance=0;
	}

	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}

	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	
	
		
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}
	
	

	
	

}
