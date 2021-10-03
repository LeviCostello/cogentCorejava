package wrapperDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main  {

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo demo2 = new FunctionalInterfaceDemo() {
			
			@Override
			public void sample() {
				// TODO Auto-generated method stub
				System.out.println("hello from sample");
			}
			@Override
			public String test() {
				// TODO Auto-generated method stub
				return "new value";
			}
		}; //tradional approach
		
		//lambda expression
		FunctionalInterfaceDemo demo = ()->{System.out.println("hello from java 8");};
		
		String result = demo.test();
		System.out.println(result);
		demo.sample();
		FunctionalInterfaceDemo.display();
		/*
		 * //LinkedHashMap: {10=null, null=null} //HashMap: {null=null, 10=null} //the
		 * linked hashmap orders the values according to the key
		 * 
		 * LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
		 * 
		 * hashMap.put(10, "levi"); hashMap.put(null, "abhinandan"); //since the k null
		 * is the same as the previous value then it will replace the key
		 * hashMap.put(null, null);
		 * 
		 * System.out.println(hashMap.get(10));
		 * 
		 * // //Retrieve only keys from a map // Set<Integer> set = hashMap.keySet(); //
		 * System.out.println(set); // // //Retrieve only values from a map // //you can
		 * use collection or list // Collection<String> collect = hashMap.values(); //
		 * System.out.println(collect);
		 * 
		 * //traverse the map for (Entry<Integer, String> entry : hashMap.entrySet()) {
		 * //entry => key value pair Integer key = entry.getKey(); String val =
		 * entry.getValue(); System.out.println("key:"+key);
		 * System.out.println("val:"+val); }
		 */
		
		/*
		 * // autoboxing is changing a primitive to object Integer i = 10;
		 * 
		 * System.out.println(i.getClass().getName());
		 * 
		 * double a = i.byteValue(); //unboxing //you can unbox the primitive value into
		 * any form that has a Value at the end System.out.println(a);
		 * 
		 * //autoboxing with a float Float j = 10.0f;
		 * System.out.println(j.getClass().getName()); float b = j;
		 * System.out.println(j);
		 */
	}

}
