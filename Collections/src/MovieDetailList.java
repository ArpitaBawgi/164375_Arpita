import java.awt.List;
import java.util.LinkedList;
import java.util.*;


public class MovieDetailList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
				MovieDetails md=new MovieDetails("Googly","Yash","Radika");
				MovieDetails md1=new MovieDetails("Tasveer","Akshay","Ayesha");
				MovieDetails md2=new MovieDetails("Queen","Nohero","Kangana");
				list.add(md);
				list.add(md1);
				list.add(md2);

			  
System.out.println(list);
			   
			}
			

	}


