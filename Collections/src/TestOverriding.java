import java.util.HashSet;


public class TestOverriding {
public static void main(String[] args) {
	Employee e1 = new Employee("rajeev", 24);
    Employee e2 = new Employee("rajeev", 25);
    Employee e3 = new Employee("rajeev", 24);

    HashSet<Employee> employees = new HashSet<Employee>();
    
    employees.add(e1);
    System.out.println(employees.contains(e3));
    System.out.println("employee.hashCode():  " + e1.hashCode()+ "   employee2.hashCode():" +e3.hashCode());
}


}
