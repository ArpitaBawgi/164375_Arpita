package com.arpita.java;
import java.util.*;

public class Arm {

	 public static void armFunc(int n){
		
		  int temp=n;
	      int rem,res=0;
	     // boolean flag=false;
		  
		  while(n>0)
		  {
			  rem =n%10;
			  res=res+(rem*rem*rem);
			 n=n/10;
		  }
		  if(temp==res)
		  {
			  System.out.println(res+" Is a Armstrong number");
			  //flag=true;
			  }
			//if(flag==false){
			//	System.out.println("not a armstrong num");
		
			//}
	}
	
	
	public static void main(String[] args){
		 Scanner ac=new Scanner(System.in);
			int num;
			System.out.println("enter the number");
			num=ac.nextInt();
	      
			//Arm arm=new Arm();
	      armFunc(num);
	}
	
		
		
			  
		  }

