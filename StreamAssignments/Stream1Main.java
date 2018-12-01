package StreamAssignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream1Main {

	public static void main(String[] args) {

		List<Fruit> list = new ArrayList();
		list.add(new Fruit("Mango", 58, 100, "Yellow"));
		list.add(new Fruit("Guava", 67, 80, "DarkGreen"));
		list.add(new Fruit("Apple", 500, 95, "Red"));
		list.add(new Fruit("Grapes", 99, 100, "Black"));
		list.add(new Fruit("Cherry", 49, 200, "Red"));

		System.out.println("q1");
		System.out
				.println("fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories: \n");

		list.stream().filter(fruit -> fruit.getCalories() < 100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.forEach(System.out::println);

		System.out.println("-------------------------------------------");

		System.out.println("\nThis is to get colour in order wise:\n");
		list.stream().sorted(Comparator.comparing(Fruit::getColor))
				.forEach(System.out::println);
		System.out.println("-------------------------------------------");

		System.out
				.println("\nonly RED color fruits sorted as per their price in ascending order: \n");
		// THIS IS ALTERNATIVE
		// list.stream().filter(ele->ele.getColor().startsWith("R")).sorted(Comparator.comparing(Fruit::getPrice)).forEach(System.out::println);
		list.stream().filter(ele -> ele.getColor() == "Red")
				.sorted(Comparator.comparing(Fruit::getPrice))
				.map(f -> f.getName() + " : " + f.getColor())
				.forEach(System.out::println);

		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");

		List<News> news = new ArrayList<News>();
		news.add(new News(120, "Arpita", "Sneha", "Have a nice day"));
		news.add(new News(210, "Rashmi", "ashu",
				"see you later, make a good budgets"));
		news.add(new News(120, "Arpita", "abhi", "Read novels with good budget"));
		news.add(new News(122, "chaya", "Sneha", "nice child"));
		news.add(new News(120, "Arpita", "suma", "Read books"));

		System.out.println("\n" + news);

		System.out.println("No of times 'budget' used in comments is: ");
		System.out.println(news.stream()
				.filter(x -> x.getComment().contains("budget")).count());

		System.out
				.println("---------------------------------------------------------------");

		// 6 question max commented user
		System.out.println("user has posted maximum comments: ");
		System.out
				.println(news.stream()
						.max(Comparator.comparing(News::getCommentByUser))
						.get().commentByUser);

		System.out.println("\n");

		// /Display commentByUser wise number of comments
		Map<String, Long> var = news
				.stream()
				.map(v -> v.commentByUser)
				.collect(
						Collectors.groupingBy(Function.identity(),
								Collectors.counting()));
		System.out.println("\nDisplay commentByUser wise number of comments: "
				+ var);
		System.out.println("\n\n");

		ArrayList<Integer> newsfind = (ArrayList<Integer>) news.stream()
				.map(index -> index.getNewsId()).collect(Collectors.toList());
		Map<Integer, Long> mp = newsfind.stream().collect(
				Collectors.groupingBy(Function.identity(),
						Collectors.counting()));
		System.out.println(mp);

		long maxvalue = 0;
		int key = 0;
		for (Map.Entry<Integer, Long> Entry : mp.entrySet()) {
			if (Entry.getValue() > maxvalue) {
				maxvalue = Entry.getValue();
				key = Entry.getKey();
			}
		}
		System.out.println("the newsId which has received maximum comments : "
				+ key);
		System.out.println("The max times theperson commented is: " + maxvalue
				+ " The maxtimes commented  person's newsId is: " + key);

		System.out.println("---------------------------------");
		System.out.println("---------------------------------");

		System.out.println("q3");

		List<Trader> trader = new ArrayList<Trader>();
		trader.add(new Trader("Sindhu", "Shirsi"));
		trader.add(new Trader("Mallika", "Mantralaya"));
		trader.add(new Trader("Chaya", "Hubali"));
		trader.add(new Trader("Madhuri", "Davangere"));
		trader.add(new Trader("Urvi", "Pune"));
		trader.add(new Trader("Ajit", "Pune"));
		trader.add(new Trader("Vani", "Pune"));

		System.out.println("\nThis is for collecting unique  place: \n");
		trader.stream().map(t -> t.getCity()).distinct()
				.forEach(System.out::println);

		System.out.println("-------------------------------------------");

		trader.stream().filter(t -> t.getCity() == "Shirsi")
				.sorted(Comparator.comparing(Trader::getName))
				.forEach(System.out::println);

		System.out.println("-------------------------------------------");

		System.out.println("all traders from Pune and sort them by name");
		trader.stream().filter(t -> t.getCity() == "Pune")
				.sorted(Comparator.comparing(Trader::getName))
				.forEach(System.out::println);

		System.out.println("-------------------------------------");

		System.out.println("names sorted alphabetically");
		trader.stream().sorted(Comparator.comparing(Trader::getName))
				.map(t -> t.getName()).distinct().forEach(System.out::println);

		System.out.println("--------------------");
		boolean exists = trader.stream().anyMatch(
				t -> t.getCity().equals("Indore"));
		System.out.println("any traders based in Indore: " + exists);

		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("\nq4");

		System.out.println("--------------------------------------------");
		System.out.println("-----------------------------------------------");

		List<Transactions> trans = new ArrayList<Transactions>();
		Trader t1 = new Trader("abhi", "Delhi");
		trans.add(new Transactions(t1, 1996, 350));

		Trader t2 = new Trader("shri", "banglore");
		trans.add(new Transactions(t2, 2000, 250));

		Trader t3 = new Trader("mallika", "Delhi");
		trans.add(new Transactions(t3, 2005, 150));

		Trader t4 = new Trader("Amuda", "chennai");
		trans.add(new Transactions(t4, 2010, 750));

		trans.stream()
				.filter(t -> t.getTrader().getCity() == "Delhi")
				.map(t -> t.getTrader().getCity() + ": " + t.getYear()
						+ "value: " + t.getValue())
				.forEach(System.out::println);

		Transactions maxv = trans.stream()
				.max(Comparator.comparing(Transactions::getValue)).get();
		System.out.println("\nThe max value is: " + maxv);

		Transactions minv = trans.stream()
				.min(Comparator.comparing(Transactions::getValue)).get();
		System.out.println("\nThe max value is: " + minv);

		

		trans.stream().filter(t -> t.getYear() == 2005)
				.sorted(Comparator.comparing(Transactions::getValue))
				.map(t -> "The year: "+t.getYear() + "  The value: " + t.getValue()).forEach(System.out::println);
	}
}
