package com.bankapp;

import java.util.ArrayList;

public class BankAccountrepositoryImpl implements BankAccountRepository {
	
	BankAccountRepositoryDAO dao=new BankAccountRepositoryDAO();
	ArrayList<BankAccount> userBank=dao.getallUsers();
	private double x;

	@Override
	public double getBalance(long accountId) {
		double x=0;
for(BankAccount index:userBank){
	if(index.getAccountId()==accountId){
		x=index.getAccountBalance();
	}
}
		return x;
		
		
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		for(BankAccount index:userBank){
			double x;
			if(index.getAccountId()==accountId){
				x=index.getAccountBalance();
			}
			x=newBalance;
	}
		
		return x;
	}

	public static void main(String[] args) {
		
	}
	
}
 