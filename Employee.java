package com.arpita.oops;

public abstract class Employee {
	  int empId;
	  String empName;
	  double salary;
	  
	  
	  public Employee(int empId, String empName,double salary) {
		  this.empId=empId;
		  this.empName=empName;
		  this.salary=salary;
	  }
	
	
	

	public static void main(String[] args) {
	
 Manager m=new Manager(101,"Shonali", 20000);
 Labour  l=new Labour(120," Nitin", 15000);
	
	System.out.println("Employee: "+m.getempName()+"\n"+"Salary with Incentives :"+m.getSalary());
	System.out.println("=============");
	System.out.println("Employee: "+l.getempName()+"\n"+"Salary with Overtime :"+l.getSalary());
	}

	public int getEmpId() {
		return empId;
	}
	
	public String getempName() {
		return empName;
		}
	
	public void setEmpId() {
		this.empId=empId;
	}
	
	 public void setEmpName(String empName) {
	        this.empName = empName;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	       this.salary = salary;
	
	    }

	
	
}
