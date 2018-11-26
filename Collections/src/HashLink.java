import java.util.HashSet;
import java.util.LinkedHashSet;


public class HashLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    HashSet set=new HashSet();  //sorted based on unicode value
		    set.add("a");
		    set.add("H");
		    set.add("A");
		    set.add(null);
		    set.add("4");
		    System.out.println(set);

	       LinkedHashSet linkset=new LinkedHashSet();//follow insertion order
	       linkset.add("a");
	       linkset.add("H");
		    linkset.add("A");
		    linkset.add(null);
		    linkset.add("4");
		    System.out.println(linkset);
	}

}
