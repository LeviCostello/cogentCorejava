package wrapperDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import org.apache.commons.codec.digest.DigestUtils;

public class Main  {

	public static void main(String[] args) {
		Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
		Integer result = math(Arrays.asList(numbers), 0, (a,b) -> a+b);
		System.out.println(result);  //55
		Integer result2 = math(Arrays.asList(numbers), 0, Integer::sum);
		System.out.println(result2); //55
	}
	
	public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
		T result = init;
		for(T t : list) {
			result = accumulator.apply(result, t);
		}return result;
	}
		
		/*BinaryOperator<Integer> binaryOperator = (a,b)->{return a+b;};
		
		BiFunction<Integer, Integer, Integer>biFunction = (a,b)->{return a+b;};
		
		int result = biFunction.apply(10, 20);
		int result2 = binaryOperator.apply(10, 20);
		System.out.println(result);
		System.out.println(result2);
		
		
		
		//lambda
		Map<String, Integer> map = obj.convertListToMap(List, x->x.length());
		System.out.println(map); // {node=4, c++3, java=4, javascript=10}
		
		//method reference
		Map<String, Integer> map2 = obj.convertListToMap(list, obj::getLength);
		System.out.println(map2);
	}
	
	public <T> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {
		Map<T, R> result = new HashMap<>();
		for(T t: list) {
			result.put(t, func.apply(t));
		}
		return result;
	}*/
		
	/*
		//when using a :: it is a method reference
		List<String> list = Arrays.asList("a","b","c","d");
		//stream is nothing but float data
		list.stream().map(String::toLowerCase).forEach(System.out::println);
	}*/
		
		/*Function<Integer, Integer> function = x->x*2;
		
		int result = function.apply(10);
		
		System.out.println(result);
		
		//if both the T and R or the first and second values in a Function are the same, just use
		//the Unary Operator
		UnaryOperator<Integer> operator = x->x*2;
		System.out.println(operator.apply(20));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> result2 = math(list,x->x*2);
		System.out.println(result2);
	}
	
	public static <T> List<T> math(List<T> list, UnaryOperator<T> unaryOperator) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			result.add(unaryOperator.apply(t));
		}
		return result;
	}*/
		
	/*	//Create
		
		
		
		List<String> list = Arrays.asList("a","b","c","d");
		List<String> resultList = map(list, x->sha256(x));
		
		for (String string : resultList) {
			System.out.println(string);
		}
	}
	
	//default password
	
	
	//default random password
	public static <T,R> List<R> map(List<T> list, Function<T, R> func) {
		List<R> result = new ArrayList<>();
		
		for (T t : list) {
			result.add(func.apply(t));
			//whatever the lambda expression we will write it -> will it be applied here? 
		}
		return result;
	}
	
	public static String sha256(String str) {
		//puts the string value into hexadecimal
		return DigestUtils.sha256Hex(str);
	}*/
	
		/*	//createa list of type integer which will hold only integer values:
		List<Integer> listInt = Arrays.asList(1,3,4,5,6);
		System.out.println(sum(listInt));
		//create a list of type double which will hold only double values
		List<Double> doubleList = Arrays.asList(1.0,2.0,3.0);
		System.out.println(sum(doubleList));
	}
	//super is used to hold the data 
	//extends is used to get the data
	private static double sum(List<? extends Number> list) {
		double result = 0;
		for(Number number : list) {
			result += number.doubleValue();
		}
		return result;
		
	}*/
		/*
		Function<String, Integer> function = x-> x.length();
		//x : string
		Function<Integer, Integer> function2 = x->x*2;
		
		 List<Integer> integers = Arrays.asList(1,2,3,4,5);
		 List<? super Number> numbers = new ArrayList<Number>();
		 
		 //List<? super A? means that the list is typed to either class A or a superclass of A.
		 numbers.add(new Integer(5));
		 numbers.add(new Double(10.4));
		 
		 System.out.println(numbers);
		 
		 //extends A : a list of objects that are instances of class A or subclasses of A
		
		//function1's output is the input for function2
		Integer result = function.andThen(function2).apply("abhinandan");
		System.out.println(result);
		
		
		int a = function.apply("abhinandan");
		System.out.println(a);
		//since this function is getting a variable and creating a return statement at the same time it will
		//print out the return fuction.  the left side is the argument and the right side is the return statement
		*/ 
		
		/*
		 * FunctionalInterfaceDemo demo2 = new FunctionalInterfaceDemo() {
		 * 
		 * @Override public void sample() { // TODO Auto-generated method stub
		 * System.out.println("hello from sample"); }
		 * 
		 * @Override public String test() { // TODO Auto-generated method stub return
		 * "new value"; } }; //tradional approach
		 * 
		 * //lambda expression FunctionalInterfaceDemo demo =
		 * ()->{System.out.println("hello from java 8");};
		 * 
		 * String result = demo.test(); System.out.println(result); demo.sample();
		 * FunctionalInterfaceDemo.display();
		 */
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
	//}

}
