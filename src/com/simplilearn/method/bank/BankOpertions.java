package com.simplilearn.method.bank;

public class BankOpertions {

	public void showAccountBalance(Account account) 
	{
		System.out.println("The account number is " + account.getAccountNo());
		System.out.println("The name of the Account user is " + account.getName());
		System.out.println("The balance on the account is " + account.getBalance());
		System.out.println("The email of the user is " + account.getEmail());
	}

	public void depositAmount(Account account,double depositAmount) 
	{
		if (depositAmount> 0)
		{
			System.out.println("The balance before deposite is : " + account.getBalance() );
			double UpdateBalance = account.getBalance() + depositAmount;
			account.setBalance(UpdateBalance);
			System.out.println("The balance after deposite is : " + account.getBalance() );
		}
		
	}
	
	
	public void withdrawAmount(Account account, double withdrawAmount) 
	{
		if (withdrawAmount > 0)
		{
			System.out.println("The balance before withdrawal is : " + account.getBalance() );
			double UpdateBalance = account.getBalance() - withdrawAmount;
			account.setBalance(UpdateBalance);
			System.out.println("The balance after withdrawal is : " + account.getBalance() );
		}
		
	}
	

}
