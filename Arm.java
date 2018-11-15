package com.arpita.java;

public class Arm {
	public static void main(String[] args)
	  {   int n=153;
		  int temp=n;
	      int rem,res=0;
		  
		  while(value>0)
		  {
			  rem =n%10;
			  res=res+(rem*rem*rem);
			 n=n/10;
			 
			 
		  }
		  if(temp==res)
		  {
			  System.out.println("Armstrong number");}
			  else
			  { System.out.println("Not an Armstrong number");  
			
		  }
		  
	  }
}
