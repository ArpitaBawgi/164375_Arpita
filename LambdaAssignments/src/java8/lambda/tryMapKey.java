package java8.lambda;

import java.util.HashMap;
import java.util.Map;

public class tryMapKey {
	public static void main(String[] args) {
		
	
	Map<String, Integer> items = new HashMap<>();
    items.put("key 1", 1);
    items.put("key 2", 2);
    items.put("key 3", 3);

    items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
}
}