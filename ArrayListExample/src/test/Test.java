package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Steve");
		names.add("Bob");
		names.add("Dave");
		names.add("Mark");
		System.out.println("At position 2-"+names.get(2));
		names.remove(1);
		names.add("Johra");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
