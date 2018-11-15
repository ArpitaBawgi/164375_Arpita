
package com.arpita.bank;
import java.util.*;

public class Bank {
	 private int accountNo;        //v cannot use instance variables til v create objects 
	 private String AccountHolderName;//static to be declared wen u want declare in common to all obj
	 private double accBal;
	 	                              

	public void deposit(double amount) {	
		if(amount<=0) {
			System.out.println("Enter the Valid input");
		}
		else
		{  amount+=accBal;
		System.out.println("The totalAccount Bal is:"+ amount);
			
		}
		
	}
	
	public void withDraw(double amount) {
		if(amount<=0) {
			System.out.println("Enter the Valid input");
		}
		else if(amount>accBal) {
			System.out.println("Minimum Balance to be maintained is Rs.1000");
		}
		else {
			amount-=accBal;
			System.out.println();
		}
	}
	
	public void setAccountHolderName(String AccountHolderName) {
		 this.AccountHolderName=AccountHolderName;
	}
	
	
	public double getaccBal() {
		return accBal;
	}
	
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();

	}

}
