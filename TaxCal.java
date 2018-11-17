package com.arpita.java;

import java.util.*;

public class TaxCal {
	
	public void taxCalculation(){
         	Scanner ac=new Scanner(System.in);
         	System.out.println("Enter the salary: ");
         	double sal=ac.nextInt();
         	double sal2=0;
        	double sal3=0;
        	double sal4=0;
        	
         	if(sal>0 && sal<=180000){
         	double	tax=0;
         	System.out.println("the tax to be paid: "+tax);
         	}
         	else if(sal>180000 && sal<=300000){
         		sal=sal-180000;
         		if (sal>180000){
         		double tax1=sal*0.1;
         		System.out.println("the tax to be paid: "+tax1);
         		}
         		else{sal=sal*0.1;
         		System.out.println("The tax to be paid is:"+sal);
         		}
         		}
         	else if(sal>300000 && sal<=500000){
         		sal=sal-180000;
         		if(sal>180000){
         		 sal2=sal*0.1;
         		 System.out.println("The tax to be paid: "+sal2);
         		}
         		else{
         				sal2=sal2*0.1;
             		System.out.println("The tax to be paid is:"+sal2);
             		}
         			
         		}
         		else if(sal2>300000){
         		double tax2=sal2*0.2;
         		System.out.println("the tax to be paid: "+tax2);
         	}}
	
         	else if(sal>500000 && sal<=1000000){
         		sal=sal-180000;
         		if(sal>180000){
         			sal3=sal*0.1;
         			 System.out.println("The tax to be paid: "+sal3);
         		}
         	}
         		else if(sal3>300000){
         			sal3=sal3*0.2;
         			 System.out.println("The tax to be paid: "+sal3);
         		}
         		else if (sal3>500000){
         		double tax3=sal3*0.3;
         		System.out.println("the tax to be paid: "+tax3);
         	}
         		}
         	else{
         		System.out.println( "invalid input");////do this with switch its easys
         	}
         	
         	
	


	public static void main(String[] args) {
		TaxCal taxcal=new TaxCal();
		taxcal.taxCalculation();
		
	}
}