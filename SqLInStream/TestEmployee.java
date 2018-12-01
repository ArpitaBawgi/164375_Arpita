package SqLInStream;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class TestEmployee {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(1980, 12, 17);
		LocalDate d2 = LocalDate.of(1981, 2, 27);
		LocalDate d3 = LocalDate.of(1981, 2, 22);
		LocalDate d4 = LocalDate.of(1981, 4, 2);
		LocalDate d5 = LocalDate.of(1981, 9, 30);
		LocalDate d6 = LocalDate.of(1981, 5, 1);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(7369, "Smith", "clerk", d1, 7902, 800.0, 0,
				10));
		employees.add(new Employee(7499, "Allenm", "salesman", d2, 7698, 1600,
				300, 30));
		employees.add(new Employee(7521, "Ward", "salesman", d3, 7698, 1250,
				500, 30));
		employees.add(new Employee(7566, "Jones", "Manager", d4, 7839, 2975, 0,
				20));
		employees.add(new Employee(7654, "Martin", "salesman", d5, 7698, 1250,
				1400, 30));
		employees.add(new Employee(7698, "Blake", "clerk", d6, 7839, 2850, 0,
				30));
		employees.add(new Employee(7690, "Ward", "clerk", d6, 7839, 2850, 0,
				30));

		// Display all employees from employee table
		System.out.println("\nDisplay all employees from employee table: ");
		employees.stream()
				.map(ename -> ename.geteName() + ":" + ename.getEmpNo())
				.forEach(System.out::println);

		System.out
				.println("_____________________________________________________________________________________________");

		// Select the employee in department 30
		System.out.println("\nSelect the employee in department 30");
		employees.stream().filter(dno -> dno.getDeptNo() == 30)
				.map(no -> no.getDeptNo() + ":" + no.geteName())
				.forEach(System.out::println);

		System.out
				.println("______________________________________________________________________________________________");

		// List the names, numbers and departmentno of all clerks.
		System.out
				.println("List the names, numbers and departmentno of all clerks");
		employees
				.stream()
				.filter(x -> x.getJob() == "clerk")
				.map(no -> no.getDeptNo() + ":" + no.geteName() + ":"
						+ no.getJob()).forEach(System.out::println);

		System.out
				.println("_______________________________________________________________________");

		// Find the depart numbers and the name of employee of all dept with
		// Deptno greater or equal to 20.
		System.out
				.println("\nFind the depart numbers and the name of employee of all dept with Deptno greater or equal to 20");
		employees
				.stream()
				.filter(dno -> dno.getDeptNo() >= 20)
				.map(no -> "DeptNo: " + no.getDeptNo() + ", EmpName: "
						+ no.geteName() + ", Job: " + no.getJob())
				.forEach(System.out::println);

		System.out
				.println("________________________________________________________________________________");

		// Find the employees whose commission is greater than their salary
		System.out
				.println("\nFind the employees whose commission is greater than their salary:");
		employees
				.stream()
				.filter(c -> c.getComm() > c.getSal())
				.map(n -> "Commmsion: " + n.getComm() + ",  EmpName: "
						+ n.geteName() + ",  Salary: " + n.getSal())
				.forEach(System.out::println);

		System.out
				.println("________________________________________________________________________________");

		// Find the employees whose commission is greater than 60 percent of
		// their salary
		System.out
				.println("Find the employees whose commission is greater than 60 percent of their salary");
		employees
				.stream()
				.filter(comm -> comm.getComm() > 0.6 * comm.getSal())
				.map(no -> no.getComm() + ":" + no.geteName() + ":"
						+ no.getSal()).forEach(System.out::println);

		System.out
				.println("____________________________________________________________________________");

		// List the name, job and salary of all employees in dept 20 who earn
		// more than 2000
		System.out
				.println("List the name, job and salary of all employees in dept 20 who earn more than 2000");
		employees
				.stream()
				.filter(sal -> sal.getDeptNo() == 20 && sal.getSal() > 2000)
				.map(no -> no.getJob() + ":" + no.geteName() + ":"
						+ no.getSal()).forEach(System.out::println);

		System.out
				.println("_________________________________________________________________________________");

		// Find all managers who are not in dept 30
		System.out.println("Find all managers who are not in dept 30");
		employees
				.stream()
				.filter(sal -> sal.getDeptNo() != 30
						&& sal.getJob() == "Manager")
				.map(no -> " Job: " + no.getJob() + ",  EmpName: "
						+ no.geteName() + ",  Salary: " + no.getSal())
				.forEach(System.out::println);

		System.out
				.println("______________________________________________________________________________________");

		// Find the employees who earns between Rs. 1200 and Rs.1400.
		System.out
				.println("Find the employees who earns between Rs. 1200 and Rs.1400.");
		employees
				.stream()
				.filter(x -> x.getSal() >= 1200 && x.getSal() <= 1400)
				.map(t -> "EmpName: " + t.geteName() + ", Salary: "
						+ t.getSal()).forEach(System.out::println);

		System.out
				.println("________________________________________________________________________________________");

		// sum of salaries
		System.out.println("sum of salaries");
		double sum = employees.stream().mapToDouble(emp -> emp.getSal()).sum();
		System.out.println(sum);

		System.out
				.println("____________________________________________________________________________________");

		// maximum salary in employee table
		System.out.println("maximum  salary in employee table:");
		OptionalDouble max = employees.stream()
				.mapToDouble(emp -> emp.getSal()).max();
		System.out.println(max);

		System.out
				.println("_________________________________________________________________________________");

		// minimum salary employee table
		System.out.println("minimum salary  employee table");
		OptionalDouble min = employees.stream()
				.mapToDouble(emp -> emp.getSal()).min();
		System.out.println(min);

		System.out
				.println("_______________________________________________________________________________");

		// Find all employees whose names begin with m.
		System.out.println("Find all employees whose names begin with m");
		employees.stream().filter(name -> name.geteName().startsWith("M"))
				.map(name -> name.geteName()).forEach(System.out::println);

		System.out
				.println("_______________________________________________________________________________");

		// Find all employees whose names end with m.
		System.out.println("Find all employees whose names end with m");
		employees.stream().filter(name -> name.geteName().endsWith("m"))
				.map(name -> name.geteName()).forEach(System.out::println);

		System.out
				.println("_________________________________________________________________________________");

		// Find all employees whose names contain the letter m
		System.out
				.println("Find all employees whose names contain the letter m");
		employees.stream().filter(name -> name.geteName().contains("m"))
				.map(name -> name.geteName()).forEach(System.out::println);

		System.out
				.println("__________________________________________________________________________________");

		System.out
				.println("\nall employees hired in month of February (of any year):");
		employees
				.stream()
				.filter(x -> x.getHireDate().getMonthValue() == 2)
				.map(x -> "EmpName: " + x.geteName() + ", Month: "
						+ x.getHireDate()).forEach(System.out::println);

		System.out
				.println("_______________________________________________________________________");

		System.out
				.println("Find the employees whose names are 5 characters long and end with n:");
		employees
				.stream()
				.filter(n -> n.geteName().length() > 5
						&& n.geteName().endsWith("n"))
				.map(n -> "EmpName: " + n.geteName())
				.forEach(System.out::println);

		System.out
				.println("__________________________________________________________________________________");

		System.out
				.println("Find all salesmen in dept 30 whose salary is greater than or equal to Rs. 1500");
		employees
				.stream()
				.filter(g -> (g.getDeptNo() == 30 && g.getJob() == "salesman")
						&& g.getSal() >= 1500)
				.map(z -> " EmpName: " + z.geteName() + ", Salary: "
						+ z.getSal() + ", job: " + z.getJob())
				.forEach(System.out::println);
		System.out
				.println("_______________________________________________________________________");

		System.out
				.println("Find all employees who were hired on the last day of the month:");
		employees
				.stream()
				.filter(x -> x.getHireDate().getDayOfMonth() == 31
						|| x.getHireDate().getDayOfMonth() == 30)
				.map(emp -> emp.geteName() + ":"
						+ emp.getHireDate().getMonthValue())
				.forEach(System.out::println);
		System.out
				.println("_____________________________________________________________________________");

		System.out
				.println("Sorting based on name, if names are same den sort based on salary");
		employees
				.stream()
				.sorted(Comparator.comparing(Employee::geteName).thenComparing(
						Employee::getSal))
				.map(x -> "EmpNAme:" + x.geteName() + ", Sal:" + x.getSal()).forEach(System.out::println);

		System.out.println("____________________________________________________");
		
		System.out.println("Find the employees who have the letter r as the third letter in their name.:");
		employees.stream().filter(m->m.geteName().charAt(2)=='r').map(x->x.geteName()).forEach(System.out::println);
		
		System.out.println("___________________________________________________________________");
	}
}
