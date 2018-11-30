import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = (List) number.stream().map(x -> x*x).collect(Collectors.toList());
	System.out.println(square);
	}

}
