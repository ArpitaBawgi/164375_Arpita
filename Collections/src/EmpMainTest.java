import java.util.Hashtable;


public class EmpMainTest {

	public static void main(String[] args) {
		Hashtable<Emp, String> ht=new Hashtable<Emp, String>();
		Emp emp=new Emp(101, "Nayana");
		Emp emp1=new Emp(104, "rani");
		Emp emp2=new Emp(110, "Suda");
		/* ht.put(emp,"Sindhu");
		ht.put(emp2, "soumya");
		ht.put(emp1, "Sachin"); */
		
		System.out.println(emp.hashcode());
		System.out.println(emp.equals(emp1));
		
		
		/* System.out.println(emp.getName()+" "+emp.getId());
		System.out.println(emp1.getName()+" "+emp1.getId());
		System.out.println(emp2.getName()+" "+emp2.getId()); */

	}
}
