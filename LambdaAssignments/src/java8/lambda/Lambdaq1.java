package java8.lambda;

public class Lambdaq1 {

	public static void main(String[] args) {
		general add=(a,b)-> a+b;
		System.out.println("Addition:"+add.disp(56, 87));
	
		general sub=(a,b)-> a-b;
		System.out.println("Subtraction:"+sub.disp(656, 487));
		
		general mul=(a,b)-> a*b;
		System.out.println("Multiplication:"+mul.disp(40, 32));
		
		general div=(a,b)-> {
		if(b==0) return 0;
		return a/b;
		};
		System.out.println("Division:"+div.disp(40, 8));
	
	}
}
