import java.util.HashMap;
import java.util.Map;


public class HashmapTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="FB";
		String s2="Ea";             //both the hashcode value are same, now dey need to be stored in same index, hence the 
		                            //linkedlist grows, the previous linkedlist will have the add of next linked list created
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" ");
		

		Map<String,Integer> map=new HashMap<>();
		map.put("abc", 120);
		map.put("pqr", 32);
		map.put("lmn", 13);
	System.out.println(map);
	
	map.get(120);
	System.out.println();
	}

}
