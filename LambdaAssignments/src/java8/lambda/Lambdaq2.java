package java8.lambda;

public class Lambdaq2 {

	public static void main(String[] args) {
		OrderInterface order=a->{
			if(a>10000)
				return "Accepted";
			else
				return "Not Accepted";
		};
		System.out.println(order.Order(20000));
		
	}
}
