import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("spring", "java", "angular", "microservice");
		
		getList(list, "java").forEach(System.out::println);;
	}
	
	public static List<String> getList(List<String> list, String f) {
		return list.stream().filter(e->!e.equals(f)).collect(Collectors.toList());//sequential stream
		//the traditional way
//		List<String> result = new ArrayList<>();
//		for (String string : list) {
//			if(!string.equals(filter)) {
//				result.add(string);
//			}
//		}
//		return result;
	}

}
