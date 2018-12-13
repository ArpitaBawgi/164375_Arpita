package com.bankapp;

public class BankAccountServiceImpl implements BankAccountService {
	
	BankAccountRepositoryImpl bankAccountRepositoryImpl=null;

	
	public BankAccountServiceImpl(
			BankAccountRepositoryImpl bankAccountRepositoryImpl) {
		super();
		this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
	}

	
	@Override
	public double withdraw(long accountId, double balance) {
		return bankAccountRepositoryImpl.updateBalance(accountId, balance, "withdraw");

	}

	@Override
	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		return bankAccountRepositoryImpl.updateBalance(accountId, balance, "deposit");
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return bankAccountRepositoryImpl.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		double account1=withdraw(fromAccount, amount);
		if(account1!=0){
			double account2=deposit(toAccount, amount);
			if(account2!=0){
				return true;
			}
			deposit(fromAccount, amount);
		}

		return false;
	}

}
