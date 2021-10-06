package wrapperDemo;

 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Java8BinaryOperator2 {

	public static void main(String[] args) {
		Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
		Predicate<Integer> predicateGreaterThan = x->x>3;
		Predicate<Integer> predicate = x->x%2==0;

		//stream to collection => list collection
		//if you want to use multiple predicate you can use the .and() and the .or() method
		//they are similar to using && and ||
		//if you want to do the opposite of the boolean you are running, do .negate() method
		//it is similar to doing !=
		List<Integer> result = Arrays.asList(numbers).stream().filter(predicateGreaterThan.negate().and(predicate).negate()).collect(Collectors.toList());
		
		//the forEach method is for display purposes only
		result.forEach(System.out::println);
		
		Supplier<List<String>> arrayList = supplier();
		List<String> list = arrayList.get();
		
		Supplier<List<Float>> supplier = supplier();
		List<Float> list2 = supplier.get();
	}
	
	public static <T> Supplier<List<T>> supplier() {
		return()->new ArrayList<T>();
	}
	
	public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
		T result = init;
		for (T t : list) {
			result = accumulator.apply(result, t);
		}
		return result;
	}

}
