package bank.arpita.com;


public class SavingsAccount extends BankAccount{
     private boolean isSalaryAccount;
     
     public SavingsAccount(String accountHolderName, Double accountBalance){
    	 super(accountHolderName,accountBalance);
            this.isSalaryAccount=true;
}

       public SavingsAccount(){
    	   this.isSalaryAccount=true;
       }

       public SavingsAccount(String accountHolderName, double accountBalance, boolean isSalaryAccount){
    	   super(accountHolderName,accountBalance);
    	   this.isSalaryAccount=isSalaryAccount;
       }
       public boolean isSalaryAccount(){
    	   return isSalaryAccount;
       }

}


