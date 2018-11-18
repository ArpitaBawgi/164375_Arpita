package com.arpita.oops;

public class Manager extends Employee{

	public static double Incentives=0.3;//30% incentive

	      public Manager(int empId, String empName,double salary) {
	      
	      super(empId,empName,salary);
	      }
	      
   public double getSalary() {
	   return salary+salary*Incentives;
   }


}
