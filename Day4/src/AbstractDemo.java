
public abstract class AbstractDemo {
	int a = 10;
	public abstract void demo();
	
	public abstract void test();
	
	//concreate method
	public void test2() {
		System.out.println("Test is called.");
	}
	//we can declare from the abstract constructor
	public AbstractDemo() {
		System.out.println("Hello from Abstract Constructor");
	}
	public static void display() {
		System.out.println("Hello from display method");
	}
}
