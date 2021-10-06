import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		Stream.iterate(0, n->n+1)
		.filter(n->n%2==0)
		.limit(10)
		.forEach(System.out::println);

	}

}
