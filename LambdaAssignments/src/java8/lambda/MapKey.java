package java8.lambda;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.util.stream.Collectors;

public class MapKey {
 
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap();
		map.put("Zebra","Zoo");
		map.put("Lion","Jungle");
		map.put("Whale","Ocean");
		map.put("Dog", "Domestic pet");
		System.out.println(map);
		System.out.println("\n");
		map.entrySet().stream().forEach(entry->System.out.print(entry.getKey().concat(entry.getValue())));
	}
}

	//Map<Object, Object> collect=map.entrySet().stream().filter(x->x.getKey()=="Lion").collect(Collectors.toMap(p->((Entry<String, String>) p).getKey(), p->getValue()));
	
	//System.out.println(collect);
	//Map<String, String> collect2=map.entrySet().stream().filter(x->x.getKey()<="Dog").collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	//System.out.println(collect2);
	
	//map.entrySet().stream().map(entry->(entry.getKey().concat(entry.getValue())));
		
//		//StringBuilder m=new StringBuilder((CharSequence) map.entrySet());
//		
//		
//		System.out.println("uSING sTRING bUILDER HOW TO CONCATE: \n");
//		  StringBuilder builder = new StringBuilder("cat");
//	      StringBuilder builder2 = new StringBuilder("dog");
//
//	     // Combine 2 StringBuilders.
//	       builder.append(builder2);
//	       System.out.println(builder);
//
//			
//	}
//
//		
//		
////		StringBuilder builder=new StringBuilder();
////		
////		for(int i=0;i<6;i++)
////		{
////			builder.append("pqr ");
////		}
////		String res=builder.toString();
////		System.out.println(res);
//	
//
//
//
//
//
//
//
//
//
//
//
////public class Program {
////    public static void main(String[] args) {
//
//     
//    }
