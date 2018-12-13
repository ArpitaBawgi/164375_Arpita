package SqLInStream;

public class Department {
	int deptno;
	String dname;
	int location;
	
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname
				+ ", location=" + location + "]";
	}
	
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public Department(int deptno, String dname, int location) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.location = location;
	}
	

}
