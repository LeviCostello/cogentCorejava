package Test;

import java.util.function.Predicate;

public class MaintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate = a -> (a>25); //create predicate
		System.out.println(predicate.test(10)); //calling predicate
	}
//output: false
}
