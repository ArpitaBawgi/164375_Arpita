package com.bankapp;

public class BankAccountController {
	
	private BankAccountServiceImpl bankAccountServiceImpl;
	
	
	public BankAccountController(BankAccountServiceImpl bankAccountServiceImpl) {
		super();
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}
	
	
	public double withdraw(long accountId, double balance) {
		return bankAccountServiceImpl.withdraw(accountId, balance);
	}
	public double deposit(long accountId, double balance) {
		return bankAccountServiceImpl.deposit(accountId, balance);
	}
	public double getBalance(long accountId) {
		return bankAccountServiceImpl.getBalance(accountId);
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return bankAccountServiceImpl.fundTransfer(fromAccount, toAccount, amount);
	}
}
