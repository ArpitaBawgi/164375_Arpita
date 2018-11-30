package java8.lambda;

import java.util.ArrayList;
import java.util.ArrayList;

public class lambda5 {

	public static void main(String[] args) {

		ArrayList<String> li = new ArrayList<String>();
		li.add("Surabhi");
		li.add("Wheat");
		li.add("Esha");
		li.add("Eliana");
		li.add("Teju");

		System.out.println(li + "\n");
        System.out.println("//charAt is used to display the character at that particular index");
		li.stream().forEach(x -> System.out.print(x.charAt(0)));

	}

}
