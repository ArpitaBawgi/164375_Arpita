package java8.lambda;

import java.util.ArrayList;

public class UnaryOprtr {

	public static void main(String[] args) {
		
		ArrayList<String> li=new ArrayList<String>();
		li.add("Surabhi");
		li.add("dhanu");
		li.add("Shree");
		li.add("Abhi");
		
		System.out.println(li+"\n");
	
	li.stream().forEach(x->System.out.println(x.replaceAll(x, x.toUpperCase())));
	
	}
}
