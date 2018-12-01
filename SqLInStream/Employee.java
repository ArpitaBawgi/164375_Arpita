package SqLInStream;

import java.time.LocalDate;


public class Employee {
	int empNo;
	String eName;
	String job;
	String manager;
	LocalDate hireDate;
	double sal;
	int comm;
	int deptNo;
	
	
	public Employee(int empNo, String eName, String job, LocalDate hiredate,
			int i, double sal, int comm, int deptNo) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.manager =manager ;
		this.hireDate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}


	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getManager() {
		return manager;
	}


	public void setManager(String manager) {
		this.manager = manager;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public int getComm() {
		return comm;
	}


	public void setComm(int comm) {
		this.comm = comm;
	}


	public int getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", job=" + job
				+ ", manager=" + manager + ", hireDate=" + hireDate + ", sal="
				+ sal + ", comm=" + comm + ", deptNo=" + deptNo + "]";
	}
	
	
//	 EMPNO NUMERIC(4) CONSTRAINT EMPNO_EMP_PK PRIMARY KEY,
//	 ENAME VARCHAR(10),
//	 JOB   VARCHAR(9),
//	 MGR   NUMERIC(4), 
//	 HIREDATE DATE,
//	 SAL NUMERIC(7,2),        
//	 COMM NUMERIC(7,2),        
//	 DEPTNO NUMERIC(2) CONSTRAINT DEPTNO_DEPT_FK REFERENCES DEPT(DEPTNO)   

	

	}


