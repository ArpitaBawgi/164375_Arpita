
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

	public  class Person implements Comparable<Person> {
	 String name;
		double height;
		 double weight;
		
		public Person(String name, double height, double weight){
			this.name=name;
	    	this.height=height;
	    	this.weight=weight;
			
		}

  public int compareTo(Person p)
 {
	if(height==p.height)
		return 0;
	else if(height>p.height)
	return 1;
	else
		return -1;
	 
 } 
	}
		
		


