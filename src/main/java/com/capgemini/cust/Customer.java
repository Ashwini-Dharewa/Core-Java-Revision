package com.capgemini.cust;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.CurrentAccount;
import com.capgemini.bank.CurrentAccount2;
import com.capgemini.bank.Insurance;
import com.capgemini.bank.SavingAccount;
import com.capgemini.bank.SavingAccount2;

public class Customer {
	
	public static void main(String args[])
	{
		BankAccount acc1=new SavingAccount();
		BankAccount acc2=new CurrentAccount();
		
		Insurance ins1=new SavingAccount2();
		Insurance ins2=new CurrentAccount2();
		
		/*acc1.setAccountHolderName("Ashwini");
		acc1.deposit(7800);
		acc1.withdraw(800);
		
		acc2.setAccountHolderName("Swagata");
		acc2.deposit(107800);*/
		//acc2.withdraw(200000);
		
		ins1.getmonthlyPrem();
		ins1.getPolicyNumber();
		ins2.getmonthlyPrem();
		ins2.getPolicyNumber();
		
		
		System.out.println("Saving Account= Monthly Premium: "+ins1.getmonthlyPrem());
		System.out.println("Saving Account= Policy Number:"+ins1.getPolicyNumber());
		System.out.println("Current Account= Monthly Premium: "+ins2.getmonthlyPrem());
		System.out.println("Current Account= Policy Number:"+ins2.getPolicyNumber());
		
	}

}
