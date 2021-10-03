
public class Main {

	public static void main(String[] args) {
		//can't create the instance
		//AbstractDemo abstractDemo = new AbstractDemo();
		//can create a reference
		AbstractDemo abstractDemo = new Demo();
		
		abstractDemo.test();
		abstractDemo.test2();
		abstractDemo.display();
		
		System.out.println(abstractDemo.a);
		//doesn't work cause abstract demo parent doesn't have it and the child class demo has it so it can't be run
		//main is acting as a parent class to display all of these
		//abstractDemo.sample();
	}

}
