package com.arpita.java;

public class Arm {
	public static void main(String[] args)
	  {   int value=153;
		  int temp=value;
	      int rem,res=0;
		  
		  while(value>0)
		  {
			  rem =value%10;
			  res=res+(rem*rem*rem);
			 value=value/10;
			 
			 
		  }
		  if(temp==res)
		  {
			  System.out.println("Armstrong number");}
			  else
			  { System.out.println("Not an Armstrong number");  
			
		  }
		  
	  }
}
