package com.arpita.java;

import java.util.*;

public class TaxCal {

	
	public static void main(String[] args) {
         	Scanner ac=new Scanner(System.in);
         	System.out.println("Enter the salary: ");
         	int sal=ac.nextInt();
         	if(sal>0 && sal<=180000){
         	double	tax=0;
         	System.out.println("the tax to be paid: "+tax);
         	}
         	else if(sal>180000 && sal<=300000){
         		double tax1=sal*0.1;
         		System.out.println("the tax to be paid: "+tax1);
         	}
         	else if(sal>300000 && sal<=500000){
         		double tax2=sal*0.2;
         		System.out.println("the tax to be paid: "+tax2);
         	}
         	else if(sal>500000 && sal<=1000000){
         		double tax3=sal*0.3;
         		System.out.println("the tax to be paid: "+tax3);
         	}
         	else{
         		System.out.println( "invalid input");
         	}
}
}
