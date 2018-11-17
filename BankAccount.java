package bank.arpita.com; 
import java.util.Set;

//collections of logical classes

public abstract class BankAccount {
	
	//static variable
	private static int autoAccountNo;
	
	//instance variable /class variable
      private int accountNo;  //v cannot use instance variables til v create objects 
                                    //static to be declared wen u want declare in common to all obj
      private String accountHolderName;
      protected double accountBalance;
      
      //init block
      {
    	  accountNo=++autoAccountNo; //b4 even constructor invokation init block executes
     }
      
      
     //constructor overloading---when varities are der (combo of parameterised and default constr)
    //default constructor      
      public BankAccount(){              //constructor--significance-automatic object creation, hence preferred high
                                         //initialise class variables
    	  accountHolderName="Unknown";               
    	  accountBalance=0;  
      }
      //parameterize constructor
      public BankAccount(String accountHolderName,double accountBalance){ 
    	  this.accountHolderName=accountHolderName;
      this.accountBalance=accountBalance;
	}
      public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
      public double getAccountBalance() {
		return accountBalance;
	}
      
      public String getAccountHolderName() {
		return accountHolderName;
	}
      public int getAccountNo() {
		return accountNo;
	}
      public void withdraw(double amount) {
    	this.accountBalance-=amount;
    	if (amount<=0){
    		System.out.println("Enter the valid input");
    	}
    	else if(amount>accountBalance){
    		
    		System.out.println("Minimum amount to be maintained is Rs.1000");
    	}
    	else{
    		this.accountBalance-=amount;
    		System.out.println("");
    	}
      }
      public void deposit(double amount) {
    	  this.accountBalance+=amount;   
    	  if (amount<=0){
      		System.out.println("Enter the valid input");
      	}
    	  else{
    		  this.accountBalance+=amount;
    		  System.out.println("The available acccount Balance is:"+accountBalance);
    	  }
		
	}
      
      
public static void main(String[] args) {
	
    CurrentAccount c1=new CurrentAccount("arpita",40000);
    System.out.println("balance before withdraw:"+c1.getAccountBalance());
    System.out.println("odlimit balance after withdraw:"+c1.getodLimit());
    c1.withdraw(50000);
    System.out.println("balance after withdraw:"+c1.getAccountBalance());
    System.out.println("odlimit balance after withdraw:"+c1.getodLimit());
	//BankAccount acc2= new BankAccount("Arpita",5000);
}
}























//Access specifier

//within class
//private:yes--- public=yes--default---s......
//outside class but within same package
//private:no---public yes-- def--yes
//outside class as well as outside package
//private no--- public yes----- import that package, ceate object of that class and access it,---default no

//outside
