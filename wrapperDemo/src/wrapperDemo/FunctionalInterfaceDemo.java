package wrapperDemo;

//in order to make sure its a functional interface it needs this line of code
@FunctionalInterface
public interface FunctionalInterfaceDemo {

	//functionalInterface must have only one abstract method
	public void sample();
	
	
	//one abstract method + it can have many default methods / static methods
	public static void display() {
		System.out.println("hello from display");
	}//default method
	
	public default String test() {
		return "test";
	}
}
