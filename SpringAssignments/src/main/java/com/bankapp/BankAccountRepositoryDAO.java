package com.bankapp;

import java.util.ArrayList;

public class BankAccountRepositoryDAO {
	ArrayList<BankAccount> list;
	public BankAccountRepositoryDAO(){
	
  list=new ArrayList<BankAccount>();

  list.add(new BankAccount(1234,"Mallika","Savings",10000.0));
  list.add(new BankAccount(1234,"Sindhu","Savings",10000.0));
  
	}
	
	public ArrayList<BankAccount> getallUsers(){
		return list;
	}
}
