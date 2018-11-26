import java.util.*;
public class IterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> al=new ArrayList();
      al.add(2);
      al.add(79);
      al.add(8);
      al.add(60);
      System.out.println(al);
      
      ListIterator<Integer> itr=al.listIterator(); 
      System.out.println("Insertion order followed");
      while(itr.hasNext()){
    	  System.out.println(itr.next());
      }
      System.out.println("In Reverse Direction");
       while(itr.hasPrevious()){
    	   System.out.println(itr.previous());
       }
      
      
	}

}
