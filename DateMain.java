package date.collections;
import java.util.HashMap;
import java.util.Set;

public class DateMain {
	public static void main(String[] args) {


		HashMap<MyDate, String> hm=new HashMap<MyDate,String>();   
		
		
		System.out.println("Initial list of elements: "+hm); 
		
		MyDate arunaDob=new MyDate(05,04,2014);
		MyDate DeviDob=new MyDate(11,12,2015);
		MyDate VibaDob=new MyDate(05,04,2016);
		hm.put(arunaDob,"aruna");    
		hm.put(DeviDob,"Devi"); 
		hm.put( VibaDob,"Viba"); 
	
System.out.println(hm);
System.out.println("Name:"+get(arunaDob,hm ));
System.out.println("Name:"+get(DeviDob,hm ));
System.out.println("Name:"+get(VibaDob,hm ));	
		
	}

	private static String get(MyDate obj,HashMap<MyDate, String>  hm) {
		// TODO Auto-generated method stub\
		Set<MyDate> dates=hm.keySet();
		MyDate[] d=(MyDate[]) dates.toArray(new MyDate[0]);
		
		
		for(MyDate i:d){
		if(obj.getDd()==i.getDd() && obj.getMm()==i.getMm() && obj.getYyyy()!=i.getYyyy() ){
		return "fail";
		}
	     }
		return (String) hm.get(obj);
}
	
	
}
