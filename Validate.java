package com.arpita.java;
 import java.util.*;
 public class Validate {
 
	public static void main(String[] args) {
		
		Validate validate=new Validate();
		validate.checkValidation();
	
	
	}
	
	public void checkValidation(){
		String username="Arp";
		int password=1234;
		int count=1,i;
		
	     Scanner ac= new Scanner(System.in);
	     System.out.println("enter the username and password:");
	     String uname=ac.next();
	     int pswd=ac.nextInt();
		
		 while(count>0 && count<=3){
			 if(username==uname && password==pswd){
				 System.out.println("Welcome!");
				 break;
			 }
			 else{
				 System.out.println("Invalid input");
				 count++;
				 uname=ac.next();
			      pswd=ac.nextInt();
			 }
			
		}
	}
 }