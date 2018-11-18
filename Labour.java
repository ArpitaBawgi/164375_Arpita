package com.arpita.oops;

public class Labour extends Employee {
	public static double Overtime=0.35;

	public Labour(int empId, String empName, double salary) {
		super(empId, empName, salary);
		// TODO Auto-generated constructor stub
	}
	
	public double getSalary() {
		return salary+salary*Overtime;
	}

}
