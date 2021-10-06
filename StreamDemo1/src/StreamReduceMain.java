import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamReduceMain {

	//N no of inputs => only single value o/p
	// reduce method.
	public static void main(String[] args) {
//		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		  int sum = 0;
//		  for (int i : numbers) {
//		      sum += i;
//		  }
//
//		  System.out.println("sum : " + sum);
//		  
//		  //int sum2 = Arrays.stream(numbers).reduce(sum, (a,b)->a+b);
//		  int sum2 = Arrays.stream(numbers).reduce(sum, Integer::min);
//		  System.out.println(sum2);
		///////////////////////////
//		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		IntStream stream = Arrays.stream(numbers);
//		
//		Stream<Integer> boxed = stream.boxed();
//		//int -> integer object
//		
//		boxed.forEach(System.out::println);
		
		List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
		
		String s[] = {"9", "A", "Z", "1", "B", "Y", "4", "a", "c"};
		
		
		//sorting by array
		Arrays.sort(s);
		Arrays.asList(s).forEach(System.out::println);
		
		//sorting with the collections
		Collections.sort(list);
		System.out.println("After Sorting " + list);
		
		//sorted with treeset (Levi's way)
		SortedSet<String> set = new TreeSet<>();
		for (String string : list) {
			set.add(string);
		}
		System.out.println("Levi's Sort "+list);
		
		//sort with the lambda stream
//		List<String> sortedList = list.stream()
//				.sorted(Comparator.naturalOrder())
//				.toList().
		list.stream().sorted().forEach(System.out:: println);

	}
}
