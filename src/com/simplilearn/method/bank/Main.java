package com.simplilearn.method.bank;

public class Main {

	public static void main(String[] args) {
		Account account =new Account(1002,"John Smith",750,"johnsmith@gmail.com");
		BankOpertions bop = new BankOpertions();
		
		bop.showAccountBalance(account);
		bop.depositAmount(account, 200);
		bop.withdrawAmount(account, 350);

	}

}
