import java.util.*;


public class PersonTest {
	
public static void main(String[] args) {
	Set<Person> pset=new TreeSet<Person>();
	Person p1=new Person("Anu",4.5,52.9);
	Person p2=new Person("abhi",4.8,55.0);
	Person p3=new Person("rajat",5.3,69.9);
	Person p4=new Person("Shru",5.2,69.9);
	
	pset.add(p1);
	pset.add(p2);
	pset.add(p3);
	pset.add(p4); 
	
	for(Person p:pset){
		System.out.println("Name:"+p.name+", "+"Height:"+p.height+", "+"Weight:"+p.weight+"\n");
	}
}
}
	/* Set<String> treeSet=new TreeSet<>();
         treeSet.add("Anu");
         treeSet.add("abhi");
         treeSet.add("rajat");
         treeSet.add("Shru");
         
         Set<Double> h=new TreeSet<>();
         h.add(4.5);
         h.add(5.5);
         h.add(5.3);
         h.add(4.8);
         
         Set<Double> w=new TreeSet<>();
         w.add(55.0);
         w.add(70.5);
         w.add(69.8);
         w.add(52.9);
         System.out.println(treeSet);
         System.out.println(h);
         System.out.println(w); */
        

