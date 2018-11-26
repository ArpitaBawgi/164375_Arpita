package java.collections;

import java.util.Set;
import java.util.TreeSet;

public class Person {

		  //  private String name;
		    //private double height;
		  //  private double weight;
		    
		  /*  TreeSet(String name,double height,double weight){
		    	this.name=name;
		    	this.height=height;
		    	this.weight=weight;
		    } */
		    
		    public static void main(String[] args) {
                 Set<String> treeSet=new TreeSet<>();
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
                 System.out.println(w);
			}
	}

