package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class lambda4 {

	public static void main(String[] args) {
	   
/* List<String> list=Arrays.asList("Shivgami","Bahubali","Dharmendra","Jiya","Suma","Sumangala","Have a good noon");
   System.out.println(list);
	
list.removeIf(l->(((String)l).length()%2)!=0);
System.out.println(list); */
	ArrayList<String> list=new ArrayList<String>();
	list.add("Shivgamee");
	list.add("Bahubali");
	list.add("Dharmendr");
	list.add("Jay");
	list.add("Sumangala");
	list.add("Have a good noon");

//	System.out.println("For odd values length");
//	list.removeIf(w->(((String) w).length()%2)==0);
//	System.out.println(list);
//	removes all odd values 
	
	System.out.println("For even values length");
	list.removeIf(x->(((String) x).length()%2)!=0);
	System.out.println(list);
	}
}