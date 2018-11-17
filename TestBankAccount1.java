package bank.arpita.test;

import bank.arpita.com.BankAccount;
import bank.arpita.com.SavingsAccount;
import bank.arpita.com.CurrentAccount;

public class TestBankAccount1 {
	
		
		public static void testBankAccountMethod(){
			//BankAccount acc=new BankAccount();
			//acc.setAccountHolderName("Sachin");
		}
		
     public static void testSavingsAccount(){
    	 SavingsAccount savingAcc=new SavingsAccount();
    	 System.out.println("Account No is "+savingAcc.getAccountNo());
    	 System.out.println("Account Balance is "+savingAcc.getAccountBalance());
    	 savingAcc.deposit(40000);
    	 System.out.println("Account Balance "+savingAcc.getAccountBalance());
    	 System.out.println("=========");
    	 savingAcc.withdraw(0);
    	 System.out.println("Account balance "+ savingAcc.getAccountBalance());
     }
     
     
     
     public static void testCurrentAccount(){
    	 CurrentAccount currentAcc=new CurrentAccount();
    	 System.out.println("Account No is "+currentAcc.getAccountNo());
    	 System.out.println("Account Balance is "+currentAcc.getAccountBalance());
    	 currentAcc.deposit(0);
    	 System.out.println("Account Balance "+currentAcc.getAccountBalance());
    	 System.out.println("=========");
    	 currentAcc.withdraw(50000);
    	 System.out.println("Amount balance "+ currentAcc.getAccountBalance());
     }
	public static void main(String[] args)
	{
		testBankAccountMethod();
		//testSavingsAccount();
		testCurrentAccount();
		
	}
	}
	


