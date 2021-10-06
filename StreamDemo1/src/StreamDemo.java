import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {
		String [] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",};
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		//Arrays.stream(strings).forEach(System.out::println);//this is a sequential stream
		Arrays.stream(strings).parallel().forEach(System.out::println); //this is parallel stream
		System.out.println("diff is "+ (System.currentTimeMillis()-startTime));
	}

}
