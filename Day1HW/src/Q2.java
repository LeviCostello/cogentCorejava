import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a bill for food bought at a theater
		//variables
		int pizza = 0;
		int puffs = 0;
		int drink = 0;
		int amount = 0;
		//pizza=100 buffs=20 drink=10
		//scan values
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("No. of Pizza: ");
		pizza = scan.nextInt();
		System.out.print("No. of Puffs: ");
		puffs = scan.nextInt();
		System.out.print("No. of Drinks: ");
		drink = scan.nextInt();
		//Calculation
		amount = (pizza * 100) + (puffs * 20) + (drink * 10);
		System.out.println("Total Price: " + amount);
	}

}
