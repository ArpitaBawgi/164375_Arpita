package bank.arpita.com;
import bank.arpita.com.BankAccount;


public class CurrentAccount extends BankAccount {
	
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}

	 private double odlimit; 
	 {//init block
	 odlimit=20000;
	}
	 public CurrentAccount(String accountHolderName, double accountBalance){
  	   super(accountHolderName,accountBalance);
     }
	 public double getodLimit(){
		 
		 return this.odlimit;
	 }

public void withdraw(double amount){
	/*if(amount<=0){
		System.out.println("invalid amount");
		
	}
	else if(this.accountBalance+odlimit){
		
		
	}
	*/
	
	double bal=getAccountBalance();
	double remainingBal;
	if(amount <=0){
		
		System.out.println("invalid amount");
	}
	
	else if(amount>this.accountBalance && amount<(this.accountBalance+this.odlimit)){
		remainingBal=amount-this.accountBalance;
		this.accountBalance=0;
		this.odlimit-=remainingBal;
	}
		
	else{
			this.accountBalance-=amount;
		}
	}
	
	
	
}


