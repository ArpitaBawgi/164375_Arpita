package com.bankapp;

import java.util.ArrayList;
import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	List<BankAccount> accounts=null;
	
	public BankAccountRepositoryImpl(){
		
	} 
	
	
	
	public BankAccountRepositoryImpl(List<BankAccount> accounts) {
		super();
		this.accounts = accounts;
	}

	@Override
	public double getBalance(long accountId) {
		BankAccount account=getBeanofBankAccount(accountId);
		if(account!=null)
			return account.getAccountBalance();
		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance,String type) {
		BankAccount account=getBeanofBankAccount(accountId);
		if(account!=null){
			
			if(type.equals("withdraw")){
				account.setAccountBalance(account.getAccountBalance()-newBalance);
			}
			else if(type.equals("deposit"))
				account.setAccountBalance(account.getAccountBalance()+newBalance);
			return account.getAccountBalance();
			
		}
		return 0;
	}
	
	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	


	private BankAccount getBeanofBankAccount(long accountId){
		if(accounts!=null){
			for(BankAccount account:accounts ){
				if(account.getAccountId()==accountId){
					return account;
				}
			}
		}
		
		
		return null;
		
	}

	

	
	
}
	
	/*BankAccountRepositoryDAO dao=new BankAccountRepositoryDAO();
	ArrayList<BankAccount> userBank=dao.getallUsers();
	private double x;*/

	/*@Override
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

	*/

 